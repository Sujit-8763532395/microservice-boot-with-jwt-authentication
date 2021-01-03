package com.dav.gateway.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dav.gateway.entity.User;
import com.dav.gateway.entity.UserRole;
import com.dav.gateway.model.AuthRequest;
import com.dav.gateway.security.JwtUtil;
import com.dav.gateway.service.UserService;

@RestController
@RequestMapping("/gateway")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private Environment env;
	
	@Autowired
    private AuthenticationManager authenticationManager;
	
	@Autowired
    private JwtUtil jwtUtil;
	
	@Autowired
    private UserService userService;

	@RequestMapping("/")
	public String home() {
		return "Hello DAV Gateway Running At Port: " + env.getProperty("local.server.port");
	}
	
	@PostMapping("/authenticate")
    public String authenticateUser(@RequestBody AuthRequest authRequest) throws Exception {
        
		try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("Invalid Username Or Password");
        }
		
		String roleCode = null;
		String roleName = null;
		if(authRequest.getUserName() != null) {
			User user = userService.findUserByUserName(authRequest.getUserName()); 
			UserRole userRole = userService.getPrimaryRoleByUserId(user.getId());  
			roleCode = userRole.getRole().getRoleName();
			roleName = userRole.getRole().getDisplayName(); 
		}
		
        return jwtUtil.generateToken(authRequest.getUserName(), roleCode, roleName); 
    }

}
	