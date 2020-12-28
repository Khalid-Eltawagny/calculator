package com.calc.backEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CalcController {
	
	@Autowired
	CalcService service ; 
	
	@GetMapping("/{op}/{num1}/{num2}")
	public String calc(@PathVariable String op , @PathVariable double num1 , @PathVariable double num2) {
		
		return service.calc(op,num1,num2) ; 
	}
	
	@GetMapping("/{op}/{num}")
	public String calc(@PathVariable String op,@PathVariable double num) {
		return service.calcSingle(op,num) ;
	}

}