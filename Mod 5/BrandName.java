import java.util.Random;
class BrandName
{ 
	String generateName(int size) { // Main method for entire code to call from
		
		String consonants = "bcdfghjklmnprstvwxz"; // Left out Q and Y because business doesn't 'like' it.
		String vowels = "aeiou"; // took out vowels
		
		Random rand = new Random();

		if(size < 6 || size > 12 ) {	// if size is less than 6 or size is greater than 12 in reference to word size
			
			System.out.println("Invalid Size Parameter");
			return ""; // Will print out invalid size and return with nothing
		
		} else {
			
			String random = "";
			
			for(int i = 0; i < size; i++) {
				int position = i + 1; // because words start on the 0 spectrum, the real number is that position + 1
				if(position %  2 == 0) { // if position of character is divided by two and equals to zero, this is an equal number and is a vowel
					int index = rand.nextInt(5); // This is 5 because it accounts for 0,1,2,3,4,5. It's not inclusive of 5.
					random += vowels.charAt(index);
				}else {
					int index = rand.nextInt(consonants.length()); // randomize letters the length of consonants
					random += consonants.charAt(index);
				}
			}
			return random;
		}
	}

	public static void main(String[] args) // main area of code below
	{
		BrandName brand = new BrandName();
		Random rand = new Random();

		System.out.println("Brand Name Generator - Makenna Kidd\n");

		for(int i = 0; i < 10; i++) // number 10 that needs to be printed that many times
		{
			int size = 6 + rand.nextInt(7); // this is the smallest size 6, randomizing + 7 letters. Really 6 but the last of 7 isnt inclusive.
			String randomBrandName = brand.generateName(size);
			int positionNumber = i + 1; // position number is the numbering of the list. 1), 2), 3) etc.
			
			System.out.println(positionNumber + ") " + randomBrandName.substring(0, 1).toUpperCase() + randomBrandName.substring(1)); // How to uppercase just the first letter of the string.
		}
	}
}