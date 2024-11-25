package DownloadFileBasics;

import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.client.fluent.Request;


public class Brokenlinks {

	public static void verifyLinks(String linkUrl)
	{
		try
		{
			URL url = new URL(linkUrl);

			//Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()>=400)
			{
				System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
			}    

			//Fetching and Printing the response code obtained
			else{
				System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
			}
		}catch (Exception e) {
			System.out.println("my exp="+e);
		}
	}

//
//		public static boolean checkResponse(String url){
//			try {
////			Reques
//	            int resp_code= Request.Get(url).execute().returnResponse().getStatusLine()
//	                    .getStatusCode();
//	            System.out.println("Respose code for URL "+ url +" is -> "+ resp_code);
//	           if(resp_code == 200)
//	           {
//	        	   return true;
//	           }	        	   
//	           else
//	           {
//	        	   return false;  
//	           }	        	   
//	        	   
//	        } catch (Exception e) {
//	     	   return false;
//	        }
//		}


	public static void main(String[] args) {
		System.out.println("strats");
		verifyLinks("http://gmail.com");
		verifyLinks("https://google.com/");

		//		
//				System.out.println(checkResponse("http://gmail.com"));
//				System.out.println(checkResponse("https://google.com/"));
		System.out.println("ends");
	}

}
