package com.hotel.HotelAutomation.entities;

import java.util.List;

/*
 * Contains the sensor input received from appliances
 */
public class SensorInput {

  int floorNumber;
  List<Integer> sensorDataCorridorNumber;
  boolean reset;

  public SensorInput(int floorNumber, List<Integer> sensorDataCorridorNumber, boolean reset) {
    this.floorNumber = floorNumber;
    this.sensorDataCorridorNumber = sensorDataCorridorNumber;
    this.reset = reset;
  }

  public int getFloorNumber() {
    return floorNumber;
  }

  public void setFloorNumber(int floorNumber) {
    this.floorNumber = floorNumber;
  }

  public List<Integer> getSensorDataCorridorNumber() {
    return sensorDataCorridorNumber;
  }

  public void setSensorDataorridorNumber(List<Integer> sensorDataCorridorNumber) {
    this.sensorDataCorridorNumber = sensorDataCorridorNumber;
  }

  public boolean isReset() {
    return reset;
  }

  public void setReset(boolean reset) {
    this.reset = reset;
  }

}
