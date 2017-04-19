package Ion_Task_3_Basics.Model;


/**
 * Created by pgroza on 03/18/2017
 */
public class Main {

    public static void main (String[] args) {
        //Display arrays of type [Int]
        System.out.println("ARRAYs OF [INTEGER]");
        displayIntegers();

        //Display arrays of type [Double]
        System.out.println("\nARRAYs OF [DOUBLE]");
        displayDoubles();

        //Display arrays of type [Float]
        System.out.println("\nARRAYs OF [FLOAT]");
        displayFloat();

        //Display arrays of type [Char]
        System.out.println("\nARRAYs OF [CHAR]");
        displayChar();

    }

    public static void displayIntegers() {
        DataUtils arrayObject = new DataUtils();
        int[] mainArray = new int[2];

        System.out.println("2) Receive two parameters. Returns array. Print array.");
        mainArray = arrayObject.returnArray(2,5,10);
        arrayObject.printArray(mainArray);


        System.out.println("\n3) Receive array. Returns array. Fill array with random.");
        mainArray = arrayObject.fillArray(mainArray);
        int[] arrayFill = arrayObject.fillArray(new int[10]);
        arrayObject.printArray(arrayFill);


        System.out.println("\n4) Receive array. Returns void. Prints array.");
        int[] arrayPrint = arrayObject.fillArray(new int[5]);
        arrayObject.printArray(arrayPrint);


        System.out.println("\n5) Sort the array from 4).");
        int[] arraySort = arrayObject.sortArray(arrayPrint);
        arrayObject.printArray(arraySort);
    }

    public static void displayDoubles() {
        OtherDataTypes arrayObject = new OtherDataTypes();
        double[] mainArray = new double[2];

        System.out.println("2) Receive two parameters. Returns array. Print array.");
        mainArray = arrayObject.returnArray(2,5.3,10.6);
        arrayObject.printArray(mainArray);

        System.out.println("\n3) Receive array. Returns array. Fill array with random.");
        mainArray = arrayObject.fillArray(mainArray);
        double[] arrayFill = arrayObject.fillArray(new double[10]);
        arrayObject.printArray(arrayFill);

        System.out.println("\n4) Receive array. Returns void. Prints array.");
        double[] arrayPrint = arrayObject.fillArray(new double[5]);
        arrayObject.printArray(arrayPrint);

        System.out.println("\n5) Sort the array from 4).");
        double[] arraySort = arrayObject.sortArray(arrayPrint);
        arrayObject.printArray(arraySort);
    }

    public static void displayFloat() {
        OtherDataTypes arrayObject = new OtherDataTypes();
        float[] mainArray = new float[2];

        System.out.println("2) Receive two parameters. Returns array. Print array.");
        mainArray = arrayObject.returnArray(2,5,10);
        arrayObject.printArray(mainArray);

        System.out.println("\n3) Receive array. Returns array. Fill array with random.");
        mainArray = arrayObject.fillArray(mainArray);
        float[] arrayFill = arrayObject.fillArray(new float[10]);
        arrayObject.printArray(arrayFill);

        System.out.println("\n4) Receive array. Returns void. Prints array.");
        float[] arrayPrint = arrayObject.fillArray(new float[5]);
        arrayObject.printArray(arrayPrint);

        System.out.println("\n5) Sort the array from 4).");
        float[] arraySort = arrayObject.sortArray(arrayPrint);
        arrayObject.printArray(arraySort);
    }

    public static void displayChar() {
        OtherDataTypes arrayObject = new OtherDataTypes();
        char[] mainArray = new char[2];

        System.out.println("2) Receive two parameters. Returns array. Print array.");
        mainArray = arrayObject.returnArray(2,'c','d');
        arrayObject.printArray(mainArray);

        System.out.println("\n3) Receive array. Returns array. Fill array with random.");
        mainArray = arrayObject.fillArray(mainArray);
        char[] arrayFill = arrayObject.fillArray(new char[10]);
        arrayObject.printArray(arrayFill);

        System.out.println("\n4) Receive array. Returns void. Prints array.");
        char[] arrayPrint = arrayObject.fillArray(new char[5]);
        arrayObject.printArray(arrayPrint);

        System.out.println("\n5) Sort the array from 4).");
        char[] arraySort = arrayObject.sortArray(arrayPrint);
        arrayObject.printArray(arraySort);
    }
}

/*
QUESTION TO ASK:

What is best practice (longer form or shorter form)

int[] arraySort = arrayObject.sortArray(arrayPrint);
arrayObject.printArray(arraySort);

OR

arrayObject.printArray(arrayObject.sortArray(arrayPrint));

*/

