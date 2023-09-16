package com.trade.utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.stereotype.Component;

@Component
public class CheckAvailability {

	public String isPropertyExists(String key) {
		String property = null;
		Properties properties = new Properties();
		try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/ccy-data.properties")) {
			properties.load(fileInputStream);

			 property = properties.getProperty(key);
				return property;
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return property;

	}
}
