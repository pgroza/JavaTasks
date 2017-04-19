package Ion_Task_2_CIA.Task_2.Model;

/**
 * Created by pgroza on 3/20/2017.
 */
public class Main {

    public static void main(String[] args) {
        MultiDimensionalArrays showArray_3by3 = new MultiDimensionalArrays(3,
                3);
        MultiDimensionalArrays showArray_2by4 = new MultiDimensionalArrays(2,
                4);
        MultiDimensionalArrays showArray_5by10 = new MultiDimensionalArrays(5,
                10);

        showArray_3by3.printArray();
        showArray_2by4.printArray();
        showArray_5by10.printArray();
    }
}
