package s0904_CaseStudy.Models;

public abstract class Services {
    protected String idCustomer;
    protected String nameService;
    protected double useAbleArea;
    protected double costRent;
    protected int numPeople;
    protected String rentType;

    public Services() {
    }

    public Services(String idCustomer, String nameService, double useAbleArea, double costRent,
                    int numPeople, String rentType) {
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.useAbleArea = useAbleArea;
        this.costRent = costRent;
        this.numPeople = numPeople;
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + idCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", useAbleArea='" + useAbleArea + '\'' +
                ", costRent='" + costRent + '\'' +
                ", numPeople='" + numPeople + '\'' +
                ", rentType='" + rentType + '\'' +
                '}';
    }

    public abstract void showInfo();

    public String getId() {
        return idCustomer;
    }

    public void setId(String id) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUseAbleArea() {
        return useAbleArea;
    }

    public void setUseAbleArea(double useAbleArea) {
        this.useAbleArea = useAbleArea;
    }

    public double getCostRent() {
        return costRent;
    }

    public void setCostRent(double costRent) {
        this.costRent = costRent;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
}
