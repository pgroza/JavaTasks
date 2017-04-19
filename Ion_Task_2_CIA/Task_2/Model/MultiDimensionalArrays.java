package Ion_Task_2_CIA.Task_2.Model;

import java.util. *;

/**
 * Created by pgroza on 3/20/2017.
 */
public class MultiDimensionalArrays {

    private int row;
    private int column;
    private int min ;
    private int max;
    private int[][] array;

    public MultiDimensionalArrays(int row, int column) {
        this.row = row;
        this.column = column;
        array = new int[row][column];

        Set<Integer> arraySet = new HashSet<>();

        for(row = 0; row<array.length; row++){
            for(column = 0; column<array[row].length; column++){

                boolean isStatusControl = true;
                while(isStatusControl){
                    int temporaryRandom = randomInit(min, max);
                    if(!arraySet.contains(temporaryRandom)) {
                        array[row][column] = temporaryRandom;
                        arraySet.add(temporaryRandom);
                        isStatusControl = false;
                    }
                }
            }
            System.out.println();
        }
    }

    public int randomInit(int min, int max) {
        this.min = min;
        this.max = max;
        min = 1;
        max = row * column;

        Random generateRandom = new Random();
        int randomNumber = generateRandom.nextInt((max - min) + 1) + min;

        return randomNumber;
    }

    public void printArray() {
        System.out.println("\nArray size: [" + row + "][" + column +"]");

        for(int r_count = 0; r_count<row; r_count++){
            for(int c_count = 0; c_count<column; c_count++){
                //system input
                System.out.print(this.array[r_count][c_count] + "\t");
            }
            System.out.println();
        }
    }
}
