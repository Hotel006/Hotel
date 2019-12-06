package com.oracle.untl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取配置文件的工具类
 * 
 * @author Administrator
 *
 */
public class PropertiesUtil {
	// 要读取的配置文件名称
	public static final String DBPROPERTIES = "config/db.properties";

//通过配置文件中的key得到配置文件中的值
	public static String getValue(String filename, String key) {
		String result = null;
		try {
//			File file = new File(filename);
//			InputStream in = new FileInputStream(file);
			InputStream in=PropertiesUtil.class.getResourceAsStream("/db.properties");
			Properties p = new Properties();
			p.load(in);// 加载配置文件
			Object o = p.get(key);// 通过key获取值'
			if (o != null) {
				result = o.toString();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;

	}
}
