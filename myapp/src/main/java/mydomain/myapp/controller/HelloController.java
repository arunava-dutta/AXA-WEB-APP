package mydomain.myapp.controller;

	public class HelloController {	
		
		  //String propValue=null;
		  String propConfigValue=null;
		  String username="";
		  String password1="";
		  String constring="";
		  
		  public String getPropConfigValue() {
			return propConfigValue;
		}

		public void setPropConfigValue(String propConfigValue) {
			this.propConfigValue = propConfigValue;
		}
		

		public HelloController(){

			  
			  //Properties props = new Properties();
				
				//InputStream input = null;
				try {
				
			
	            username=System.getenv("username");
	            password1=System.getenv("password1");
	            constring=System.getenv("constring");
	            propConfigValue=username+""+password1+""+constring;	

					
					
					 
	        }catch(Exception ex)
	        {
	        	ex.getMessage();
	        } 
			  }
			
		public String sayHello() { 
			
			
			return propConfigValue;
			
		
	}
	}


