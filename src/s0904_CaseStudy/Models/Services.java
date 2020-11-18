package s0904_CaseStudy.Models;

public abstract class Services {
    String id;
    String nameService;
    String useAbleArea;
    //    dien tich su sung useableArea
    String typeRent;
    double costRent;
    int numPeople;

    public Services(String id, String nameService, String useAbleArea, String typeRent, double costRent, int numPeople) {
        this.id = id;
        this.nameService = nameService;
        this.useAbleArea = useAbleArea;
        this.costRent = costRent;
        this.numPeople = numPeople;
        this.typeRent = typeRent;
    }

    public Services() {

    }

    public abstract void showInfo();


}
