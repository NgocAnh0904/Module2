package InheritanceJava.thuc_hanh;

public class Student extends Person {
    public void Study(){
        System.out.println("I study~");
    }

    @Override
    public void Run() {
        System.out.println("Sinh Vien dang chay");
    }


}