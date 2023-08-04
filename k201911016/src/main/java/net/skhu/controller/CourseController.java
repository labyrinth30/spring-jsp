package net.skhu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mapper.CourseMapper;
@Controller
public class CourseController {
	@Autowired CourseMapper CourseMapper;
	@RequestMapping("course/list1")
	public String list(Model model) {
		model.addAttribute("courses", CourseMapper.findAll());
		return "course/list1";
	}
	@RequestMapping("course/list2")
	public String list2(Model model, String srchText) {
		if (srchText == null) srchText = "";
		model.addAttribute("courses", CourseMapper.findByTitle(srchText + "%"));
		model.addAttribute("srchText", srchText);
		return "course/list2";
	}
	@RequestMapping("course/detail")
	 public String detail(Model model, Integer id) {
	 if (id == null) id = 4;
	 model.addAttribute("course", CourseMapper.findById(id));
	 return "course/detail";
	 }
}