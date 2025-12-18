class Palindrome {
    public static void main(String[] ritam) {
        String a = "malayalgam";
        char[] arr = a.toCharArray();

        int j = a.length() - 1;
        boolean isPalindrome = true;

        for (int i = 0; i < a.length(); i++) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
            j--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
