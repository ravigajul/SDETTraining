package com.test.SDETTraining;

import java.util.List;

import org.apache.commons.text.StringEscapeUtils;

import com.google.gson.Gson;
import com.test.Pojo.CourseDto;
import com.test.Pojo.CourseInfoDto;
import com.test.helpers.DatabaseHelper;
import com.test.helpers.FileHelper;


public class JsonToJavaTest {
	public static void main(String[] args) throws Exception {
		List<CourseInfoDto> courseInfoList;
		String strQuery = "select * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia'";
		DatabaseHelper dh = new DatabaseHelper();
		
		//getting the course records in a list, of type CourseInfo
		courseInfoList = dh.getCourseInfo(strQuery);
		
		//Filling the CourseDto pojo to create final course.json file
		CourseDto coursedto = new CourseDto();
		coursedto.setData(courseInfoList);
		
		//using gson API to convert java object to json string
		Gson gson = new Gson();
		String json = gson.toJson(coursedto);
		System.out.println(json);
		
		//writing json string to json file
		String file=System.getProperty("user.dir") + "\\src\\main\\java\\com\\testdata\\Course.json";
		FileHelper.WriteToJsonFile(json,file);
		
		//apache commons utility for removing escape sequences
		System.out.println(StringEscapeUtils.unescapeJava("{\"data\":[{\"CourseName\":\"Appium\",\"PurchasedDate\":\"2019-06-20\",\"Amount\":99,\"Location\":\"Asia\"},{\"CourseName\":\"WebServices\",\"PurchasedDate\":\"2019-06-20\",\"Amount\":21,\"Location\":\"Asia\"},{\"CourseName\":\"Jmeter\",\"PurchasedDate\":\"2019-06-20\",\"Amount\":76,\"Location\":\"Asia\"}]}"));
	
		
		//reading data from .json file as a Java Object
		file=System.getProperty("user.dir") + "\\src\\main\\java\\com\\testdata\\Course.json";
		System.out.println(FileHelper.ReadFromJsonAsJavaObject(file));
		System.out.println(FileHelper.ReadFromJsonAsJavaObject(file).getData().get(0).getCourseName());
		
	}
}