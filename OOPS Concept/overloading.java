class Student{

    void marks(int a){
        System.out.println("this is c++ Marks: ");
    }

    void marks(int a, int b){
        System.out.println("this is java Marks: ");
    }

    void marks(int a, int b, int c){
        System.out.println("this is python Marks: ");
    }
}

public class overloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks(85);
        s1.marks(85, 90);
        s1.marks(85, 90, 95);
    }
}