package utility;

public class Consonant {
	
	static boolean isVowel(char ch) {
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
			return false;
		}
		return true;
	}
		//function to replace consonants
	static String replaceConsonants(char[] s) {
		for (int i=0; i<s.length; i++)
		{
			if(!isVowel(s[i])) {
				
			
			//if 'z' then replace with 'b'
			if (s[i]=='z') {
				s[i]='b';
			}
			else {
				//replace with next immediate
				s[i]= (char) (s[i]+1);
				
				if(isVowel(s[i])) {
					s[i] = (char) (s[i]+1);
				}
			}
			}
		}
		return String.valueOf(s);
		
	}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "JUPITER";
		System.out.println(replaceConsonants(s.toCharArray()));

	}

}
