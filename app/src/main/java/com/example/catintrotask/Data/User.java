package com.example.catintrotask.Data;

public class User {
    String Name;
    int Id;
    int Image;

    public User(String name, int id, int image) {
        Name = name;
        Id = id;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
