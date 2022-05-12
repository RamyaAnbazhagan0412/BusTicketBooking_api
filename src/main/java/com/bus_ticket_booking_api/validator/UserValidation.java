package com.bus_ticket_booking_api.validator;

import com.bus_ticket_booking_api.model_class.User;

public class UserValidation {

	public static int userValidation(User userObj) {
		int validate=0;
		try {
			if(userObj.getUserName()==null||userObj.getUserName().isEmpty())	
			{
				validate=1;
				throw new Exception("Invalid Name");
				
			}
			else if(userObj.getEmailId()==null||userObj.getEmailId().isEmpty()||!(userObj.getEmailId().endsWith("@gmail.com")))
			{
				validate=1;
				throw new Exception("Invalid EmailId");
				}
			else if(userObj.getPassword()==null|userObj.getPassword().isEmpty())
			{
				validate=1;
				throw new Exception("Invalid password");
				}
			else if((userObj.getPassword().length()<=8)&&(userObj.getPassword().length()>=16)) {
				validate=1;
				throw new Exception("password should be minimum 8 character and maximum 16 character ");
			}
			else if(userObj.getPhoneNumber()==null||userObj.getPhoneNumber().isEmpty()||!(userObj.getPhoneNumber().length()==10))
			{
				validate=1;
				throw new Exception("Invalid phone number");
				}
			
			}
		catch(Exception e) {
            System.out.println(e.getMessage());	          
			}
		return validate;
	

	}
}
