/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *  *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *  *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.dating.system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import de.alpharogroup.db.entity.BaseEntity;
import de.alpharogroup.user.management.enums.GenderType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Object mapping for hibernate-handled table: search_criteria. Used for the
 * users profile search.
 */
@Entity
@Table(name = "search_criteria")
@TypeDefs({
		@TypeDef(name = "genderConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = {
				@Parameter(name = "enumClassName", value = "de.alpharogroup.user.management.enums.GenderType") }) })
@Getter
@Setter
@NoArgsConstructor
public class SearchCriterias extends BaseEntity<Integer> implements Cloneable {

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The age search criteria starting 'from'. */
	@Column(name = "from_age")
	private Integer fromAge;

	/** The gender search criteria 'search'. */
	@Enumerated(EnumType.STRING)
	@Column(name = "search_gender")
	@Type(type = "genderConverter")
	private GenderType searchGender;

	/** The age search criteria ending 'until'. */
	@Column(name = "until_age")
	private Integer untilAge;

}
