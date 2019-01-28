package com.example.dd.myapplication;

public class Contact {

    private String Name;
    private String Phone;
    private int Image;

    public Contact(String name, String phone, int image) {
        Name = name;
        Phone = phone;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }


}
