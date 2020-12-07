package com.hotel.HotelAutomation.entities;

public class MainCorridorEntity {

  private int corridorNumber;
  private LightEntity lightEntity;
  private AcEntity acEntity;

  public MainCorridorEntity(int corridorNumber) {
    this.corridorNumber = corridorNumber;
    this.lightEntity = new LightEntity(1, true);
    this.acEntity = new AcEntity(1, true);
  }

  public int getCorridorNumber() {
    return corridorNumber;
  }

  public void setCorridorNumber(int corridorNumber) {
    this.corridorNumber = corridorNumber;
  }

  public LightEntity getLightEntity() {
    return lightEntity;
  }

  public void setLightEntity(LightEntity lightEntity) {
    this.lightEntity = lightEntity;
  }

  public AcEntity getAcEntity() {
    return acEntity;
  }

  public void setAcEntity(AcEntity acEntity) {
    this.acEntity = acEntity;
  }

  public String toString() {

    StringBuilder s = new StringBuilder();
    s.append("Main Corridor " + corridorNumber + " ");
    s.append(lightEntity.toString());
    s.append(acEntity.toString());
    return s.toString();

  }

}
