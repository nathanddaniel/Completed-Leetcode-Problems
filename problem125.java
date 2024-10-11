public class problem125 {

    public boolean isPalindrome(String s) {

        //getting the size of the character
        int size = s.length();

        //getting the starting index and last index
        int start = 0;
        int last = size - 1;

        while (start <= last) {

            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);

            //checking whether the first character is an alphanumeric character
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }

                start++;
                last--;
            }
        }
        return true;
    }
}
