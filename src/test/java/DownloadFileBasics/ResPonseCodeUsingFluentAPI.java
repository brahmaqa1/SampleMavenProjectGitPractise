package DownloadFileBasics;

import org.apache.http.client.fluent.Request;


public class ResPonseCodeUsingFluentAPI {

	//http://www.ninthavenue.com.au/how-to-get-the-http-status-code-in-selenium-webdriver
		public static void main(String[] args) {
				System.out.println(checkResponse("http://gmail.com"));
				System.out.println(checkResponse("http://qtpselenium.comInvalid"));
			

		}
		public static boolean checkResponse(String url){
			   int resp_code = 0;
			try {
	             resp_code= Request.Get(url).execute().returnResponse().getStatusLine()
	                    .getStatusCode();
	            System.out.println("Respose code for URL "+ url +" is -> "+ resp_code);
	           if(resp_code == 200)
	        	   return true;
	           else
	        	   return false;
	        } catch (Exception e) {
	        	System.out.println("Respose code for URL "+ url +" is -> "+ resp_code);
	        	System.out.println("ex="+e);
	     	   return false;
	        }
		}

	}
