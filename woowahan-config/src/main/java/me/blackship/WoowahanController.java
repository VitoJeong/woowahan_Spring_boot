package me.blackship;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WoowahanController {

	@GetMapping("/lol")
	public String lol() {
		return "lol 두두등장!";
	}
}
