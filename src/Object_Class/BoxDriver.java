package Object_Class;

public class BoxDriver {

    public static void main(String[] args) {

        Box box1 = new Box("Cardbox",100);
        Box box2 = new Box("Paperbox",200);

        System.out.println(box1 + "\n" + box2);
        System.out.println("Custom Address for box1 : " + box1.hashCode());
        System.out.println("Custom Address for box2 : " + box2.hashCode());
        System.out.println("Is price of box1 and box2 equals : " + box1.equals(box2));
    }

}
