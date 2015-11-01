package de.alpharogroup.dating.system.service.locator;

import java.io.Serializable;

public interface IServiceLocatorModel extends Serializable {

	/**
	 * Gets the service locator.
	 * 
	 * @return the service locator
	 */
	ServiceLocator getServiceLocator();
}
