package team.a.fruitshop.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Supplier {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long supplierId;
    private String supplierName;
    private String contact;
    private String address;


    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
    private LocalDateTime updateAt;



}