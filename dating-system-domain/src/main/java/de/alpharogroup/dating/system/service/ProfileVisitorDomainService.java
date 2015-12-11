package de.alpharogroup.dating.system.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.ProfileVisitorsDao;
import de.alpharogroup.dating.system.domain.ProfileVisitor;
import de.alpharogroup.dating.system.entities.ProfileVisitors;
import de.alpharogroup.dating.system.mapper.ProfileVisitorsMapper;
import de.alpharogroup.dating.system.service.api.ProfileVisitorService;
import de.alpharogroup.service.domain.AbstractDomainService;

@Transactional
@Service("profileVisitorDomainService")
public class ProfileVisitorDomainService
	extends
		AbstractDomainService<Integer, ProfileVisitor, ProfileVisitors, ProfileVisitorsDao, ProfileVisitorsMapper>
	implements
		ProfileVisitorService
{

}
