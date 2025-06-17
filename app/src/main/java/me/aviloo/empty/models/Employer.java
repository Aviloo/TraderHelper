package me.aviloo.empty.models;

public class Employer {

    private String name;
    private String address;
    private String phone;

    public Employer(String name, String address,String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Employer(String name,String address){
        this.name = name;
        this.address = address;
        this.phone = "Не указан";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
