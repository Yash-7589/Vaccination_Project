package com.example.Vaccination_Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Vaccination_Data")
public class index {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String idType;
    private String contact;
    private String idNumber;
    private String vaccinationName;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIdType() {
        return idType;
    }
    public void setIdType(String idType) {
        this.idType = idType;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public String getVaccinationName() {
        return vaccinationName;
    }
    public void setVaccinationName(String vaccinationName) {
       this.vaccinationName = vaccinationName;
    }
    @Override
    public String toString() {
        return "index [Id=" + Id + ", name=" + name + ", idType=" + idType + ", contact=" + contact + ", idNumber="
                + idNumber + ", VaccinationName=" + vaccinationName + "]";
    }
    

}
