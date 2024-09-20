package com.example.webapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.webapp.entity.Authentication;
import com.example.webapp.entity.LoginUser;
import com.example.webapp.entity.Role;
import com.example.webapp.repository.AuthenticationMapper;

import lombok.RequiredArgsConstructor;

/**
 * カスタム認証サービス
 */
@Service
@RequiredArgsConstructor
public class LoginUserDatailsServiceImpl implements UserDetailsService {
	/** DI*/
	private final AuthenticationMapper authenticationMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		// 「認証テーブル」からデータを取得
		Authentication authentication = authenticationMapper.selectByUsername(username);
		
		// 対象データがあれば、UserDetailsの実装クラスを返す
		if (authentication != null) {
			// 対象データが存在する
			// UserDetailsの実装クラスを返す
			return new LoginUser(authentication.getUsername(),
					authentication.getPassword(),
					getAuthorityList(authentication.getAuthority()),
					authentication.getDisplayname()
					);
			} else {
			// 対象データが存在しない
			throw new UsernameNotFoundException(
			username + " => 指定しているユーザー名は存在しません");
			}
			}
			/**
			* 権限情報をリストで取得する
			*/
			private List<GrantedAuthority> getAuthorityList(Role role) {
			// 権限リスト
			List<GrantedAuthority> authorities = new ArrayList<>();
			// 列挙型からロールを取得
			authorities.add(new SimpleGrantedAuthority(role.name()));
			// ADMIN ロールの場合、USERの権限も付与
			if (role == Role.ADMIN) {
			authorities.add(
			new SimpleGrantedAuthority(Role.USER.toString()));
			}
			return authorities;
			}
}
