package DownloadFileBasics;

import org.apache.commons.codec.binary.Base64;

public class PasswordEncoding {

	public static void main(String[] args) {

		  String orig = "temp@1234";

	        //encoding  byte array into base 64
	        byte[] encoded = Base64.encodeBase64(orig.getBytes()); 
	       
	      
	        System.out.println("Original String: " + orig );
	        System.out.println("Base64 Encoded String : " + new String(encoded));
	      
	        //decoding byte array into base64
	        byte[] decoded = Base64.decodeBase64(encoded);      
	        System.out.println("Base 64 Decoded  String : " + new String(decoded));
		
//	        Original String: temp@1234
//	        Base64 Encoded String : dGVtcEAxMjM0
//	        Base 64 Decoded  String : temp@1234
	}
}
