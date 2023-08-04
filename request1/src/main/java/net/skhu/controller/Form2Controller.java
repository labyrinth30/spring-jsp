package net.skhu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class Form2Controller {
	@GetMapping("form2/select1")
	public String select1(Model model) {
		model.addAttribute("stuNum", 201911016);
		model.addAttribute("stuName", "이윤하");
		model.addAttribute("result");
		return "form2/select1";
	}
	@PostMapping("form2/select1")
	public String select1(Model model, Integer stuNum, String stuName) {
		model.addAttribute("stuNum", 222222222);
		model.addAttribute("stuName", "임꺽정");
		return "form2/select1";
	}
	private int calc(int number1, String cmd, int number2) {
		int result = 0;
		switch (cmd) {
		case "+": result = number1 + number2; break;
		case "-": result = number1 - number2; break;
		case "*": result = number1 * number2; break;
		case "/": result = number1 / number2; break;
		}
		return result;
	}
	@GetMapping("form2/select2")
	public String select2(Model model) {
		model.addAttribute("number1", 0);
		model.addAttribute("number2", 0);
		model.addAttribute("cmd", "+");
		model.addAttribute("result", 0);
		return "form2/select2";
	}
	@PostMapping("form2/select2")
	public String select2(Model model, Integer number1, String cmd, Integer number2) {
		model.addAttribute("number1", number1);
		model.addAttribute("number2", number2);
		model.addAttribute("cmd", cmd);
		model.addAttribute("result", calc(number1, cmd, number2));
		return "form2/select2";
	}
	/*class Product{
		private String proName;
		private int price;
		private int amount;

		public Product(){

		}
	}*/
	@GetMapping("exam2/product")
	public String product(Model model) {
		model.addAttribute("stuNum", 201911016);
		model.addAttribute("stuName", "이윤하");
		model.addAttribute("result");
		return "exam2/product";
	}
	@PostMapping("exam2/product")
	public String product(Model model, Integer stuNum, String stuName) {
		model.addAttribute("stuNum", 222222222);
		model.addAttribute("stuName", "임꺽정");
		return "exam2/product";
	}
}
