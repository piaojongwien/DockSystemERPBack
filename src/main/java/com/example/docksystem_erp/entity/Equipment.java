package com.example.docksystem_erp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "equipments")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipNo;
    @Column(nullable = false,unique = true,length = 100)
    private String equipCode;
    @Column(nullable = false,length = 100)
    private String equipName;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EquipmentStatusType type;
    @Column(nullable = false)
    private Long equipPrice;
    @Column(nullable = false)
    private Long equipDepreciation;
    @Column(nullable = false)
    private Date equipPurchaseDate;
    @Column(nullable = false)
    private Date equipLastInspected;
    @ManyToOne
    @JoinColumn(name = "equip_manager_no")
    private User manager;


}

