package de.alpharogroup.dating.system.domain;

import de.alpharogroup.rating.system.domain.Rating;
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
public class ProfileRating extends Rating<Integer> {
	
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	/** The rated profile. */
	private UserProfile ratedProfile;
}
