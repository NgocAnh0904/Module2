package s0904_CaseStudy.Models;

import java.util.ArrayList;

public class Customers {
    String name;
    String dateOfBirth;
    String gender;
    String phone;
    String email;
    String special;
    String address;
    Services services;
    private ArrayList listCustomer = new ArrayList();

    public Customers() {
    }

    public Customers(String name, String dateOfBirth, String gender,
                     String phone, String email, String special, String address, Services services) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.special = special;
        this.address = address;
        this.services = services;
    }

    public void addCustomer() {
        int idCustomer = (listCustomer.size() > 0) ? (listCustomer.size() + 1) : 1;
        System.out.println("product id = " + idCustomer);
    }
}
