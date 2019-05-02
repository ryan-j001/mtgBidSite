package com.mtg;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Objects;

/**
 * Created by ryanj on 5/23/2017.
 */
public class ApplicationUser extends User{

	private static final long serialVersionUID = 1L;
	private final String email;

	public ApplicationUser(UserDetail userDetail,
						   boolean enabled,
						   boolean accountNonExpired, boolean credentialsNonExpired,
						   boolean accountNonLocked,
						   Collection<GrantedAuthority> authorities
						   ) {
		super(userDetail.getUserName(), userDetail.getPassword(), enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);
		this.email = userDetail.getEmail();
	}

	public String getEmail() {
		return email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		ApplicationUser that = (ApplicationUser) o;
		return getEmail().equals(that.getEmail());
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), getEmail());
	}
}


