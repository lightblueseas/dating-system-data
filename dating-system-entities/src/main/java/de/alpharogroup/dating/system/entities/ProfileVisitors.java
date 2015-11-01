package de.alpharogroup.dating.system.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

import de.alpharogroup.db.entity.BaseEntity;
import de.alpharogroup.user.management.entities.Users;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



/**
 * Object mapping for hibernate-handled table: profile_visitors
 * author: auto-generated.
 */
@Entity
@Table(name="profile_visitors")
@Getter
@Setter
@NoArgsConstructor
public class ProfileVisitors 
extends BaseEntity<Integer>
implements Cloneable {
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 7152349023775145105L;
	
	/** Shows the last Date that the visitor visited this profile. */
	@Column( name="visiting_date"  )
	private Date visitingDate;	
	/** The visitor of this profile. */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "visitor_id", nullable = true, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_PROFILE_VISITORS_VISITOR_ID"))
	private Users visitor;	
	/** The visited profile. */
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "visited_profile")
	private UserProfile visitedProfile;
	/** The count shows how many times a visitor visited this profile. */
	@Column(name = "count", nullable = true)	
	private Integer count;	

}