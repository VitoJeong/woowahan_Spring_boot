package me.blackship;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WoowahanController {

	@GetMapping("/lol")
	public String lol() {
		return "lol 두두등장!";
	}
	
	@GetMapping("/white")
	public String white() {
		return "jar 갱신 테스트22";
		// 테스트 성공
	}
	
}
