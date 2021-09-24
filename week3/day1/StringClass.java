package week3.day1;

public class StringClass {

	public static void main(String[] args) {
		//1.Write a Java program to get the character at the given index within the String.
		String text = "Java Exercise";
		int EIndex=text.indexOf('E');
		int sIndex=text.indexOf('s');
		System.out.println("***Question1***");
		System.out.println(EIndex);
		System.out.println(sIndex);

		//2.Write a Java program to compare a given string to another string, ignoring case considerations
		String str1="I am Learning Java";
		String str2="I am learning java";
		System.out.println("***Question2***");
		if (str1==str2) {
			System.out.println("Memory address is compared");
		}
		else if(str1.equals(str2)) {
			System.out.println("string equals");
		}
		else if (str1.equalsIgnoreCase(str2)) {
			System.out.println("String equals with ignore case");
		}
		
		//3.Write a Java program to replace a specified character with another character and add # to the given string.
		String sentence = "I am working with Java8";
		String replace = sentence.replace("8", "11");
		System.out.println("***Question3***");
		System.out.println(replace);
		StringBuffer bf=new StringBuffer(sentence);
		StringBuffer append = bf.append("##");
		System.out.println(append);
		System.out.println(sentence.substring(5, 15));
	}

}
