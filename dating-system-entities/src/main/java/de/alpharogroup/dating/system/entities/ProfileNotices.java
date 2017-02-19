package de.alpharogroup.dating.system.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import de.alpharogroup.db.entity.BaseEntity;
import de.alpharogroup.lang.object.CompareObjectExtensions;
import de.alpharogroup.user.entities.Users;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Entity class {@link ProfileNotices} is keeping the
 * information for the notices for a profile from a user.
 */
@Entity
@Table(name = "profile_notice")
@Getter
@Setter
@NoArgsConstructor
public class ProfileNotices 
extends BaseEntity<Integer>
implements Cloneable, Comparable<ProfileNotices> {
	
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The notice for this user profile.*/
	@Column( name="notice", length = 1000  )
	private String notice;
	
	/**
	 * The user attribute that references to the Entity class {@link Users}
	 * that owns the notice for this user profile.
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = true, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_PROFILE_NOTICE_USER_ID"))
	private Users user;
	/** The reference to the user profile for this notice. */
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "user_profile")
	private UserProfiles userProfile;
	
    /**
     * {@inheritDoc}
     */
	@Override
	public int compareTo(ProfileNotices o) {
		return CompareObjectExtensions.compareToQuietly(this.getUser(), o.getUser(), "username");
	}

}
