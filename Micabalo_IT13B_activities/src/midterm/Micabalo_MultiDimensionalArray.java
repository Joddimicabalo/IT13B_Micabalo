package midterm;

public class Micabalo_MultiDimensionalArray {
    public static void main(String[] args){
        int numbers[][] = {
            {1, 2, 3, 4,},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        for (int c = 0; c< numbers.length; c++){
            System.out.print("The Elements in Row " + (c + 1) + ": ");
            for (int z = 0; z< numbers[c].length; z++){
                System.out.print(numbers[c][z] + " ");
            }
            System.out.println();
        }
    }
}
