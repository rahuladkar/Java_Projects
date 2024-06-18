package Exception;

// ArrayIndexOutOfBoundsException

import java.util.Arrays;

public record AIOOBE() {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        try {
            System.out.println(arr[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println(Arrays.toString(arr));
    }
}
