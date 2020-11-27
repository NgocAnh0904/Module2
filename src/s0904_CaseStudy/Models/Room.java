package s0904_CaseStudy.Models;

public class Room extends Services {
    private ExtraService extraService;

    public Room(){

    }

    public Room(String id, String nameService, double useAbleArea, double costRent, int numPeople, String rentType,
                ExtraService extraService) {
        super(id, nameService, useAbleArea, costRent, numPeople, rentType);
        this.extraService = extraService;
    }

    public Room(String idCustomer, String nameService, String s, String s1, String s2, String rentType, String s3) {
    }

    @Override
    public String toString() {
        return "Room{" +
                "extraService=" + extraService +
                '}' + super.toString();
    }

    @Override
    public void showInfo(){

        System.out.println(this.toString());
    }

    public ExtraService getExtraService() {
        return extraService;
    }

    public void setExtraService(ExtraService extraService) {
        this.extraService = extraService;
    }
}

