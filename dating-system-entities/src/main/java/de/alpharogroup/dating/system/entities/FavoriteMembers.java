package de.alpharogroup.dating.system.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import de.alpharogroup.db.entity.BaseEntity;
import de.alpharogroup.user.management.entities.Users;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Object mapping for hibernate-handled table: favorite_members author:
 * auto-generated
 */
@Entity
@Table(name = "favorite_members")
@Getter
@Setter
@NoArgsConstructor
public class FavoriteMembers extends BaseEntity<Integer> implements Cloneable {
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1335157141885208007L;

	/** Field mapping */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "owner_id", nullable = true, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_FAVORITE_MEMBERS_OWNER_ID"))
	private Users owner;

	/** The reference to the user profile for this notice. */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "favorite_id", nullable = true, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_FAVORITE_MEMBERS_FAVORITE_ID"))
	private UserProfiles favorite;

}