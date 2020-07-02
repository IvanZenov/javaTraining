package by.epam.arrays;

import java.util.Arrays;

public class ArrayMethods {
    

    //First Task
    public static int maxSumValueInArray(int [] array){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0, j = array.length - 1; i < array.length-1; i++,j--) {
            sum = array[i] + array[j];
            max = Integer.max(max,sum);
        }
        return max;
    }

    //Second Task
    public static int[] sequenceWithoutMinElement(int[] array){
        int min = findMinElement(array);
        return Arrays.stream(array).filter(a -> a!=min).toArray();
    }

    public static int findMinElement(int [] array){
        return Arrays.stream(array).min().orElse(Integer.MIN_VALUE);
    }

    //Third Task
    //TODO:write lock decision method :)


    public static int commonlyOccurringNumber(int [] array){
        int min = 0;
        int counter = 1;
        int [] countersArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i]==array[j]){
                    counter++;
                }
            }
            countersArray[i] = counter;
            if (countersArray[i] == countersArray[min]){
                if (array[min] > array[i]){
                    min = i;
                }
            }
            else {
                if (counter > countersArray[min]){
                    min = i;
                }
            }
        }
        return array[min];
    }

    //max even + min odd
    public static int foo(int [] array){
        return Arrays.stream(array).filter(i -> i % 2 == 0).max().orElse(0)
                + Arrays.stream(array).filter(i -> i % 2 != 0).min().orElse(0);
    }

}
