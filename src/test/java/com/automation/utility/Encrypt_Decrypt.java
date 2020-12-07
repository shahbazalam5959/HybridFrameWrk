package com.automation.utility;

import org.apache.commons.codec.binary.Base64;

public class Encrypt_Decrypt {

	public static void main(String[] args) {
		
		String str = "test123";
		
		//To encode/encrypt the string we have class called Base64 
		
		byte[] encodedStr = Base64.encodeBase64(str.getBytes());
		System.out.println("Encoded String -> "+new String(encodedStr));
		
		//To decode/decrypt the string we have class called Base64
		
		byte[] decodedStr = Base64.decodeBase64(encodedStr);
		System.out.println("Decoded String -> "+new String(decodedStr));

	}

}
