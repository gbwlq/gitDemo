package org.lanqiao.mapper;

import java.util.List;

import org.lanqiao.entity.Student;

public interface StudentMapper {
	public Student queryStudentByNo(int stuNo);
	public void addStudent(Student stu);
	public void deleteStudentByNo(int stuNo);
	public void updateStudentByNo(Student stu);
	public List<Student> queryStudentAll();
}
