public class Anagrama {

	public static void main(String[] args) {
		String cadOne = "the alias men";
		String cadTwo = "alan smithae";
		
		System.out.println("Is Anagram?"+isAnagram(cadOne, cadTwo));
	}
	
	private static boolean isAnagram(String cadOne, String cadTwo) {
		String cad1 = cadOne.replaceAll("[^a-zA-Z]","").toLowerCase();
		String cad2 = cadTwo.replaceAll("[^a-zA-Z]","").toLowerCase();
		
		int size = cad1.length();
		
		for(int x=0;x<size;x++) {
			char c = cad1.charAt(x);
			if( cad2.indexOf(String.valueOf(c))==-1  ) {
				return false;
			}
			cad2 = cad2.replaceFirst(String.valueOf(c),"");
		}
		
		return true;
	}
}
