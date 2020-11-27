package s0904_CaseStudy.Models;

public class House extends Services {
    private String standardRoom;
    private String descriptionComfort;
    private int numFloor;

    public House(){

    }

    public House(String standardRoom, String descriptionComfort, int numFloor) {
        this.standardRoom = standardRoom;
        this.descriptionComfort = descriptionComfort;
        this.numFloor = numFloor;
    }

    public House(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", descriptionComfort='" + descriptionComfort + '\'' +
                ", numFloor=" + numFloor +
                '}';
    }

    @Override
    public void showInfo(){
        System.out.println(this.toString());
    }
    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionComfort() {
        return descriptionComfort;
    }

    public void setDescriptionComfort(String descriptionComfort) {
        this.descriptionComfort = descriptionComfort;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }
//    public String toString() {
//        return "House{" + super.toString() +
//                "standardRoom='" + standardRoom + '\'' +
//                ", descriptionComfort='" + descriptionComfort + '\'' +
//                ", numFloor='" + numFloor + '\'' +
//                '}';
//    }
}
