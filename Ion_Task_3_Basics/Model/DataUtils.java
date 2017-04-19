package Ion_Task_3_Basics.Model;

import java.util.Random;

/**
 * Created by pgroza on 03/18/2017
 */
public class DataUtils {

    public static int[] returnArray(int arraySize, int paramOne, int paramTwo) {
        int[] arrayOne = new int[arraySize];

        if (arraySize == 0) {
            arrayOne[0] = paramOne;
        } else {
            arrayOne[0] = paramOne;
            arrayOne[1] = paramTwo;
        }
        return arrayOne;
    }

    public static int[] fillArray(int[] generalArray) {
        int[] arrayTwo = new int[generalArray.length];
        Random generateRandom = new Random();

        for (int counter = 0; counter < generalArray.length; counter++) {
            arrayTwo[counter] = generateRandom.nextInt(100);
        }
        return arrayTwo;
    }

    public static void printArray(int[] generalArray) {
        System.out.println("Index\tValue");

        for (int counter = 0; counter<generalArray.length; counter++){
            System.out.println(counter + "\t\t" + generalArray[counter]);
        }
    }

    public static int[] sortArray(int[] generalArray) {
        for (int elementOne = 0; elementOne < generalArray.length;
             elementOne++) {
            for (int elementTwo = 0; elementTwo < generalArray.length;
                 elementTwo++) {

                if (generalArray[elementOne] < generalArray[elementTwo]) {

                    int temp = generalArray[elementOne];
                    generalArray[elementOne] = generalArray[elementTwo];
                    generalArray[elementTwo] = temp;
                }
            }
        }
        return generalArray;
    }

}

/*
QUESTION TO ASK:

>>sortArray method<<

By CleanCode rules - we shouldn't include in a method
nested For and If statements (not more than 3)

Dividing the above code into methods doesn't really make sense
is there another way to rewrite such logic or we should leave it this way?
*/
