package com.hotel.HotelAutomation.entities;

import java.util.List;

public class FloorsEntity {

  //private final int maxConsumption;
  
  private int floorNumber;
  private List<MainCorridorEntity> mainCorridors;
  private List<SubCorridorEntity> subCorridors;
  private List<Integer> activeSubcoridorList;
  private int currentConsumption = 0;
  
  public FloorsEntity(int floorNumber) {
    this.floorNumber = floorNumber;
  }
  
  public int getFloorNumber() {
    return floorNumber;
  }
  public void setFloorNumber(int floorNumber) {
    this.floorNumber = floorNumber;
  }
  public List<MainCorridorEntity> getMainCorridors() {
    return mainCorridors;
  }
  public void setMainCorridors(List<MainCorridorEntity> mainCorridors) {
    this.mainCorridors = mainCorridors;
  }
  public List<SubCorridorEntity> getSubCorridors() {
    return subCorridors;
  }
  public void setSubCorridors(List<SubCorridorEntity> subCorridors) {
    this.subCorridors = subCorridors;
  }
  
  public String toString() {
    
    StringBuilder s = new StringBuilder();
    s.append("Floor " + floorNumber);
    s.append(System.lineSeparator());
    mainCorridors.forEach(mainCorridor -> s.append(mainCorridor.toString()));
    subCorridors.forEach(subCorridor -> s.append(subCorridor.toString()));
    return s.toString();
    
  }
  
  public void resetApplianceStatus(SensorInput sensorInput) {
    int totalUnit = subCorridors.size() * 10;
    if (sensorInput.reset) {
      
    }// else {
    /*subCorridors.forEach(
        subCorridor -> {
          if (movementNumber.contains(subCorridor.getCorridorNumber())) {
            LightEntity l = new LightEntity(1, true);
            subCorridor.setLightEntity(l);
            //totalUnit = totalUnit - 5;
          }
        });
    }*/
  }
}
