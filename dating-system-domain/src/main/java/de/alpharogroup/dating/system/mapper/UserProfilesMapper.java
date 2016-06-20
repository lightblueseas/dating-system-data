package de.alpharogroup.dating.system.mapper;

import org.springframework.stereotype.Component;

import de.alpharogroup.dating.system.domain.UserProfile;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.db.entitymapper.AbstractEntityDOMapper;

/**
 * The class {@link UserProfilesMapper}.
 */
@Component
public class UserProfilesMapper extends AbstractEntityDOMapper<UserProfiles, UserProfile> {

}
