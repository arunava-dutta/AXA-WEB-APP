package mydomain.myapp.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class HelloController {	
		
		  //String propValue=null;
		  String propConfigValue=null;
		  String username="";
		  String password1="";
		  String constring="";
		  String propSecretValue=null;
		  
		  public String getPropSecretValue() {
			return propSecretValue;
		}

		public void setPropSecretValue(String propSecretValue) {
			this.propSecretValue = propSecretValue;
		}

		public String getPropConfigValue() {
			return propConfigValue;
		}

		public void setPropConfigValue(String propConfigValue) {
			this.propConfigValue = propConfigValue;
		}
		

		public HelloController(){

			  
			  Properties props = new Properties();
				
			InputStream input = null;
				try {
           input = new FileInputStream(System.getProperty("devConfig.properties"));
					
					props.load(input);
					propConfigValue=props.getProperty("DEV");
					   //get the property value and print it out
					 System.out.println(props.getProperty("DEV"));
	            username=System.getenv("username");
	            password1=System.getenv("password1");
	            constring=System.getenv("constring");
	            propSecretValue=username+""+password1+""+constring;	

					
					
					 
	        }catch(Exception ex)
	        {
	        	ex.getMessage();
	        } 
			  }
			
		public String sayHello() { 
			
			
			return "Secret Value----->"+ propSecretValue + ".....!!!!" + " Properties File----->" + propConfigValue;
			
		
	}
	}


