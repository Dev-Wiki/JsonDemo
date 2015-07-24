package net.devwiki.main;

import java.util.ArrayList;
import java.util.List;

import net.devwiki.model.GradeClass;
import net.devwiki.model.Person;
import net.devwiki.model.Student;
import net.devwiki.model.Teacher;

public class DataCreator {
	
	private DataCreator(){}
	
	public static Person createPerson(){
		Person person = new Person();
		person.setName("张三");
		person.setAge(20);
		return person;
	}
	
	public static Student createStudent(){
		Student student = new Student();
		student.setClassName("同学1");
		student.setAge(12);
		student.setClassName("七年级");
		student.setClassIndex(1);
		return student;
	}
	
	public static Teacher createTeacher(){
		Teacher teacher = new Teacher();
		teacher.setName("张老师");
		teacher.setCourseName("y语文");
		teacher.setAge(30);
		return teacher;
	}
	
	public static List<String> createProjectList(){
		List<String> projectList = new ArrayList<String>();
		projectList.add("语文");
		projectList.add("数学");
		projectList.add("英文");
		return projectList;
	}
	
	public static List<Student> createStudentList(){
		List<Student> studentList = new ArrayList<Student>();
		Student student = new Student();
		student.setClassName("同学1");
		student.setAge(12);
		student.setClassName("七年级");
		student.setClassIndex(1);
		studentList.add(student);
		
		student = new Student();
		student.setClassName("同学2");
		student.setAge(11);
		student.setClassName("七年级");
		student.setClassIndex(1);
		studentList.add(student);
		
		student = new Student();
		student.setClassName("同学3");
		student.setAge(13);
		student.setClassName("七年级");
		student.setClassIndex(1);
		studentList.add(student);
		
		student = new Student();
		student.setClassName("同学4");
		student.setAge(11);
		student.setClassName("七年级");
		student.setClassIndex(1);
		studentList.add(student);
		
		return studentList;
	}
	
	public static GradeClass createGradeClass(){
		GradeClass gradeClass = new GradeClass();
		gradeClass.setCharge(createTeacher());
		gradeClass.setClassIndex(1);
		gradeClass.setClassName("七年级");
		gradeClass.setStudentList(createStudentList());
		gradeClass.setProjectList(createProjectList());
		return gradeClass;
	}
	
	public static int[] createIntArray(){
		int[] array = new int[]{0, 1, 2, 3, 4};
		return array;
	}
	
	public static String[] createStringArray(){
		String[] array = new String[]{"A", "B", "C", "D", "E"};
		return array;
	}
}
