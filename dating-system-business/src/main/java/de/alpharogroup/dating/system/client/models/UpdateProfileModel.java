package de.alpharogroup.dating.system.client.models;

import de.alpharogroup.user.management.entities.Users;

public class UpdateProfileModel extends ProfileModel {
	
	private Users profileVisitor;

	private static final long serialVersionUID = 1L;

	public Users getProfileVisitor() {
		return profileVisitor;
	}

	public void setProfileVisitor(Users profileVisitor) {
		this.profileVisitor = profileVisitor;
	}

}
