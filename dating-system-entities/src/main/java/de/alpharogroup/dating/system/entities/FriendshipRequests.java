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

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import de.alpharogroup.dating.system.enums.FriendshipRequestsState;
import de.alpharogroup.db.entity.BaseEntity;
import de.alpharogroup.user.entities.Users;


/** 
 * Object mapping for hibernate-handled table: friendship_requests
 * author: auto-generated
 */
@Entity
@Table(name="friendship_requests")
@TypeDef(name = "friendshipRequestsStateConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = { @Parameter(name = "enumClassName", value = "de.alpharogroup.dating.system.enums.FriendshipRequestsState") })
@Getter
@Setter
@NoArgsConstructor
public class FriendshipRequests 
extends BaseEntity<Integer>
implements Cloneable {
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	/** Field mapping */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "requested_user_id", nullable = true, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_FRIENDSHIPREQUESTS_R_USER_ID"))
	private Users requestedUser;	
	/** Field mapping */
	@Column( name="state"  )	
	@Enumerated(EnumType.STRING)	
	@Type(type = "friendshipRequestsStateConverter")
	private FriendshipRequestsState state;	
	/** Field mapping */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "requestor_id", nullable = true, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_FRIENDSHIPREQUESTS_REQUESTOR_ID"))
	private Users requestor;
	/** Shows the Date that the friendship is accepted. */
	@Column( name="accepted_date"  )
	private Date acceptedDate;	
	
}