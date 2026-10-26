package corejava;

public class VowelOrConsonant {

    // Instance variable to store the character
	char a;

	public static void main(String[] args) {

        // Creating an object of the VowelOrConsonant class
		VowelOrConsonant v = new VowelOrConsonant();
		
        // Initializing the character
		v.a= 'A';
		
		System.out.println("Checking whether the given letter is a vowel or consonant");
		System.out.println(" ");
		
		// Checking whether the given character is a vowel
		if(v.a =='A' || v.a =='E' || v.a=='I'|| v.a == 'O'|| v.a =='U' || v.a =='a' || v.a=='e' || v.a=='i' || v.a=='o' || v.a=='u') {
			
			System.out.println("The Given Letter is Vowel : "+v.a);
			
		}
		
        // If the character is not a vowel, it is treated as a consonant
		else {
			System.out.println("The Given Letter is Consonant : "+v.a);
		}
	}

}
