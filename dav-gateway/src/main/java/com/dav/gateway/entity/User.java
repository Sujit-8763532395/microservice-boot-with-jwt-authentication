package com.dav.gateway.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "login_user", schema = "user_details", catalog = "user_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = 3411429084975763614L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "name")
	String name;

	@Column(name = "user_name")
	String userName;

	@Column(name = "password")
	String password;

	@Column(name = "email")
	String email;

	@Column(name = "mobile_no")
	String mobile;

	@Column(name = "address")
	String address;

	@Column(name = "is_enabled")
	Boolean isEnabled;

	@Column(name = "is_account_non_locked")
	Boolean isAccountNonLocked;

	@Column(name = "is_confirm")
	Boolean isConfirm;

	@Column(name = "created_by")
	String createdBy;

	@Column(name = "created_date")
	Date createdDate;

	@Column(name = "updated_by")
	String updatedBy;

	@Column(name = "updated_date")
	Date updatedDate;

}
	