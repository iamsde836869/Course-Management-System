package com.springrest.springrest.services; 

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	//autowired injects the dependency automatically and we dont need to do it manualy.
	@Autowired
	private CourseDao courseDao;
	//List<Course> list;
	public CourseServiceImpl() {
		// TODO Auto-generated constructor stub
//		list=new ArrayList<>();
//		list.add(new Course(123,"Title of the book","Description of the book"));
//		list.add(new Course(456,"Title of the book 1","Description of the book 1"));
//	
		
	}

	@Override
	public List<Course> getCourses(){
		return courseDao.findAll();

	}

	@Override
	public Course getCourse(Long courseId) {
		// TODO Auto-generated method stub
//		Course c =null;
//		for(Course co: list) {
//			if(co.getId()==courseId) {
//				c=co;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
//	
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	Course entity=courseDao.getOne(parseLong);
	courseDao.delete(entity);
	} 

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}
}
