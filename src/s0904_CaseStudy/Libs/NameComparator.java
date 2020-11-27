package s0904_CaseStudy.Libs;

import s0904_CaseStudy.Models.Customers;

import java.util.Comparator;

public class NameComparator implements Comparator<Customers> {

    @Override
    public int compare(Customers c1, Customers c2) {
        if (c1.getNameCustomer().compareTo(c2.getNameCustomer()) == 0) {
            return new AgeComparator().compare(c1,c2);
        }
        return c1.getNameCustomer().compareTo(c2.getNameCustomer());
    }
}
