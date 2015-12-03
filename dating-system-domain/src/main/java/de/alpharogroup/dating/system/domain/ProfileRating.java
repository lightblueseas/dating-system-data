package de.alpharogroup.dating.system.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import de.alpharogroup.rating.system.domain.Rating;

@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class ProfileRating extends Rating<Integer> {
	
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	/** The rated profile. */
	private UserProfileBusinessObject ratedProfile;
}
