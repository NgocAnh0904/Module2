package JavaCollectionFramework.bai_tap;

import java.util.Comparator;

public class CostComparator implements Comparator<Product> {
    public boolean choose;

    public CostComparator(boolean choose) {
        this.choose = choose;
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (this.choose) {
            if (o1.getCost() > o2.getCost()) {
                return 1;
            } else if (o1.getCost() == o2.getCost()) {
                return 0;
            } else {
                return -1;
            }
        } else {
            if (o1.getCost() < o2.getCost()) {
                return 1;
            } else if (o1.getCost() == o2.getCost()) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
