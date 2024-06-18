package Exception;

// StringIndexOutOfBoundsException

public class SIOOBE {

    public static void main(String[] args) {

        String str = "Rahul";

        try {
            System.out.println(str.charAt(5));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println(str);

    }
}
