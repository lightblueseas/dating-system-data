package de.alpharogroup.dating.system.domain;

import java.util.Date;

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
public class ProfileVisitor extends BaseDomainObject<Integer> {
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/** Shows the last Date that the visitor visited this profile. */
	private Date visitingDate;	
	/** The visitor of this profile. */
	private User visitor;	
	/** The visited profile. */
	private UserProfileBusinessObject visitedProfile;
	/** The count shows how many times a visitor visited this profile. */
	private Integer count;
}
