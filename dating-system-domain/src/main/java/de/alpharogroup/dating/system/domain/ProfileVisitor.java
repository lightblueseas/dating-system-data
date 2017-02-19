package de.alpharogroup.dating.system.domain;

import java.util.Date;

import de.alpharogroup.domain.BaseDomainObject;
import de.alpharogroup.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
	private UserProfile visitedProfile;
	/** The count shows how many times a visitor visited this profile. */
	private Integer count;
}
