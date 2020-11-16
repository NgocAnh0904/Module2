package JavaCollectionFramework.thuc_hanh;

import java.util.Comparator;

public class AgeComparator implements Comparator<School> {
    @Override
    public int compare(School o1, School o2) {
        if (o1.getAge() > o2.getAge()) {


            return 1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }
}
