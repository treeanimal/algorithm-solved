
public class Main {

	public static void main(String[] args) {
		
		char c = 'S';
		if(Character.isUpperCase(c)){
			c = Character.toLowerCase(c);
		}
		
		System.out.println(c);
		System.out.println(Character.isLowerCase(c));
	}

}
