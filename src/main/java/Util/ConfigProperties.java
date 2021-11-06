package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

	private Properties prop;
	/**
	 * 
	 * @return
	 */
	public Properties init_prop()
	{
		prop=new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("D:/STS Directory/CucumberPractice/src/test/resources/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
}
