package Student_Management_System;

public class Student {

    private String name;
    private String _class;
    private int[] marks;

    Student(String name, String _class, int[] marks) {
        this.name = name;
        this._class = _class;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String get_class() {
        return _class;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void set_class(String _class) {
        this._class = _class;
    }
}

