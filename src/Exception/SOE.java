package Exception;

// StackOverflowError

public class SOE {

    static int recursion(){
        int i = 1;
        return i++ + recursion();
    }

    public static void main(String[] args) {

        try {
            System.out.println(recursion());
        }catch (StackOverflowError e){
            System.out.println(e);
        }


    }
}
