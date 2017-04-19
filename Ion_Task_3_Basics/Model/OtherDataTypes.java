package Ion_Task_3_Basics.Model;

import java.util.Random;

/**
 * Created by pgroza on 03/18/2017
 */
public class OtherDataTypes {
    //Overloading for Double
    public static double[] returnArray(int arraySize, double paramOne, double
            paramTwo) {
        double[] arrayOne = new double[arraySize];

        if (arraySize == 0) {
            arrayOne[0] = paramOne;
        } else {
            arrayOne[0] = paramOne;
            arrayOne[1] = paramTwo;
        }
        return arrayOne;
    }

    public static double[] fillArray(double[] generalArray) {
        double[] arrayTwo = new double[generalArray.length];
        Random generateRandom = new Random();

        for (int counter = 0; counter < generalArray.length; counter++) {
            arrayTwo[counter] = generateRandom.nextDouble()*100;
        }
        return arrayTwo;
    }

    public static void printArray(double[] generalArray) {
        System.out.println("Index\tValue");

        for (int counter = 0; counter<generalArray.length; counter++){
            System.out.println(counter + "\t\t" + generalArray[counter]);
        }
    }

    public static double[] sortArray(double[] generalArray) {
        for (int elementOne = 0; elementOne < generalArray.length;
             elementOne++) {
            for (int elementTwo = 0; elementTwo < generalArray.length;
                 elementTwo++) {

                if (generalArray[elementOne] < generalArray[elementTwo]) {
                    double temp = generalArray[elementOne];
                    generalArray[elementOne] = generalArray[elementTwo];
                    generalArray[elementTwo] = temp;
                }
            }
        }
        return generalArray;
    }


    //Overloading for Float
    public static float[] returnArray(int arraySize, float paramOne, float
            paramTwo) {
        float[] arrayOne = new float[arraySize];

        if (arraySize == 0) {
            arrayOne[0] = paramOne;
        } else {
            arrayOne[0] = paramOne;
            arrayOne[1] = paramTwo;
        }
        return arrayOne;
    }

    public static float[] fillArray(float[] generalArray) {
        float[] arrayTwo = new float[generalArray.length];
        Random generateRandom = new Random();

        for (int counter = 0; counter < generalArray.length; counter++) {
            arrayTwo[counter] = generateRandom.nextFloat()*100;
        }
        return arrayTwo;
    }

    public static void printArray(float[] generalArray) {
        System.out.println("Index\tValue");

        for (int counter = 0; counter<generalArray.length; counter++){
            System.out.println(counter + "\t\t" + generalArray[counter]);
        }
    }

    public static float[] sortArray(float[] generalArray) {
        for (int elementOne = 0; elementOne < generalArray.length;
             elementOne++) {
            for (int elementTwo = 0; elementTwo < generalArray.length;
                 elementTwo++) {

                if (generalArray[elementOne] < generalArray[elementTwo]) {
                    float temp = generalArray[elementOne];
                    generalArray[elementOne] = generalArray[elementTwo];
                    generalArray[elementTwo] = temp;
                }
            }
        }
        return generalArray;
    }


    //Overloading for Char
    public static char[] returnArray(int arraySize, char paramOne, char
            paramTwo) {
        char[] arrayOne = new char[arraySize];

        if (arraySize == 0) {
            arrayOne[0] = paramOne;
        } else {
            arrayOne[0] = paramOne;
            arrayOne[1] = paramTwo;
        }
        return arrayOne;
    }

    public static char[] fillArray(char[] generalArray) {
        char[] arrayTwo = new char[generalArray.length];
        Random generateRandom = new Random();

        for (int counter = 0; counter < generalArray.length; counter++) {
            arrayTwo[counter] = (char)(generateRandom.nextInt(26) + 'a');
        }
        return arrayTwo;
    }

    public static void printArray(char[] generalArray) {
        System.out.println("Index\tValue");

        for (int counter = 0; counter<generalArray.length; counter++){
            System.out.println(counter + "\t\t" + generalArray[counter]);
        }
    }

    public static char[] sortArray(char[] generalArray) {
        for (int elementOne = 0; elementOne < generalArray.length;
             elementOne++) {
            for (int elementTwo = 0; elementTwo < generalArray.length;
                 elementTwo++) {

                if (generalArray[elementOne] < generalArray[elementTwo]) {
                    char temp = generalArray[elementOne];
                    generalArray[elementOne] = generalArray[elementTwo];
                    generalArray[elementTwo] = temp;
                }
            }
        }
        return generalArray;
    }

}
