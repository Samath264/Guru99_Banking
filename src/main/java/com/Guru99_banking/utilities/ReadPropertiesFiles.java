package com.Guru99_banking.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFiles {

	// This class will have all the methods to deal with property file data;

	public static Properties readData(String filename) {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Config\\" + filename);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
