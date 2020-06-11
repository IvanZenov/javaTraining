package by.epam.string;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class SecondTask {

    public static void main(String[] args) {
    }

    private static final int ONE_HUNDRED_PERCENT = 100;

    //Divide even and odd characters into different lines
    public static void oddEvenSymbols(String str){
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i%2!=0){
                even.append(str.charAt(i));
            }
            else odd.append(str.charAt(i));
        }
        System.out.println("Odd " + odd);
        System.out.println("Even " + even);
    }

    //Percentage of uppercase and lowercase letters
    /**
     * Use 2 method. percentageUppercase counts the percentage of occurrence uppercase
     * Then percentageLowerCase - counts the percentage of occurrence lowercase
     * */
    public static double percentageUppercase(String str){
        double counterUpperCase = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                counterUpperCase++;
            }
        }
        return (counterUpperCase/str.length())*ONE_HUNDRED_PERCENT;
    }

    public static double percentageLowerCase(String str){
        return ONE_HUNDRED_PERCENT - percentageUppercase(str);
    }

    //Deleting identical characters
    public static StringBuilder deleteSameSymbol (String str){
        StringBuilder result = new StringBuilder();
        /**
         * Use Java 8 advantages:
         * 1. get chars (it's IntStream)
         * 2. delete same with distinct
         * 3. Use lambda expression for add unique symbol to result
         */
        str.chars().distinct().forEach(s -> result.append((char) s));
        return result;
    }

    //Frequency of occurrence of a character in a string
    //TODO: write this method
    public static int frequencyOfOccurrenceCharacter(String str, char s){

        return 0;
    }

    //String reverse
    public static StringBuilder reverse(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse();
    }

    //Inserting a substring
    public static StringBuilder insertSubstring(String str,String subStr, int place){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.insert(place,subStr);
        return stringBuilder;
    }

    //Deleting a substring
    public static String deleteSubstring(String str, String subStr){
        return str.replaceAll(subStr,"");
    }

    //Copying part of a line
    public static String copySubstring(String str, int start, int end){
        return str.substring(start, end);
    }

    //Determining the length of a string
    public static int stringLength(String str){
        return str.length();
    }

    //Number of occurrences of a substring in a string
    public static int countSubstring(String str, String subString){
        String strWithoutSubstring = str.replace(subString,"");
        return (str.length() - strWithoutSubstring.length())/subString.length();
    }

    //Print the words of the string in reverse order
    public static void showReverseWord (String str){
        String[] words = str.split(" ");
        int i = words.length - 1;
        while (i>=0){
            System.out.println(words[i]);
            i--;
        }
    }

    //Replace spaces and groups of spaces with the symbol "*"
    public static String replaceSpace(String str){
        return str.replaceAll(" ","*");
    }

    //Replace the letter 'a' with 'b'in the longest word of the string
    public static String getMaxLengthWordWithReplacement(String str)
    {
        String[]words=str.split(" ");
        String wordWithMaxLength="";
        for(String word: words)
        {
            if(word.length()>wordWithMaxLength.length())
                wordWithMaxLength=word;
        }
        return wordWithMaxLength.replaceAll("a","b");
    }

    //Determine the length of the shortest word in a string
    public static int getMinLengthWord(String str)
    {
        String[]words=str.split(" ");
        String wordWithMinLength="";
        for(String word: words)
        {
            //TODO should be < but u need check max value of String
            if(word.length()>wordWithMinLength.length())
                wordWithMinLength=word;
        }
        return wordWithMinLength.length();
    }

    //Counting the number of words per line
    public static int countWordInString (String str){
        return str.split(" ").length;
    }

    //To change the words in some places
    public static String changeFirstAndLastWord (String str){
        String[] words = str.split(" ");
        String temp = words[words.length - 1];
        words[words.length - 1] = words[0];
        words[0] = temp;
        str = String.join(" ", words);
        return str;
    }

    //Deleting the last word in a line
    public static String deleteLastWord (String str){
        return str.substring(0, str.lastIndexOf(" "));
    }

    //Adding spaces to a string
    //

    //Is the string a palindrome?
    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    //Replacing a substring in a string
    public static String replaceSubstring(String str,String oldSub,String newSub){
        return str.replace(oldSub,newSub);
    }

    //The addition of a very long integers
    //
    //Deleting words of the specified length from a string
    public static String deleteWordWithLength(String str,int n){
        String[] words = str.split(" ");
        str = Arrays.stream(words)
                .filter(s -> s.length()!=n)
                .map(s -> s+ " ")
                .collect(joining());
        return str;
    }

    //Removing extra spaces
    //
    //Selecting words from a string
    public static void selectWord (String str, int position){
        String [] words = str.split(" ");
        if (words.length<position){
            System.out.println("No such position");
        }
        else {
            Arrays.stream(words).forEach(System.out::println);
        }
    }
}
