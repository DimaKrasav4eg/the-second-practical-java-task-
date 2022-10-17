package fourthmission;

public class PalindromeImpl implements Palindrome{
	
	private String value;

	@Override
	public void setString(String value) {
		this.value = value;
	}

	@Override
	public boolean isPalindrome() {
		int length = value.length();
		for (int i = 0; i < length/2; ++i) {
			if (value.charAt(i) != value.charAt(length-i-1)) {
				return false;
			}
		}
		return true;
	}

}
