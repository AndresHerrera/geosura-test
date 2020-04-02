package com.geosura.geosuratest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geosura.geosuratest.model.Vehicle;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}