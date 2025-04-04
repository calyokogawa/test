package com.example.webapp.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * ユーザーの認証情報を表すUserDetails実装クラス
 */
public class LoginUser extends User {
	// 【追加部分】追加のフィールド
	private String displayname;
	/**
	 * 最低限の情報を保持したUserDetails
	 * 実装クラスUserを作成する
	 */
	public LoginUser(String username,
			String password,
			Collection<? extends GrantedAuthority> authorities,
			String displayname) {
		super(username, password, authorities);
		this.displayname = displayname;
	}
	
	// 【追加部分】displaynameのgetter
	public String getDisplayname() {
		return displayname;
	}

}
