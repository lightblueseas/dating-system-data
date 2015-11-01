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
import de.alpharogroup.user.management.entities.Users;


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