package Com.practice;

public class Alphabet {
	
	
	private StringBuilder pool;
	public Alphabet(boolean uppercaseIncluded, boolean lowercaseIncluded, boolean numbersIncluded, boolean specialCharactersIncluded) {
		pool = new StringBuilder();
		if(uppercaseIncluded) {
			pool.append(Environment.upperCase.getUrl());
		}
		if(lowercaseIncluded) {
			pool.append(Environment.lowerCase.getUrl());
		}
		if(numbersIncluded) {
			pool.append(Environment.numbers.getUrl());
		}
		if(specialCharactersIncluded) {
			pool.append(Environment.characters.getUrl());
		}
	}
	public String getAlphabet() {
		return pool.toString();
	}


}