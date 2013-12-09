package codes;

public class LatestVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "1.2.3.4";
		String str2 = "1.2.3.35";
		
		str1 = str1.replace(".","A");
		str2 = str2.replace(".","C");
		
		int t = str1.compareTo(str2);
		if(t == 0)
			System.out.println("Both are same");
		if(t < 0)
			System.out.println("2 is latest");
		if(t > 0)
			System.out.println("1 is latest");
	}

}
