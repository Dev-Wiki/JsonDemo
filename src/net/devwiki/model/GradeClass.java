package net.devwiki.model;

import java.util.List;

public class GradeClass {
	
	private String className;
	private int classIndex;
	private Teacher charge;
	private List<String> projectList;
	private List<Student> studentList;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getClassIndex() {
		return classIndex;
	}

	public void setClassIndex(int classIndex) {
		this.classIndex = classIndex;
	}

	public Teacher getCharge() {
		return charge;
	}

	public void setCharge(Teacher charge) {
		this.charge = charge;
	}

	public List<String> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<String> projectList) {
		this.projectList = projectList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
}
