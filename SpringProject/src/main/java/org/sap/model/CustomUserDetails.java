package org.sap.model;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails, Serializable {
	private static final long serialVersionUID = 174726374856727L;
	private String id;
	private String password;
	private String name;
	private String email;
	private boolean emailVerified;
	private boolean locked;
	private Collection<GrantedAuthority> authorities;
	
	@Override
	public Collection<?extends GrantedAuthority> getAuthorities(){
		return authorities;
	}

	@Override
    public String getPassword() {
        return password;
    }
	
	@Override
	public String getUsername() {
        return id;
    }
	
	
    /**
     * 계정 만료 여부
     * true : 만료 안됨
     * false : 만료
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 계정 잠김 여부
     * true : 잠기지 않음
     * false : 잠김
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return locked;
    }

    /**
     * 비밀번호 만료 여부
     * true : 만료 안됨
     * false : 만료
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }


    /**
     * 사용자 활성화 여부
     * true : 활성화
     * false : 비활성화
     * @return
     */
    @Override
    public boolean isEnabled() {
        //이메일이 인증되어 있고 계정이 잠겨있지 않으면 true
        return (emailVerified && !locked);
    }

	
	
	
}
