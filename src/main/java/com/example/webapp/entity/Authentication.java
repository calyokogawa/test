package com.example.webapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authentication {
	/** ユーザー名 */
	private String username;
	/** パスワード */
	private String password;
	/** 権限 */
	private Role authority;
	/** 表示名 */
	private String displayname;

}
