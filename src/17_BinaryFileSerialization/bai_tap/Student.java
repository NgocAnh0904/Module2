
package BinaryFileSerialization.bai_tap;

import java.io.Serializable;

// superclass
public class Student implements Serializable {
    private int id;
    private String name;
    private String dateOfBirth;

    public Student() {

    }

    public Student(int id, String name, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    void study() {
        System.out.println("Hoc theo cach kieu truyen thong");
    }

    public void test() {
        System.out.println("Thi giua ki, cuoi kia");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
