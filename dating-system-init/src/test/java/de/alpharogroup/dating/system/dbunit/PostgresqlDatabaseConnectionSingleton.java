/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *  *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *  *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.dating.system.dbunit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.ext.postgresql.PostgresqlDataTypeFactory;

import de.alpharogroup.jdbc.ConnectionsExtensions;
import de.alpharogroup.resourcebundle.properties.PropertiesExtensions;

/**
 * The Class PostgresqlDatabaseConnectionSingleton holds an instance for the db
 * connection with dbunit for im- and export of a database.
 */
public final class PostgresqlDatabaseConnectionSingleton {

	/** The connection. */
	private static IDatabaseConnection connection;

	/**
	 * Gets a list with all postgresql enum names.
	 *
	 * @return the enum names
	 */
	protected static List<String> getEnumNames() {
		List<String> enumNames = new ArrayList<String>();
		enumNames.add("contactmethodtype");
		enumNames.add("educationstate");
		enumNames.add("figuretype");
		enumNames.add("friendshiprequeststate");
		enumNames.add("gendertype");
		enumNames.add("haircolortype");
		enumNames.add("intereststype");
		enumNames.add("messagestatetype");
		enumNames.add("messagetypetype");
		enumNames.add("visibilitytype");
		enumNames.add("relationshipstate");
		enumNames.add("smokerstatetype");
		enumNames.add("zodiacsigntype");
		enumNames.add("ruleviolationreasontype");
		return enumNames;
	}

	/**
	 * Gets the single instance of PostgresqlDatabaseConnectionSingleton.
	 *
	 * @return single instance of PostgresqlDatabaseConnectionSingleton
	 * @throws DatabaseUnitException
	 *             the database unit exception
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 * @throws SQLException
	 *             the SQL exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static synchronized IDatabaseConnection getInstance()
			throws DatabaseUnitException, ClassNotFoundException, SQLException, IOException {
		if (connection == null) {
			connection = setFactory(getJdbcConnection());
		}
		return connection;
	}

	/**
	 * Gets the jdbc connection.
	 *
	 * @return the jdbc connection
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 * @throws SQLException
	 *             the SQL exception
	 */
	protected static Connection getJdbcConnection() throws IOException, ClassNotFoundException, SQLException {
		Properties dbProperties = PropertiesExtensions.loadProperties("project.properties");
		String dbHost = dbProperties.getProperty("jdbc.host");
		String dbName = dbProperties.getProperty("jdbc.db.name");
		String dbUser = dbProperties.getProperty("jdbc.user");
		String dbPassword = dbProperties.getProperty("jdbc.password");
		// Get jdbc connection...
		final Connection jdbcConnection = ConnectionsExtensions.getPostgreSQLConnection(dbHost, dbName, dbUser,
				dbPassword);
		return jdbcConnection;
	}

	/**
	 * Sets the factory.
	 *
	 * @param jdbcConnection
	 *            the jdbc connection
	 * @return the i database connection
	 * @throws DatabaseUnitException
	 *             the database unit exception
	 */
	protected static IDatabaseConnection setFactory(final Connection jdbcConnection) throws DatabaseUnitException {
		// Create the dbunit database connection...
		IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);
		// Get database configuration...
		DatabaseConfig dbConfig = connection.getConfig();
		// Override the method to get a valid result...
		PostgresqlDataTypeFactory factory = new PostgresqlDataTypeFactory() {
			public boolean isEnumType(String sqlTypeName) {
				for (String enumName : getEnumNames()) {
					if (sqlTypeName.equalsIgnoreCase(enumName)) {
						return true;
					}
				}
				return false;
			}
		};
		// set the appropriate DataTypeFactory...
		dbConfig.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, factory);
		return connection;
	}
}
