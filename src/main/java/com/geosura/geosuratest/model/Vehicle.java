package com.geosura.geosuratest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    private long id;
    private double longitudeCoordinates;
    private double latitudeCoordinates;
    private String licencePlate;
 
    public Vehicle() {
  
    }
 
    public Vehicle(double longitudeCoordinates, double latitudeCoordinates, String licencePlate) {
         this.longitudeCoordinates = longitudeCoordinates;
         this.latitudeCoordinates = latitudeCoordinates;
         this.licencePlate = licencePlate;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "lat", nullable = false)
    public double getLatitude() {
        return latitudeCoordinates;
    }
    public void setLatitude(double latitudeCoordinates) {
        this.latitudeCoordinates = latitudeCoordinates;
    }
 
    @Column(name = "lon", nullable = false)
    public double getLongitude() {
        return longitudeCoordinates;
    }
    public void setLongitude(double longitudeCoordinates) {
        this.longitudeCoordinates = longitudeCoordinates;
    }
 
    @Column(name = "licence_plate", nullable = false)
    public String getLicencePlate() {
        return licencePlate;
    }
    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @Override
    public String toString() {
    	String str = "Vehicle";
    	 	   str+= "[";
    		   str+= " id=" + id +",";
    		   str+= " latitude=" + latitudeCoordinates +",";
    		   str+= " longitude=" + longitudeCoordinates + ",";
    		   str+= " licencePlate=" + licencePlate+"";
    		   str+= "]";
        return str;
        
    }
 
}