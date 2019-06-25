package com.test.helpers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.test.Pojo.CourseDto;

public class FileHelper {

	public static void WriteToJsonFile(String json,String file) {
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(json);
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void appendStrToFile(String fileName, String str) {
		try {
			// Open given file in append mode.
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
			out.write(str);
			out.close();
		} catch (IOException e) {
			System.out.println("exception occoured" + e);
		}
	}
	
	public static CourseDto ReadFromJsonAsJavaObject(String file) {
		try{
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			Gson gson = new Gson();
			return gson.fromJson(bufferedReader, CourseDto.class);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
	}
}
