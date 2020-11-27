package s0904_CaseStudy.Models;

import javax.swing.*;

public class Villa extends Services {
    private String standardRoom;
    private String descriptionComfort;
    private double areaPool;
    private int numFloor;

    public Villa(){

    }

    public Villa(String idCustomer, String nameService, double useAbleArea, double costRent, int numPeople, String rentType,
                 String standardRoom, String descriptionComfort, double areaPool, int numFloor) {
        super(idCustomer, nameService, useAbleArea, costRent, numPeople, rentType);
        this.standardRoom = standardRoom;
        this.descriptionComfort = descriptionComfort;
        this.areaPool = areaPool;
        this.numFloor = numFloor;
    }

    public Villa(String idCustomer, String nameService, String s, String s1, String s2, String rentType, String standardRoom, String descriptionComfort, String s3, String s4) {
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", descriptionComfort='" + descriptionComfort + '\'' +
                ", areaPool=" + areaPool +
                ", numFloor=" + numFloor +
                '}' + super.toString();
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }
}

