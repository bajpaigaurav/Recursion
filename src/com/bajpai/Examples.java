package com.bajpai;

public class Examples {


    public static void main(String[] args) {
        System.out.println("Sum:"+sumRecursively(10));
        System.out.println("Sum:"+sumRecursively(3));
        System.out.println("Reversed String:"+reverseString("Gaurav Bajpai"));
        System.out.println("Is Palindrome:"+isPalindrome("aabbaa")); // true
        System.out.println("Is Palindrome:"+isPalindrome("Gaurav")); // false
        System.out.println("Is Palindrome:"+isPalindrome("racecar")); // true
        System.out.println("Converted binary number:"+convertToBinary(2));
        System.out.println("Converted binary number:"+convertToBinary(100));
        System.out.println("Binary search:"+binarySearchRecursively(new int[]{1,2,3,4,5,6}, 4, 0, 5));
        System.out.println("Binary search:"+binarySearchRecursively(new int[]{1,2,3,4,5,6}, 10, 0, 5));
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

    public static int binarySearchRecursively(int[] arr, int target, int left, int right) {

        if(left > right) {
            return -1;
        }

        int mid = (left + right) / 2 ;

        if(arr[mid] == target) {
            return mid;
        }
        if(arr[mid] < target) {
            return binarySearchRecursively(arr, target, mid+1, right);
        }

        return binarySearchRecursively(arr, target, left, mid - 1);
    }

}
