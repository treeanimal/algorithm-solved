
public class Main {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder();
		sb.append("h");
		sb.append("i");
		sb.append("\n");
		sb.append("I'm human");
		
		System.out.println(sb);
		
		
		String str = "sloth";
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println(reverse);
		
	
	}

}
