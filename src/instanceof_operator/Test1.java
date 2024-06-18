package instanceof_operator;

public class Test1 {

    public static void main(String[] args) {

        Object object1 = new A();

        System.out.println(object1 instanceof A); // true
        System.out.println(object1 instanceof B); // false
        System.out.println(object1 instanceof C); // false
        System.out.println(object1 instanceof D); // false

        System.out.println("------------------------------");

        Object object2 = new B();

        System.out.println(object2 instanceof A); // true
        System.out.println(object2 instanceof B); // true
        System.out.println(object2 instanceof C); // false
        System.out.println(object2 instanceof D); // false

        System.out.println("------------------------------");

        Object object3 = new C();

        System.out.println(object3 instanceof A); // true
        System.out.println(object3 instanceof B); // false
        System.out.println(object3 instanceof C); // true
        System.out.println(object3 instanceof D); // false

        System.out.println("------------------------------");

        Object object4 = new D();

        System.out.println(object4 instanceof A); // true
        System.out.println(object4 instanceof B); // false
        System.out.println(object4 instanceof C); // true
        System.out.println(object4 instanceof D); // true
    }
}
