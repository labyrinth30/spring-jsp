package net.skhu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mapper.BookMapper;
@Controller
public class BookController {

	@Autowired BookMapper bookMapper;

	@RequestMapping("book/list")
	public String list(Model model) {
		model.addAttribute("books", bookMapper.findAll());
		return "book/list";
	}
}
