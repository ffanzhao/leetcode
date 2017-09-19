package comyifan.hash.table;

public class Demo1 {
	public static void main(String[] args) {
		Encode_and_Decode_TinyURL a = new Encode_and_Decode_TinyURL();
		String encode = a.encode("https://leetcode.com/problems/design-tinyurl");
	    System.out.println(encode);
	}

}
