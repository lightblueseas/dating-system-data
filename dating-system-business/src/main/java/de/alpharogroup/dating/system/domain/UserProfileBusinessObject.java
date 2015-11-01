package de.alpharogroup.dating.system.domain;

import de.alpharogroup.dating.system.enums.EducationState;
import de.alpharogroup.dating.system.enums.FigureType;
import de.alpharogroup.dating.system.enums.HaircolorType;
import de.alpharogroup.dating.system.enums.InterestsType;
import de.alpharogroup.dating.system.enums.RelationshipState;
import de.alpharogroup.dating.system.enums.SmokerState;
import de.alpharogroup.dating.system.enums.ZodiacSignType;
import de.alpharogroup.db.domain.BaseBusinessObject;
import de.alpharogroup.resource.system.domain.Resource;
import de.alpharogroup.user.management.domain.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class UserProfileBusinessObject extends BaseBusinessObject<Integer> {
	/** The serial Version UID. */
	private static final long serialVersionUID = 8626651299912885319L;
	/** Field mapping */
	private Integer age;	
	/** Field mapping */
	private EducationState educationState;	
	/** Field mapping */
	private FigureType figure;	
	/** Field mapping */
	private HaircolorType haircolor;	
	/** Field mapping */
	private Integer height;	
	/** Field mapping */
	private InterestsType interests;	
	/** Field mapping */
	private String occupation;	
	/** Field mapping */
	private String profileText;	
	/** Field mapping */
	private RelationshipState relationshipState;
	/** Field mapping */
    private SearchCriteriaBusinessObject searchCriteria;	
	/** Field mapping */
	private SmokerState smokerstate;	
	/** The user attribute that references to the Entity class {@link User}. */
	private User user;
	/**
	 * The image from the profile. The userImage attribute that references to the Entity class {@link Resource
	 * }.
	 */
	private Resource userImage;
	/** Field mapping */
	private Integer weight;
	/** Field mapping */
	private ZodiacSignType zodiacSign;
}
