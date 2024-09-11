package com.learn2code.vehicle.api.search.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "manufactur_year" )
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int year;
}
