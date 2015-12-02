package de.alpharogroup.dating.system.dbunit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.SQLException;

import de.alpharogroup.file.search.PathFinder;
import de.alpharogroup.io.StreamExtensions;
import de.alpharogroup.jdbc.ConnectionsExtensions;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.stream.StreamingDataSet;
import org.dbunit.dataset.xml.FlatXmlProducer;
import org.dbunit.operation.DatabaseOperation;
import org.xml.sax.InputSource;

/**
 * The Class DatabaseImportExample.
 * 
 * @author Asterios Raptis
 */
public class DatabaseImport {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 * @throws SQLException
	 *             the sQL exception
	 * @throws DatabaseUnitException
	 *             the database unit exception
	 * @throws IOException
	 */
	public static void main(final String[] args) throws ClassNotFoundException,
			SQLException, DatabaseUnitException, IOException {

		final IDatabaseConnection connection = PostgresqlDatabaseConnectionSingleton.getInstance();

		File srcTestResourcesDir = PathFinder.getSrcTestResourcesDir();
		File dbunitDir = new File(srcTestResourcesDir, "dbunit");
		File datasetXml = new File(dbunitDir, "dataset.xml");
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				datasetXml), Charset.forName("UTF-8"));

		final FlatXmlProducer producer = new FlatXmlProducer(new InputSource(
				isr));
		producer.setValidating(true);
		final IDataSet dataSet = new StreamingDataSet(producer);
		DatabaseOperation.REFRESH.execute(connection, dataSet);

	}

	protected static void initializeDatabase(final Connection jdbcConnection)
			throws IOException, SQLException {
		// The resources destination dir
		final File resDestDir = PathFinder.getSrcMainResourcesDir();
		// Get the sql dir...
		final File sqlDir = new File(resDestDir, "dll");
		final File insertsDir = new File(sqlDir, "inserts");
		// The insert sql script...

		File insertAllTopics = new File(insertsDir, "insertIntoTopics.sql");

		File insertCountries = new File(insertsDir, "insertCountries.sql");
		File insertFederalStates = new File(insertsDir,
				"insertAllFederalStates.sql");

		ConnectionsExtensions.executeSqlScript((BufferedReader) StreamExtensions
				.getReader(insertAllTopics, "UTF-8", false), jdbcConnection);
		ConnectionsExtensions.executeSqlScript((BufferedReader) StreamExtensions
				.getReader(insertCountries, "UTF-8", false), jdbcConnection);
		ConnectionsExtensions
				.executeSqlScript((BufferedReader) StreamExtensions.getReader(
						insertFederalStates, "UTF-8", false), jdbcConnection);
	}

}
