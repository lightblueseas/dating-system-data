package de.alpharogroup.db.init;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import de.alpharogroup.dating.system.db.init.DatabaseInitialization;
import de.alpharogroup.resourcebundle.properties.PropertiesExtensions;


/**
 * The Class InitializeDatabase.
 */
public class InitializeDatabase {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws ClassNotFoundException
	 *             occurs if a class has not been found
	 * @throws SQLException
	 *             Signals that an sql error has occurred.
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(final String[] args) throws ClassNotFoundException,
			SQLException, IOException {
		Properties dbProperties = PropertiesExtensions.loadProperties("jdbc.properties");
		new DatabaseInitialization(dbProperties).initializeDatabase();
	}

}
