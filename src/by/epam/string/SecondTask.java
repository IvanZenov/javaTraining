package by.epam.string;

import by.epam.task1.FirstTask;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import static java.util.stream.Collectors.joining;

public class SecondTask {

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
        str.chars().distinct().forEach(s -> result.append((char) s));
        return result;
    }

    //Frequency of occurrence of a character in a string
    public static long frequencyOfOccurrenceCharacter(String str, char s){
        return str.chars().filter(c->c==s).count();
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
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        return words[0].length();
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
    //TODO: understand what is meant

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
    public static BigInteger additionOfVeryLongIntegers (String str){
        String [] numbers = str.split(" ");
        return BigInteger
                .valueOf(Arrays.stream(numbers)
                .map(Integer::valueOf)
                .reduce(0,Integer::sum)
                );
    }

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
    //TODO: understand what is meant

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
