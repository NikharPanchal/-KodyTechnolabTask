package com.kody.practice.string;
/**
 * @objective 
 * @Developer Nikhar
 * @Date 07-Jun-2022
*/
public class StringTask {

	public static void main(String[] args) {
		/*byte ascii[] = {65, 66, 67, 68, 69, 70 };
		 String s1 = new String(ascii);
		 System.out.println(s1);
		 String s2 = new String(ascii, 1, 3);
		 System.out.println(s2);*/
		
		/*String str = "Tokyo Olympics";  
	
		if(str.startsWith(""))  
		{  
		System.out.println("The string starts with the empty string.");  
		}  
		else  
		{  
		System.out.println("The string does not start with the empty string.");     
		}*/
		
		StringBuffer sb = new StringBuffer("NikharPanchal");
		 System.out.println("buffer = " + sb);
		 System.out.println("length = " + sb.length());
		 System.out.println("capacity = " + sb.capacity());
	}

}
