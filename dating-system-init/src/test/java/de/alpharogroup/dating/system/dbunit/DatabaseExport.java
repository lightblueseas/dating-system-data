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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.SQLException;

import de.alpharogroup.file.search.PathFinder;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseSequenceFilter;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.FilteredDataSet;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.filter.ITableFilter;
import org.dbunit.dataset.xml.FlatDtdDataSet;
import org.dbunit.dataset.xml.FlatXmlWriter;

/**
 * The Class DatabaseExport.
 * 
 * @author Asterios Raptis
 */
public class DatabaseExport {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws Exception
	 *             the exception
	 */
	public static void main(final String[] args) throws ClassNotFoundException,
			SQLException, DatabaseUnitException, FileNotFoundException,
			IOException {

		final IDatabaseConnection connection = PostgresqlDatabaseConnectionSingleton.getInstance();
		
		// automatically order tables by their foreign keys
		final ITableFilter filter = new DatabaseSequenceFilter(connection);
		final IDataSet dataset = new FilteredDataSet(filter,
				connection.createDataSet());
		// The resources destination dir
		final File srcTestResourcesDir = PathFinder.getSrcTestResourcesDir();
		File dbunitDir = new File(srcTestResourcesDir, "dbunit");
		File datasetDtd = new File(dbunitDir, "dataset.dtd");
		File datasetXml = new File(dbunitDir, "dataset.xml");
		// write DTD file
		FlatDtdDataSet.write(dataset, new FileOutputStream(datasetDtd));
		// write XML file
		FileOutputStream fos = new FileOutputStream(datasetXml);
		BufferedOutputStream bos = new BufferedOutputStream( fos );
		OutputStreamWriter osw = new OutputStreamWriter( bos, "UTF-8" );
		final FlatXmlWriter datasetWriter = new FlatXmlWriter(
				osw, "UTF-8");
		datasetWriter.setDocType("dataset.dtd");
		datasetWriter.write(dataset);

	}

}
