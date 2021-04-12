package me.blackship;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WoowahanConfig {

	@Bean
	public WoowahanController woowahanController() {
		return new WoowahanController();
	}
}
