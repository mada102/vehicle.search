package com.learn2code.vehicle.api.search.dao;

import com.learn2code.vehicle.api.search.entity.ManufacturerYear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufactureYearDAO extends JpaRepository<ManufacturerYear, Integer> {
}
