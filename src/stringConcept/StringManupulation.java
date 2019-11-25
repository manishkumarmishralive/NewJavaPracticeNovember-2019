package stringConcept;

public class StringManupulation {

	public static void main(String[] args) {

		// String creation
		// String literal
		String s = "Selenium";
		// Using new keyword
		String s1 = new String("Selenium");

		// String Methods:
		System.out.println("********");
		// 1. length():
		System.out.println(s.length());// 8

		// 2. charAt():
		System.out.println(s.charAt(4));// n

		// 3. substring(int begin index):
		System.out.println(s.substring(3));// enium

		// 4.substring(int begin index, int end index):
		System.out.println(s.substring(2, 5));// len

		// 5. concat(String str):
		String s2 = "Testing";
		System.out.println(s.concat(s2));// SeleniumTesting

		// 6. int indexOf(String s): Output will be at which index string 1st
		// occur.
		String s3 = "Learn Share Learn";
		System.out.println(s3.indexOf("Share"));// 6

		// 7. int indexOf(String s, int i): 1st occurrence of specified string
		// should be start either at specified location or after specified
		// location in the string. Searching should be start from specified
		// index and output will be the index where
		// string occur at that position
		System.out.println(s3.indexOf("Share", 6));// 6

		// 8. int lastIndexOf(String s):return specified string occur at last
		// index.

		System.out.println(s3.lastIndexOf("a"));// 14

		// 9. equals:compare two string and return true and false.
		String s4 = "Java";
		String s5 = "Java";
		String s6 = "java";
		System.out.println(s4.equals(s5));// true
		System.out.println(s4.equals(s6));// false

		// 10. equalIgnoreCase():
		System.out.println(s4.equalsIgnoreCase(s6));// true

		// 11. compareToIgnoreCase():
		System.out.println(s4.compareToIgnoreCase(s6));// 0
		System.out.println(s4.compareToIgnoreCase(s));// -9
		System.out.println(s.compareToIgnoreCase(s4));// 9

		// 12.compareTo():
		System.out.println(s4.compareTo(s6));// -32
		System.out.println(s4.compareTo(s));// -9
		System.out.println(s.compareTo(s4));// 9

		// 13. toUpperCase():
		System.out.println(s.toUpperCase());// SELENIUM
		// 14. toLowerCase():
		System.out.println(s.toLowerCase());// selenium

		// 15. trim():
		String s7 = "   Selenium    ";
		System.out.println(s7.trim());// Selenium

		// 16. replace():
		String s8 = "Selenium";
		System.out.println(s8.replace("l", "JAVA"));// SeJAVAenium

		// StringBuffer:
		System.out.println("********");
		StringBuffer sb = new StringBuffer("Selenium");
		System.out.println(sb.length());
		System.out.println(sb.append("Java"));
		System.out.println(sb.capacity());
		System.out.println(sb.insert(2, "JAVA"));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(2, 5));
		System.out.println(sb.replace(3, 5, "JAVA"));
		// o/p:
		// 8
		// SeleniumJava
		// 24
		// SeJAVAleniumJava
		// avaJmuinelAVAJeS
		// avuinelAVAJeS
		// avuJAVAelAVAJeS

		// StringBuilder:
		System.out.println("********");
		StringBuilder sb1 = new StringBuilder("Milenium");
		System.out.println(sb1.length());
		System.out.println(sb1.append("Java"));
		System.out.println(sb1.capacity());
		System.out.println(sb1.insert(2, "JAVA"));
		System.out.println(sb1.reverse());
		System.out.println(sb1.delete(2, 5));
		System.out.println(sb1.replace(3, 5, "JAVA"));

		// o/p:
		// 8
		// MileniumJava
		// 24
		// MiJAVAleniumJava
		// avaJmuinelAVAJiM
		// avuinelAVAJiM
		// avuJAVAelAVAJiM

	}

}
