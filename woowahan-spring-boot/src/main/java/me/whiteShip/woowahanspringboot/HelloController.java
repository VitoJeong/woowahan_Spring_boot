package me.whiteShip.woowahanspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HelloController {
	
	private final MyProperties myProperties;

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		String str = "";
		str += myProperties.getMessage();
		str += "\n";
		str += "my age : " + myProperties.getAge();
		return str;
	}
	
}
