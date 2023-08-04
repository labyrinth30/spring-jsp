package net.skhu.controller;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
@Controller
public class ExamController {
	@RequestMapping("exam/test3")
	public String index(Model model) {
		model.addAttribute("myTime", new Date());
		return "exam/test3";
	}
	@RequestMapping("exam/test1")
	public String test1(Model model) {
		model.addAttribute("myNum","201911016");
		model.addAttribute("myName","이윤하");
		return "exam/test1";
	}
	@GetMapping("exam/test4")
	public String test2(Model model) {
		model.addAttribute("color1","yellow");
		model.addAttribute("color2","red");
		return "exam/test4";
	}
	@PostMapping("exam/test4")
	public String test2(Model model, String color1, String color2) {
		String errorMsg = null;
		System.out.println(color1);
		System.out.println(color2);
		if (color1 == null || color1.length() == 0)
			errorMsg = "color1을 입력하세요";
		else if (!color1.equals( color2))
			errorMsg = "color1과 color2의 값이 일치하지 않습니다.";
		else {
			model.addAttribute("color1",color1);
			model.addAttribute("color2",color2);
			return "exam/test4";
		}
		model.addAttribute("color1",color1);
		model.addAttribute("color2",color2);
		model.addAttribute("errorMsg", errorMsg);
		return "exam/test4";
	}
	@GetMapping("exam/exam1")
	public String exam1(Model model) {
		model.addAttribute("backgroundColor", "yellow");
		return "exam/exam1";
	}
	@PostMapping("exam/exam1")
	public String exam1(Model model, String backgroundColor) {
		model.addAttribute("backgroundColor",backgroundColor);
		return "exam/exam1";
	}
	@GetMapping("exam/exam2")
	public String login3(Model model) {
		model.addAttribute("now", new Date());
		return "exam/exam2";
	}
	@PostMapping("exam/exam2")
	public String exam2(Model model, String title, String writer, String publisher, String category, HttpSession session) {
		String errorMsg = null;
		if (title == null || title.length() == 0)
			errorMsg = "제목를 입력하세요";
		else if (writer == null || writer.length() == 0)
			errorMsg = "저자를 입력하세요";
		else if (publisher == null || publisher.length() == 0)
			errorMsg = "출판사를 입력하세요";
		else if (category == null)
			errorMsg = "카테고리를 선택하세요";
		else {
			session.setAttribute("now", new Date());
			session.setAttribute("title","title");
			session.setAttribute("writer",writer);
			session.setAttribute("publisher",publisher);
			session.setAttribute("category",category);
			return "exam/exam2";
		}
		model.addAttribute("now", new Date());
		model.addAttribute("title", title);
		model.addAttribute("writer", writer);
		model.addAttribute("publisher", publisher);
		model.addAttribute("errorMsg", errorMsg);
		return "exam/exam2";
	}
}