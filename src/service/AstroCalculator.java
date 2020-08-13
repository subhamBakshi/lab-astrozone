package service;

import model.User;

// Type your code
public class AstroCalculator{
	public String findSign(User user) {
		String month = user.getDob().substring(3, 5);
		String output = "";
		if(month == "01") {
			output = "Capricorn";
		} else if(month == "02") {
			output = "Aquarius";
		} else if(month == "03") {
			output = "Leo";
		} else if(month == "04") {
			output = "Pisces";
		} else if(month == "05") {
			output = "Aries";
		} else if(month == "06") {
			output = "Taurus";
		} else if(month == "07") {
			output = "Gemini";
		} else if(month == "08") {
			output = "Cancer";
		} else if(month == "09") {
			output = "Virgo";
		} else if(month == "10") {
			output = "Libra";
		} else if(month == "11") {
			output = "Scorpio";
		} else if(month == "12") {
			output = "Sagittarius";
		} 
		
		return output;
	}
}