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

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import de.alpharogroup.dating.system.enums.EducationState;
import de.alpharogroup.dating.system.enums.FigureType;
import de.alpharogroup.dating.system.enums.HaircolorType;
import de.alpharogroup.dating.system.enums.InterestsType;
import de.alpharogroup.dating.system.enums.RelationshipState;
import de.alpharogroup.dating.system.enums.SmokerState;
import de.alpharogroup.dating.system.enums.ZodiacSignType;
import de.alpharogroup.db.entity.BaseEntity;
import de.alpharogroup.resource.system.entities.Resources;
import de.alpharogroup.user.entities.Users;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Object mapping for hibernate-handled table: user_profile
 */
@Entity
@Table(name = "user_profile")
@TypeDefs({
		@TypeDef(name = "educationStateConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = {
				@Parameter(name = "enumClassName", value = "de.alpharogroup.dating.system.enums.EducationState") }),
		@TypeDef(name = "figureConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = {
				@Parameter(name = "enumClassName", value = "de.alpharogroup.dating.system.enums.FigureType") }),
		@TypeDef(name = "haircolorConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = {
				@Parameter(name = "enumClassName", value = "de.alpharogroup.dating.system.enums.HaircolorType") }),
		@TypeDef(name = "interestsConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = {
				@Parameter(name = "enumClassName", value = "de.alpharogroup.dating.system.enums.InterestsType") }),
		@TypeDef(name = "relationshipStateConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = {
				@Parameter(name = "enumClassName", value = "de.alpharogroup.dating.system.enums.RelationshipState") }),
		@TypeDef(name = "smokerstateConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = {
				@Parameter(name = "enumClassName", value = "de.alpharogroup.dating.system.enums.SmokerState") }),
		@TypeDef(name = "zodiacSignConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = {
				@Parameter(name = "enumClassName", value = "de.alpharogroup.dating.system.enums.ZodiacSignType") }) })
@Getter
@Setter
@NoArgsConstructor
public class UserProfiles extends BaseEntity<Integer> implements Cloneable {
	/** The serial Version UID. */
	private static final long serialVersionUID = 8626651299912885319L;
	/** Field mapping */
	@Column(name = "age")
	private Integer age;
	/** Field mapping */
	@Enumerated(EnumType.STRING)
	@Column(name = "education_state")
	@Type(type = "educationStateConverter")
	private EducationState educationState;
	/** Field mapping */
	@Column(name = "figure")
	@Enumerated(EnumType.STRING)
	@Type(type = "figureConverter")
	private FigureType figure;
	/** Field mapping */
	@Column(name = "haircolor")
	@Enumerated(EnumType.STRING)
	@Type(type = "haircolorConverter")
	private HaircolorType haircolor;
	/** Field mapping */
	@Column(name = "height")
	private Integer height;
	/** Field mapping */
	@Column(name = "interests")
	@Enumerated(EnumType.STRING)
	@Type(type = "interestsConverter")
	private InterestsType interests;
	/** Field mapping */
	@Column(name = "occupation", length = 50)
	private String occupation;
	/** Field mapping */
	@Column(name = "profile_text", length = 1000)
	private String profileText;
	/** Field mapping */
	@Column(name = "relationship_status")
	@Enumerated(EnumType.STRING)
	@Type(type = "relationshipStateConverter")
	private RelationshipState relationshipState;
	/** Field mapping */
	@OneToOne
	@JoinColumn(name = "search_criteria")
	private SearchCriterias searchCriteria;
	/** Field mapping */
	@Column(name = "smokerstate")
	@Enumerated(EnumType.STRING)
	@Type(type = "smokerstateConverter")
	private SmokerState smokerstate;
	/** The user attribute that references to the Entity class {@link Users}. */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = true, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_USER_PROFILE_USER_ID"))
	private Users user;
	/**
	 * The image from the profile. The userImage attribute that references to
	 * the Entity class {@link Resources }.
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "image_id", nullable = true, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_PROFILE_IMAGE_ID"))
	private Resources userImage;
	/** Field mapping */
	@Column(name = "weight")
	private Integer weight;
	/** Field mapping */
	@Column(name = "zodiac_sign")
	@Enumerated(EnumType.STRING)
	@Type(type = "zodiacSignConverter")
	private ZodiacSignType zodiacSign;

}