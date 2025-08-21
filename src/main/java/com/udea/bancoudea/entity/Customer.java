package com.udea.bancoudea.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    // POJO

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String accountNumber;
    @Column(nullable = false, length = 50)
    private String firstName;
    @Column(nullable = false, length = 50)
    private String lastName;
    @Column(nullable = false)
    private Double balance;

    public Customer() {
    }
    @JsonCreator
    public Customer(@JsonProperty("id") Long id, @JsonProperty("accountNumber") String accountNumber, @JsonProperty("firstName") String firstName, @JsonProperty("lastName")  String lastName, @JsonProperty("balance")  Double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

   //Setters y Getters
}
