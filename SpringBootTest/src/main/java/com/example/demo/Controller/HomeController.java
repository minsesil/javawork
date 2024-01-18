package com.example.demo.Controller;

//import org.springframework.stereotype.Controller;
//import org.springFramework.ui.Model;
//import org.springFramework.web.bind.annotation.RequestMapping;

//컨트롤러 어노테이션
@Controller
public class HomeController {
	// 매핑 주소
//	@RequestMapping(value = {"/","/index.html"})
	public String index(org.springframework.ui.Model model) {
		//템플릿에 전달할 데이터
		model.addAttribute("data", "hello world");
		// 템플릿 파일명
		return "Home/index";
	}
}