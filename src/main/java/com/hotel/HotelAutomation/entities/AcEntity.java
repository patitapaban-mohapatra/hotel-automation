package com.hotel.HotelAutomation.entities;

public class AcEntity {

  private int acNumber;
  private boolean acStatus;
  private int unitCost = 10;

  public AcEntity(int acNumber, boolean acStatus) {
    this.acNumber = acNumber;
    this.acStatus = acStatus;
  }

  public int getAcNumber() {
    return acNumber;
  }

  public void setAcNumber(int acNumber) {
    this.acNumber = acNumber;
  }

  public boolean isAcStatus() {
    return acStatus;
  }

  public void setAcStatus(boolean acStatus) {
    this.acStatus = acStatus;
  }

  public int getUnitCost() {
    return unitCost;
  }

  public void setUnitCost(int unitCost) {
    this.unitCost = unitCost;
  }

  public String toString() {

    StringBuilder s = new StringBuilder();
    s.append("AC " + acNumber + " " + (acStatus ? "ON " : "OFF "));
    s.append(System.lineSeparator());
    return s.toString();

  }

}
