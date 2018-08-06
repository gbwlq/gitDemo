package org.lanqiao.controller;

import java.util.List;
import java.util.Map;

import org.lanqiao.entity.Student;
import org.lanqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/StudentController")
public class StudentController {
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;
	
	
	@RequestMapping("/queryStudentByNo")
	public String queryStudentByNo(@RequestParam Integer stuNo,Map<String,Object> map) {
		Student stu = studentService.queryStudentByNo(stuNo);
		map.put("student", stu);
		return "success";
	}
	
	@RequestMapping(value="/addStudent")
	public String addStudent(@RequestParam Integer stuNo,Map<String,Object> map,Student stu) {
		studentService.addStudent(stu);
		Student stu1 = studentService.queryStudentByNo(stuNo);
		map.put("student", stu1);
		return "success";
	}
	@RequestMapping(value="/deleteStudentByNo")
	public String deleteStudentByNo(@RequestParam Integer stuNo,Map<String,Object> map) {
		studentService.deleteStudentByNo(stuNo);
		Student stu = studentService.queryStudentByNo(stuNo);
		map.put("student", stu);
		return "success";
	}
	@RequestMapping(value="/updateStudentByNo")
	public String updateStudentByNo(@RequestParam Integer stuNo,Map<String,Object> map,Student stu) {
		studentService.updateStudentByNo(stu);
		Student stu1=studentService.queryStudentByNo(stuNo);
		map.put("student", stu);
		return "success";
	}
	@RequestMapping(value="/queryStudentAll")
	public String queryStudentAll(Model model) {
		List<Student> stus= studentService.queryStudentAll();
		model.addAttribute("student", stus);
		return "showAll";
	}
	@RequestMapping(value="/queryStudentAllWithPage")
	public String queryStudentAllWithPage(Model model) {
		PageHelper.startPage(1, 1);
		List<Student> stus= studentService.queryStudentAll();
		PageInfo<Student> page=new PageInfo<Student>(stus);
		model.addAttribute("page", page);
		return "showWithPage";
	}
}
