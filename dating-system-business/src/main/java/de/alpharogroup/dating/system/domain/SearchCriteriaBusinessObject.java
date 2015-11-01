package de.alpharogroup.dating.system.domain;

import de.alpharogroup.db.domain.BaseBusinessObject;
import de.alpharogroup.user.management.enums.Gender;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class SearchCriteriaBusinessObject extends BaseBusinessObject<Integer> {
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The age search criteria starting 'from'. */
	private Integer fromAge;
	
	/** The gender search criteria 'search'. */
	private Gender searchGender;
	
	/** The age search criteria ending 'until'. */
	private Integer untilAge;
}
