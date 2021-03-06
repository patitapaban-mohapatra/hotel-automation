package com.hotel.HotelAutomation.entities;

import java.util.ArrayList;
import java.util.List;

public class FloorsEntity {

  private int maxConsumption;

  private int floorNumber;
  private List<MainCorridorEntity> mainCorridors;
  private List<SubCorridorEntity> subCorridors;
  private List<Integer> activeSubcoridorList;
  private int currentConsumption = 0;

  public FloorsEntity(int floorNumber) {
    this.floorNumber = floorNumber;
    this.activeSubcoridorList = new ArrayList<Integer>();
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
    currentConsumption = subCorridors.size() * 10;
    if (sensorInput.reset) {
      subCorridors.forEach(subCorridor -> {
        subCorridor.setLightEntity(new LightEntity(1, false));
        subCorridor.setAcEntity(new AcEntity(1, true));
      });
    } else {
      for (SubCorridorEntity subCorridorEntity : subCorridors) {
        if (sensorInput.getSensorDataCorridorNumber().contains(subCorridorEntity.getCorridorNumber())) {
          if (currentConsumption - 15 > 0) {
            subCorridorEntity.setLightEntity(new LightEntity(1, true));
            subCorridorEntity.setAcEntity(new AcEntity(1, true));
            currentConsumption = currentConsumption - 15;
          } else if (currentConsumption - 5 > 0) {
            subCorridorEntity.setLightEntity(new LightEntity(1, true));
            subCorridorEntity.setAcEntity(new AcEntity(1, false));
            currentConsumption = currentConsumption - 5;
          }
          activeSubcoridorList.add(subCorridorEntity.getCorridorNumber());
        } else {
          if (subCorridorEntity.getAcEntity().isAcStatus() && subCorridorEntity.getLightEntity().isLightStatus()) {
            subCorridorEntity.setLightEntity(new LightEntity(1, false));
            subCorridorEntity.setAcEntity(new AcEntity(1, false));
            currentConsumption = currentConsumption + 15;
          } else if (subCorridorEntity.getAcEntity().isAcStatus()
              && !subCorridorEntity.getLightEntity().isLightStatus()) {
            subCorridorEntity.setLightEntity(new LightEntity(1, false));
            subCorridorEntity.setAcEntity(new AcEntity(1, false));
            currentConsumption = currentConsumption + 10;
          } else {
            subCorridorEntity.setLightEntity(new LightEntity(1, false));
            subCorridorEntity.setAcEntity(new AcEntity(1, false));
            currentConsumption = currentConsumption + 5;
          }
          if (activeSubcoridorList.contains(subCorridorEntity.getCorridorNumber())) {
            activeSubcoridorList.remove(subCorridorEntity.getCorridorNumber());
          }
        }
      }
    }
  }
}
