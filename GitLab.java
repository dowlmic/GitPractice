package gitLab;

public class GitLab {
	public String frontBack(String str) {
		if (str.length() < 2) {
			return str;
		}
		else {
			String lastChar = str.substring(str.length()-1, str.length());
			String firstChar = str.substring(0, 1);
			return lastChar + str.substring(1, str.length()-1) + firstChar;
		}
	}
}
