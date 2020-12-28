package com.calc.backEnd;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
		
	double num1,num2,res;
	String op  ; 
	
	
	public CalcService(){}
	
	public String calc(String op , double num1 , double num2) {
		
		if (op.equals("add")) {
			return String.valueOf(num1+num2) ; 
		}else if (op.equals("sub")) {
			return String.valueOf(num1 - num2) ; 
		}else if (op.equals("multi")) {
			return String.valueOf(num1*num2) ;
		}else if (op.equals("div")) {
			if (num2==0) {
				return "E" ; 
			}
			else 
			return String.valueOf(num1/num2) ; 
		}
		return "" ;
		
	}
	
	public String calcSingle(String op , double num) {
		
		if(op.equals("frac")) {
			
			if(num==0) 
				return "E" ; 
			return String.valueOf(1/num);
			
		}
		else if (op.equals("pow"))
			return String.valueOf(num*num) ; 
		else if (op.equals("sqroot")) {
			
			if (num < 0 ) {
				return "E";
			}else 
				return String.valueOf(Math.sqrt(num)) ; 
		}
		else if (op.equals("toggle"))
			return String.valueOf(-1*num) ; 
		else if (op.equals("percent"))
			return String.valueOf(num/100) ; 
		
		return "" ;
		
	}
	
	
	

	

}
