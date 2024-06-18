package Exception;

// ClassCastException

public class CCE {

    public static void main(String[] args) {

        Object exception = new String("Rahul");

        try {
            System.out.println((Integer)exception);
        }catch (ClassCastException e){
            System.out.println(e);
        }
    }
}
