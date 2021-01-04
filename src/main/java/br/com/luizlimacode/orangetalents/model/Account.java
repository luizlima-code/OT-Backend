package br.com.luizlimacode.orangetalents.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Account {

    @GeneratedValue
    @Id
    private int id;
    @Column(name = "name")
    public String name;
    @Column(name = "email")
    public String email;
    @Column(name = "cpf")
    public String cpf;
    @Column(name = "birthdayDate")
    public Date birthdayDate;

    public Account() {
    }

    public Account(int id, String name, String email, String cpf, Date birthdayDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birthdayDate = birthdayDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }
}
