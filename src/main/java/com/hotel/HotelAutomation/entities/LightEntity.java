package com.hotel.HotelAutomation.entities;

public class LightEntity {

  private int lightNumber;
  private boolean lightStatus;
  private int unitCost = 5;
  
  public LightEntity(int lightNumber, boolean lightStatus) {
    this.lightNumber = lightNumber;
    this.lightStatus = lightStatus;
  }
  public int getLightNumber() {
    return lightNumber;
  }
  public void setLightNumber(int lightNumber) {
    this.lightNumber = lightNumber;
  }
  public boolean isLightStatus() {
    return lightStatus;
  }
  public void setLightStatus(boolean lightStatus) {
    this.lightStatus = lightStatus;
  }
  public int getUnitCost() {
    return unitCost;
  }
  public void setUnitCost(int unitCost) {
    this.unitCost = unitCost;
  }
  
  public String toString() {
    
    StringBuilder s = new StringBuilder();
    s.append("Light " + lightNumber + " " + (lightStatus ? "ON " : "OFF "));
    return s.toString();
    
  }
  
  
}
