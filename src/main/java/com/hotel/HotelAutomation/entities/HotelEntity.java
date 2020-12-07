package com.hotel.HotelAutomation.entities;

import java.util.List;

public class HotelEntity {
  private int hotelId;
  private String hotelName;
  private List<FloorsEntity> floors;

  public HotelEntity(int id, String name) {
    this.hotelId = id;
    this.hotelName = name;
  }

  public int getHotelId() {
    return hotelId;
  }

  public void setHotelId(int hotelId) {
    this.hotelId = hotelId;
  }

  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public List<FloorsEntity> getFloors() {
    return floors;
  }

  public void setFloors(List<FloorsEntity> floors) {
    this.floors = floors;// LightEntity
  }

  public void setApplianceConsumption(List<SensorInput> sensorInputs) {
    sensorInputs.forEach(sensorInput -> {
      for (FloorsEntity floorsEntity : floors) {
        if (sensorInput.getFloorNumber() == floorsEntity.getFloorNumber()) {
          floorsEntity.resetApplianceStatus(sensorInput);
        }
      }
    });
  }

}
