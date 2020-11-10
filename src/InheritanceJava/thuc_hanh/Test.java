package InheritanceJava.thuc_hanh;

public class Test {
    public static void main(String[] args) {
        Person person = new Student(); //Ep kieu ngam dinh
        person.Run();
        ((Student) person).Study(); //Ep kieu tuong minh
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Student);
    }
}
