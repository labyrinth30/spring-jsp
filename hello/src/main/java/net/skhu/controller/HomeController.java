package net.skhu.controller;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("home/index")
	 public String index(Model model) {
	 model.addAttribute("message", "좋은 아침입니다");
	 model.addAttribute("now", new Date());
	 return "home/index";
	 }

	@RequestMapping("home/test1")
	public String test1(Model model) {
		model.addAttribute("message", "좋은 아침입니다");
		model.addAttribute("myName", "이윤하");
		return "home/test1";
	}
}