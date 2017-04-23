# Overview

Parent project that holds module projects for the persistence of user data for dating.

The project holds backend data for the persistence of user data for dating.

# ERD-Diagramm

The erd-diagramm for this database looks as follows: ![erd-diagramm](https://raw.githubusercontent.com/lightblueseas/dating-system-data/develop/dating-system-init/src/main/resources/erd/dating-system-erd.jpa.png)

This erd-diagramm was created with [Jeddict plugin from netbeans as JPA Modeler](http://plugins.netbeans.org/plugin/53057/jpa-modeler)  and [Jeddict](https://jeddict.github.io/)

## License

The source code comes under the liberal MIT License, making dating-system-data great for all types of dating applications.

# Build status
[![Build Status](https://travis-ci.org/lightblueseas/dating-system-data.svg?branch=master)](https://travis-ci.org/lightblueseas/dating-system-data)

## Maven Central

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/dating-system-data/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/dating-system-data)

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~dating-system-data~~~) for latest snapshots and releases.

Add the following maven dependencies to your project `pom.xml` if you want to import the core functionality:

You can first define the version properties:

	<properties>
			...
		<!-- dating-system-data version -->
		<dating-system-data.version>3.11.0</dating-system-data.version>
		<dating-system-business.version>${dating-system-data.version}</dating-system-business.version>
		<dating-system-domain.version>${dating-system-data.version}</dating-system-domain.version>
		<dating-system-entities.version>${dating-system-data.version}</dating-system-entities.version>
		<dating-system-init.version>${dating-system-data.version}</dating-system-init.version>
		<dating-system-rest-api.version>${dating-system-data.version}</dating-system-rest-api.version>
		<dating-system-rest-client.version>${dating-system-data.version}</dating-system-rest-client.version>
		<dating-system-rest-web.version>${dating-system-data.version}</dating-system-rest-web.version>
			...
	</properties>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of dating-system-business:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>dating-system-business</artifactId>
				<version>${dating-system-business.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of dating-system-domain:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>dating-system-domain</artifactId>
				<version>${dating-system-domain.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of dating-system-entities:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>dating-system-entities</artifactId>
				<version>${dating-system-entities.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of dating-system-init:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>dating-system-init</artifactId>
				<version>${dating-system-init.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of dating-system-rest-api:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>dating-system-rest-api</artifactId>
				<version>${dating-system-rest-api.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of dating-system-rest-client:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>dating-system-rest-client</artifactId>
				<version>${dating-system-rest-client.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of dating-system-rest-web:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>dating-system-rest-web</artifactId>
				<version>${dating-system-rest-web.version}</version>
			</dependency>
			...
		</dependencies>
		 
## Open Issues
[![Open Issues](https://img.shields.io/github/issues/astrapi69/dating-system-data.svg?style=flat)](https://github.com/astrapi69/dating-system-data/issues) 

## Want to Help and improve it? ###

The source code for dating-system-data are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [lightblueseas/dating-system-data/fork](https://github.com/lightblueseas/dating-system-data/fork)

To share your changes, [submit a pull request](https://github.com/lightblueseas/dating-system-data/pull/new/master).

Don't forget to add new units tests on your changes.

## Contacting the Developer

Do not hesitate to contact the dating-system-data developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/lightblueseas/dating-system-data/issues).

## Note

No animals were harmed in the making of this library.

# Donate

If you like this library, please consider a donation through 
<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Flightblueseas%2Fdating-system-data" target="_blank">
<img src="http://button.flattr.com/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0">
</a>
