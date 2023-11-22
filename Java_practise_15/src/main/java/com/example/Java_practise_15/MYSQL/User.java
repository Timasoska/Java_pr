package com.example.Java_practise_15.MYSQL;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String expirationDate, cvv;
    private Integer cardNumber, promoCode;

    public User(Integer cardNumber,String expirationDate, String cvv, Integer promoCode) {
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.promoCode = promoCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(Integer promoCode) {
        this.promoCode = promoCode;
    }

    public User() {
    }


}