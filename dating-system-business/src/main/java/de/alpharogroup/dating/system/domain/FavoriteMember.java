package de.alpharogroup.dating.system.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import de.alpharogroup.domain.BaseDomainObject;
import de.alpharogroup.user.management.domain.User;

@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class FavoriteMember extends BaseDomainObject<Integer> {
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** Field mapping */
	private User owner;

	/** The reference to the user profile for this notice. */
	private UserProfileBusinessObject favorite;
}
