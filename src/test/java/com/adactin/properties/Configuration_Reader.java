package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\kowsalya\\eclipse-workspace\\Cucumber_10_30\\src\\test\\java\\com\\adactin\\properties\\adactin.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String get_Browser() {

		String browser = p.getProperty("browser");

		return browser;

	}

	public String get_Url() {

		String url = p.getProperty("url");

		return url;
	}

}
