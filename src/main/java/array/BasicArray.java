package array;


import java.sql.Array;
import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        String[] array = new String[100];
        for(int i=0; i< array.length; i++) {
            array[i] = "Hie";
        }

        Arrays.stream(array).forEach( x -> {
            System.out.println(x);
        });
    }
}
