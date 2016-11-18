package niuke_java;

public class Test02_ReplaceSpace {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("today is beautiful");
		System.out.print(replaceSpace(s));
	}
	
	public static String replaceSpace(StringBuffer str) {
		StringBuffer ss = new StringBuffer();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				ss.append("%20");
			} else {
				ss.append(str.charAt(i));
			}
		}
		
		return ss.toString();
	}

}
