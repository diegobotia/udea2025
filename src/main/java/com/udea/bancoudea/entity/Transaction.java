package com.udea.bancoudea.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column(nullable = false)
private String senderAccountNumber;
@Column(nullable = false)
private String receiverAccountNumber;
@Column(nullable = false)
private Double amount;
@Column(nullable = false)
private LocalDateTime timestamp;

    public Transaction() {
    }

    //Setters y Getters
}
