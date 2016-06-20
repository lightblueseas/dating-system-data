package de.alpharogroup.dating.system.domain;

import de.alpharogroup.domain.BaseDomainObject;
import de.alpharogroup.user.management.enums.GenderType;
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
public class SearchCriteria extends BaseDomainObject<Integer> {
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The age search criteria starting 'from'. */
	private Integer fromAge;
	
	/** The gender search criteria 'search'. */
	private GenderType searchGender;
	
	/** The age search criteria ending 'until'. */
	private Integer untilAge;
}
