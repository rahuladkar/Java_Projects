package Upcasting;

public class EngineeringStudent extends Student{

    private String stream;

    // getter()
    public String getStream() {
        return stream;
    }

    // setter()
    public void setStream(String stream) {
        this.stream = stream;
    }

    // constructor to initialize the stream
    EngineeringStudent(String name , int stud_id , String stream){
        super(name,stud_id);
        this.stream = stream;

    }
}
