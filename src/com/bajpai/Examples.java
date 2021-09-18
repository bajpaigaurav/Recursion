package com.bajpai;

public class Examples {


    public static void main(String[] args) {
        System.out.println(sumRecursively(10));
        System.out.println(sumRecursively(3));
        System.out.println(reverseString("Gaurav Bajpai"));
        System.out.println(isPalindrome("aabbaa")); // true
        System.out.println(isPalindrome("Gaurav")); // false
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(convertToBinary(2));
        System.out.println(convertToBinary(100));
    }

    public static int sumRecursively(int n) {
        if(n == 0) { // base case
            return 0;
        }
        return n + sumRecursively(n - 1); // recursive call with reduced problem space
    }

    public static String reverseString(String s) {
        if (s.length() == 0) {
            return "";
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static boolean isPalindrome(String s) {
        // base cases
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        // first checking is current chars are same or not
        // then shrinking the space by substringing the string
        if( s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length()-1));
        }
        // if above if fails means we are having a string which is not palindrome
        // can also be looked as base negative case
        return false;
    }

    public static String convertToBinary(int n) {
        if( n <= 0) {
            return "";
        }

        return n%2 + convertToBinary(n/2);
    }

}
