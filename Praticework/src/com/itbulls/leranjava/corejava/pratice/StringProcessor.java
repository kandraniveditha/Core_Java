package com.itbulls.leranjava.corejava.pratice;

public class StringProcessor {
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
			"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
			"james;Derek James;james@gmail.com" + System.lineSeparator() +
			"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
			"gregory;Mike Gregory;gregory@yahoo.com";
	
	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));
		
		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));
		
	}
	
	public static String convert1(String input) {
	StringBuilder sb = new StringBuilder();
    String[] lines = input.split(System.lineSeparator());
	
	String headerLine = lines[0];
	String[] headers = headerLine.split(";");
	
	for(int i=1; i<lines.length; i++){
	    String[] values = lines[i].split(";");
	    for(int j = 0; j < headers.length; j++){
	        sb.append(headers[j]).append(" =>").append(values[j]).append(System.lineSeparator());
	    }
	    sb.append(System.lineSeparator());
	}
	return sb.toString();
	
	}
	
	
	public static String convert2(String input) {
	
		StringBuilder sb = new StringBuilder();
		String[] lines = input.split(System.lineSeparator());
		
		String headerLine = lines[0];
		String[] headers = headerLine.split(";");
		
		int loginIndex = -1;
		int emailIndex = -1;
		for(int i=0; i<headers.length; i++){
		  if(headers[i].equals("Login")){
		      loginIndex = i;
		  }else if(headers[i].equals("Email")){
		        emailIndex = i;
		    }
		}
		
		for(int i =1; i<lines.length; i++){
		    String[] values = lines[i].split(";");
		    sb.append("Login: ").append(values[loginIndex]).append(System.lineSeparator());
		    sb.append("Email: ").append(values[emailIndex]).append(System.lineSeparator());
		    
		    sb.append(System.lineSeparator());
		}
		return sb.toString();
	
	}

}

