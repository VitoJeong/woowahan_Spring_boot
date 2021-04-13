package me.whiteShip.woowahanspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("my")
@Data
public class MyProperties {
	
	private String message;

	private int age;
}
