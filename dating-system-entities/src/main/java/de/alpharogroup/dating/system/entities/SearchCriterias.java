package de.alpharogroup.dating.system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import de.alpharogroup.db.entity.BaseEntity;
import de.alpharogroup.user.management.enums.GenderType;

/**
 * Object mapping for hibernate-handled table: search_criteria.
 * Used for the users profile search.
 */
@Entity
@Table(name="search_criteria")
@TypeDefs({ 
	@TypeDef(name = "genderConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = { @Parameter(name = "enumClassName", value = "de.alpharogroup.user.management.enums.GenderType") }) })
@Getter
@Setter
@NoArgsConstructor
public class SearchCriterias 
extends BaseEntity<Integer>
implements Cloneable {
	
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The age search criteria starting 'from'. */
	@Column( name="from_age"  )
	private Integer fromAge;
	
	/** The gender search criteria 'search'. */
	@Enumerated(EnumType.STRING)
	@Column(name = "search_gender")
	@Type(type = "genderConverter")
	private GenderType searchGender;
	
	/** The age search criteria ending 'until'. */
	@Column( name="until_age"  )
	private Integer untilAge;
	
}
