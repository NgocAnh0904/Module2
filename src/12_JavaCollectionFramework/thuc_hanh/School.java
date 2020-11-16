package JavaCollectionFramework.thuc_hanh;

import StackQueue.bai_tap.Student;

public class School implements Comparable<School> {
    private String name;
    private int age;
    private String address;


    public School(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
//        ép thành kiểu chuỗi
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(School school) {
        return this.getName().compareTo(school.getName());
    }
//    So sánh về thuộc tính

}
