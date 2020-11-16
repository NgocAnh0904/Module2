package BinaryFileSerialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainReadWriteBinary {
    public static void main(String[] args) {

//        BufferedWriter bufferedwriter =
//                new BufferedWriter(new FileWriter(
//                  new File("src/_15_io_text_file/student.csv"), true));

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream(
                            new File("txt")
                    ));

           Student student1 = new Student(123, "Nguyen Van A", "16/11/2020");
            Student student2 = new Student(456, "Nguyen Van B", "16/11/2020");

//            bufferedwriter.write("5,Quoc Hung,13/11/1999");
            List<Student> studentList = new ArrayList<>();
            studentList.add(student1);
            studentList.add(student2);

//            objectOutputStream.writeObject(student1);
//            objectOutputStream.writeObject(student2);
            objectOutputStream.writeObject(studentList);
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream(
                            new File("src/BinaryFileSerialization/bai_tap/abc.csv")
                    )
            );
            // (Con) cha
//            Student studentOut1 = (Student) objectInputStream.readObject();
//            Student studentOut2 = (Student) objectInputStream.readObject();
//            System.out.println(studentOut1);
//            System.out.println(studentOut2);
            List<Student> studentListOut = (List<Student>) objectInputStream.readObject();
            System.out.println(studentListOut);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
