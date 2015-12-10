package de.alpharogroup.dating.system.domain;

import de.alpharogroup.domain.BaseDomainObject;
import de.alpharogroup.user.management.domain.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class ProfileNotice extends BaseDomainObject<Integer> {
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The notice for this user profile.*/
	private String notice;
	
	/**
	 * The user attribute that references to the Entity class {@link User}
	 * that owns the notice for this user profile.
	 */
	private User user;
	/** The reference to the user profile for this notice. */
	private UserProfile userProfile;
}
