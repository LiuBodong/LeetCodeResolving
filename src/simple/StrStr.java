package simple;

/**
 * Author : 刘伯栋 Version : 1.0 Date : 2020年1月7日 下午10:37:10 Description :
 */

public class StrStr {

	public static void main(String[] args) {
		String haystack1 = "hello", needle1 = "ll";
		System.out.println(strStr(haystack1, needle1));
		String haystack2 = "aaaaa", needle2 = "bba";
		System.out.println(strStr(haystack2, needle2));
	}

	public static int strStr(String haystack, String needle) {
		if (haystack.isEmpty()) {
			if (needle.isEmpty()) {
				return 0;
			} else {
				return -1;
			}
		} else {
			if (needle.isEmpty()) {
				return 0;
			} else {
				for (int i = 0; i < haystack.length(); i++) {
					if (haystack.charAt(i) == needle.charAt(0) && i + needle.length() <= haystack.length()) {
						boolean eq = true;
						for (int j = 0; j < needle.length(); j++) {
							eq = eq && needle.charAt(j) == haystack.charAt(j + i);
						}
						if (eq) {
							return i;
						}
					}
				}
				return -1;
			}
		}
	}

}
