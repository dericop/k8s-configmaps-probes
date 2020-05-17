package com.bancolombia.co.dojoApolo;

import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class VariablesMap {
	@Value("${app.name}")
	private String name;
	@Value("${app.age}")
	private int age;
}
