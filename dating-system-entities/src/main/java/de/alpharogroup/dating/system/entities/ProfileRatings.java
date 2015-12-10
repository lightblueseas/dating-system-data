package de.alpharogroup.dating.system.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import de.alpharogroup.rating.system.entities.Ratings;

/**
 * The Class ProfileRatings extends the Ratings class that contains the general data for rating entities.
 */
@Entity
@Table(name = "profile_ratings")
@TypeDefs({ @TypeDef(
		name = "ratingVisibilityConverter", 
		typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, 
		parameters = { @Parameter(name = "enumClassName", value = "de.alpharogroup.rating.system.enums.RatingVisibility") }) })
@Getter
@Setter
@NoArgsConstructor
public class ProfileRatings extends Ratings {
	
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 5054268089145453933L;
	/** The rated profile. */
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "rated_profile")
	private UserProfiles ratedProfile;

}