package com.cr.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "t_car")
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String model;

    @Column(nullable = false)
    private Integer door;

    @Column(nullable = false)
    private Integer seat;

    @Column(nullable = false)
    private Integer luggage;

    @Column(length = 30, nullable = false)
    private String  transmission;

    @Column(nullable = false)
    private Boolean airConditioning;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private Double pricePerHour;

    @Column(length = 30, nullable = false)
    private String fuelType;

    @Column
    private Boolean builtIn = false;

}
