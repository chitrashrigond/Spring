package com.xworkz.gun.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Generated;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="gundetails")
public class GunDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_Id")
    private int id;
    @Column(name = "C_ModelNo")
    private String modelNo;
    @Column(name = "C_Price")
    private double price;
    @Column(name = "C_Type")
    private String type;

}
