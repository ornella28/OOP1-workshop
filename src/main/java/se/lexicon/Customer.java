package se.lexicon;

import java.time.LocalDate;

public class Customer {

    //Encapsulation

    private int id;
    private String name;
    private String email;
    private LocalDate birthDate;

    //Creating constructor to initialize fields


    public Customer(int id, String name, String email, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    //Getter and Setter methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email==null || !email.contains("@")) {
            throw new IllegalArgumentException("Email is not valid");
        }
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate.isAfter(LocalDate.now()) || birthDate.equals(LocalDate.now())) {
            throw new IllegalArgumentException("Birth date cannot be in the future");
        }
        this.birthDate = birthDate;
    }

   //Override method toString()


    @Override
    public String toString() {
        return "Id: " + id +
                ", Name: " + name +
                ", Email: " + email +
                ", Birth Date: " + birthDate;
    }
}
