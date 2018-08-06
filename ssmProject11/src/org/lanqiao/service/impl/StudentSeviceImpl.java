package org.lanqiao.service.impl;

import java.util.List;

import org.lanqiao.entity.Student;
import org.lanqiao.mapper.StudentMapper;
import org.lanqiao.service.StudentService;

public class StudentSeviceImpl implements StudentService{
	private StudentMapper studentMapper;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Override
	public Student queryStudentByNo(int stuNo) {
		
		return studentMapper.queryStudentByNo(stuNo);
	}

	@Override
	public void addStudent(Student stu) {
		studentMapper.addStudent(stu);
		
	}

	@Override
	public void deleteStudentByNo(int stuNo) {
		studentMapper.deleteStudentByNo(stuNo);
		
	}

	@Override
	public void updateStudentByNo(Student stu) {
		studentMapper.updateStudentByNo(stu);
		
	}

	@Override
	public List<Student> queryStudentAll() {
		
		return studentMapper.queryStudentAll();
	}

}
