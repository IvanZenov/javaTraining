package by.epam.string;

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

    //Удаление одинаковых символов
    //TODO: should return str
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
    //Частота встречаемости символа в строке
    //TODO: write this method
    public static int frequencyOfOccurrenceCharacter(String str, char s){

        return 0;
    }

    //String reverse
    public static StringBuilder reverse(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse();
    }

    //Вставка подстроки
    //TODO: recheck return value
    public static StringBuilder insertSubstring(String str,String subStr, int place){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.insert(place,subStr);
        return stringBuilder;
    }
    //Удаление подстроки
    public static String deleteSubstring(String str, String subStr){
        return str.replaceAll(subStr,"");
    }
    //
    //Копирование части строки
    public static String copySubstring(String str, int start, int end){
        return str.substring(start, end);
    }
    //Определение длины строки
    public static int stringLength(String str){
        return str.length();
    }
    //Количество вхождений подстроки в строку
    public static int countSubstring(String str, String subString){
        String strWithoutSubstring = str.replace(subString,"");
        return (str.length() - strWithoutSubstring.length())/subString.length();
    }
    //Вывести слова строки в обратном порядке
    //
    //Заменить пробел и группы пробелов символом "*"
    public static String changeSpace(String str){
        return str.replaceAll(" ","*");
    }
    //Заменить в самом длинном слове строки буквы 'a' на 'b'
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

    //Определить длину самого короткого слова в строке
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

    //Подсчет количества слов в строке
    //
    //Поменять слова местами
    //
    //Удаление последнего слова в строке
    public static String deleteLastWord (String str){
        return str.substring(0, str.lastIndexOf(" "));
    }
    //Добавление пробелов в строку
    //
    //Является ли строка палиндром?
    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    //Замена подстроки в строке
    //
    //Сложение очень длинных целых чисел
    //
    //Удаление из строки слов заданной длины

    //Удаление лишних пробелов
    //
    //Выделение слов из строки
}
