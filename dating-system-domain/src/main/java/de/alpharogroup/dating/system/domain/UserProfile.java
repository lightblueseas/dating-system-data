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
package de.alpharogroup.dating.system.domain;

import de.alpharogroup.dating.system.enums.EducationState;
import de.alpharogroup.dating.system.enums.FigureType;
import de.alpharogroup.dating.system.enums.HaircolorType;
import de.alpharogroup.dating.system.enums.InterestsType;
import de.alpharogroup.dating.system.enums.RelationshipState;
import de.alpharogroup.dating.system.enums.SmokerState;
import de.alpharogroup.dating.system.enums.ZodiacSignType;
import de.alpharogroup.domain.BaseDomainObject;
import de.alpharogroup.resource.system.domain.Resource;
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
public class UserProfile extends BaseDomainObject<Integer> {
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
    private SearchCriteria searchCriteria;	
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
