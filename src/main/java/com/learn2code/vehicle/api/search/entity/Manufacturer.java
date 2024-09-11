package com.learn2code.vehicle.api.search.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "manufacturer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "manufacturer_name")
    private String manufacturerName;
    @Column (name = "country_of_origin")
    private String countryOfOrigin;
}
