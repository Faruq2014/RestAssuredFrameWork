package com.APITestingFramework.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseTest {
	
	public static Properties config = new Properties();
	private FileInputStream fis;
	public static com.APITestingFramework.utilities.ExcelReader excel = new com.APITestingFramework.utilities.ExcelReader(".\\src\\test\\resources\\excel\\testdata.xlsx");
	
	@BeforeSuite
	public void setUp() {
		
		
		

		try {
			fis = new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RestAssured.baseURI=config.getProperty("baseURI");
		//RestAssured.basePath=config.getProperty("basePath");
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		
	}

}
