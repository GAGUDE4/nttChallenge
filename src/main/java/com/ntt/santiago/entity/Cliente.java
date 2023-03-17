package com.ntt.santiago.entity;


import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TYPEID")
    private String typeId;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "SECONDNAME")
    private String secondName;


    @Column(name = "FIRSTLASTNAME")
    private String firstLastName;
    @Column(name = "SECONDLASTNAME")
    private String secondLastName;

    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITY")
    private String city;

    public Cliente() {
    }

    public Cliente(Integer id, String typeId, String firstName, String secondName, String firstLastName, String secondLastName, String telefone, String address, String city) {
        this.id = id;
        this.typeId = typeId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.telefone = telefone;
        this.address = address;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}