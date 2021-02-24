package ru.geekbrains.User;

import java.math.BigDecimal;

public class User {

    private String Name;

    private String Surname;

    private String Email;



    public User() {
    }

    public User(String name, String surname, String email) {
        this.Name = name;
        this.Surname = surname;
        this.Email = email;

    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
