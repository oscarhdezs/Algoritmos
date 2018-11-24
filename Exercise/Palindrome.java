public class Palindrome {

	public static void main(String []args) {
		
		String cadena = "r$%6omm $%&am$%6or";
		System.out.println("Is palindrome?"+isPalindrome(cadena));
	}
	
	private static boolean isPalindrome(String cad) {
		String cadena = cad.replaceAll("[^a-zA-Z]","");
		
		int size = cadena.length();
		int begin =0;
		int end = size-1;
		while(begin<size) {
			if(cadena.charAt(begin)!=cadena.charAt(end)) {
				return false;
			}
			begin++;
			end--;
		}
		return true;
	}
	
}
