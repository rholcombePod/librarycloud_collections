/**********************************************************************
 * Copyright (c) 2012 by the President and Fellows of Harvard College
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA.
 *
 * Contact information
 *
 * Office for Information Systems
 * Harvard University Library
 * Harvard University
 * Cambridge, MA  02138
 * (617)495-3724
 * hulois@hulmail.harvard.edu
 **********************************************************************/
package edu.harvard.lib.librarycloud.collections;

import java.util.Properties;

import javax.servlet.ServletContext;

/**
*
* Config is the standard LTS class for accessing properties from a properties file,
*
*/

public class Config {
	
	public String SQS_ENVIRONMENT;
	public String AWS_KEY;
	public String AWS_SECRET;
	private static Config conf;	
	public static String propFile = "librarycloud.collections.env.properties";
	
	private Config() {
		Properties props = new Properties();
		
		try {
			props.load(this.getClass().getClassLoader().getResourceAsStream(Config.propFile));
		} catch (Exception e) {
			throw new RuntimeException("Couldn't load project configuration!", e);
		} 
		
		SQS_ENVIRONMENT = props.getProperty("librarycloud.sqs.environment");
		AWS_KEY = props.getProperty("aws.access.key");
		AWS_SECRET = props.getProperty("aws.secret.key");
	}
	
	public static synchronized Config getInstance() {
		if (conf == null)
			conf = new Config();		
		return conf;
	}	
	
	
}

