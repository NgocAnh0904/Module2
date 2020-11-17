package JavaCollectionFramework.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SchoolTest {
    public static void main(String[] args) {
        School student = new School("Kien", 30, "HT");
        School student1 = new School("Nam", 26, "HN");
        School student2 = new School("Anh", 38, "HT");
        School student3 = new School("Tung", 38, "HT");

        List<School> lists = new ArrayList<School>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);

        Collections.sort(lists);
        for (School st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (School st : lists) {
            System.out.println(st.toString());
        }
    }

}