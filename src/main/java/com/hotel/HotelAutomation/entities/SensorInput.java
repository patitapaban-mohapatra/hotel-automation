package com.hotel.HotelAutomation.entities;

import java.util.List;

public class SensorInput {

  int floorNumber;
  List<SensorData> sensorData;
  boolean reset;

  public int getFloorNumber() {
    return floorNumber;
  }

  public void setFloorNumber(int floorNumber) {
    this.floorNumber = floorNumber;
  }

  public List<SensorData> getSensorData() {
    return sensorData;
  }

  public void setSensorData(List<SensorData> sensorData) {
    this.sensorData = sensorData;
  }

  public boolean isReset() {
    return reset;
  }

  public void setReset(boolean reset) {
    this.reset = reset;
  }

  class SensorData {
    int corridorNumber;
    boolean isMovement;
    public int getCorridorNumber() {
      return corridorNumber;
    }
    public void setCorridorNumber(int corridorNumber) {
      this.corridorNumber = corridorNumber;
    }
    public boolean isMovement() {
      return isMovement;
    }
    public void setMovement(boolean isMovement) {
      this.isMovement = isMovement;
    }
  }
  
}

