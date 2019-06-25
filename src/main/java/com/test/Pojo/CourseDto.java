package com.test.Pojo;

import java.util.List;

public class CourseDto {
	List<CourseInfoDto> data;

	public List<CourseInfoDto> getData() {
		return data;
	}

	public void setData(List<CourseInfoDto> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Course [data=" + data + "]";
	}
	
}
