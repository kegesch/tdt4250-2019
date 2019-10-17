package no.tdt4250.model.html.service;

import java.util.Optional;

import programmes.Course;
import programmes.CourseGroup;
import programmes.Programme;

public class CourseGroupService {
	
	public CourseGroup getCourseGroupOfCourse(Course course, Programme programme) {
		Optional<CourseGroup> group =  programme.getCourseGroups().stream().filter(g -> g.getCourses().contains(course)).findAny();
		if(group.isPresent()) {
			return group.get();
		} else {
			return null;
		}
	}
	
}
