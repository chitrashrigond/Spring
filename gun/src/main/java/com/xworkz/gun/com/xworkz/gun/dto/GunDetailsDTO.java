package com.xworkz.gun.com.xworkz.gun.dto;

import lombok.*;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class GunDetailsDTO {
    private int id;
    private String modelNo;
    private double price;
    private String type;

}
