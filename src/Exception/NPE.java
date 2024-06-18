package Exception;

// NullPointerException

import java.util.Arrays;

public class NPE {

    public static void main(String[] args) {

        int[] arr = null;

        try {
            System.out.println(arr[1]);
        }catch (NullPointerException e){
            System.out.println(e);
        }

        System.out.println(Arrays.toString(arr));

    }
}
