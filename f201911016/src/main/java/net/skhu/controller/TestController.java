	package net.skhu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestController{
	@RequestMapping("exam2/test4")
	public String test1(Model model) {
		model.addAttribute("myNum","201911016");
		model.addAttribute("myName","이윤하");
		return "exam2/test4";
}
	@GetMapping("exam2/test5")
	public String test5(Model model) {
		model.addAttribute("myNum", "201911016");
		model.addAttribute("myName", "이윤하");
		return "exam2/test5";
	}
	@PostMapping("exam2/test5")
	public String test5(Model model, String myNum, String myName) {
		model.addAttribute("myNum", myNum);
		model.addAttribute("myName", myName);
		return "exam2/test5";
	}
	@GetMapping("exam2/test6")
	public String test6(Model model) {
		return "exam2/test6";
	}
	@PostMapping("exam2/test6")
	public String test6(Model model, String myNum, String myName) {
		String errorMsg = null;
		if (myNum == null || myNum.length() == 0)
			errorMsg = "학번를 입력하세요";
		else if (myName == null || myName.length() == 0)
			errorMsg = "이름를 입력하세요";
		else {
			model.addAttribute("myNum",myNum);
			model.addAttribute("myName",myName);
			return "redirect:test4";
		}
		model.addAttribute("myNum",myNum);
		model.addAttribute("myName",myName);
		model.addAttribute("errorMsg",errorMsg);
		return "exam2/test6";
	}
	@GetMapping("exam2/test7")
	public String test7(Model model) {
		model.addAttribute("value",0);
		model.addAttribute("step",2);
		return "exam2/test7";
	}
	@PostMapping("exam2/test7")
	public String test7(Model model, int value, int step) {
		model.addAttribute("value",value+step);
		model.addAttribute("step",step);
		return "exam2/test7";
	}
}