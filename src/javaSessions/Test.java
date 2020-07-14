package javaSessions;

public class Test {

	public static void main(String[] args) {
		
		String str = "This is my java code and i am so happy";
		int length = str.length();
//		length()
		System.out.println(length);
		
//		charAt()
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(37));
//		System.out.println(str.charAt(38));  //String index out of range
		
//		indexOf()
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('s'));//1st occurrence of s --> 3
		//System.out.println(str.indexOf('s', str.indexOf('s'))+1);
		System.out.println(str.indexOf("s", str.indexOf('s')+1));
		System.out.println(str.indexOf("s", str.indexOf('s')+1  ));//2nd occurrence of s
		//str.indexOf('s', str.indexOf('s'))
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf("i", str.indexOf('i')+1));
		
//		System.out.println(str.indexOf("java"));
//		System.out.println(str.indexOf('h'));
//		System.out.println(str.lastIndexOf('h'));
//		System.out.println(str.lastIndexOf("so"));
		
		String s = "Hi Sharvi you like icecream";
		System.out.println("---------How To Count Occurrence Of Character In Java---------");
		int count = 0;
		char letter = 'i';
		System.out.println(s);
		for(int i=0; i<s.length(); i++) {
			char testValue = s.charAt(i);
			if(testValue == letter) {
				count = count + 1;
			}
			
		}
		System.out.println("Occurrence Of Character " +letter+ " in string is: " +count);
		
		System.out.println("------------------");
		String st = "My transaction id is 123456789";
		st.length();
		System.out.println(st.indexOf("is"));
		System.out.println(st.substring(st.indexOf("is")+3));
		

		
		
		
	
		
			

	}

}
