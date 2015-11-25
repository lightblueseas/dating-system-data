package de.alpharogroup.dating.system.client.models;

import de.alpharogroup.user.management.entities.Users;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The class {@link UpdateProfileModel}.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper=true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProfileModel extends ProfileModel {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The profile visitor. */
	private Users profileVisitor;

}
