package com.hotel.HotelAutomation;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hotel.HotelAutomation.entities.FloorsEntity;
import com.hotel.HotelAutomation.entities.HotelEntity;
import com.hotel.HotelAutomation.entities.MainCorridorEntity;
import com.hotel.HotelAutomation.entities.SensorInput;
import com.hotel.HotelAutomation.entities.SubCorridorEntity;

/**
 * Unit test for Hotel Automation App.
 */
public class AppTest {

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void clear() throws Exception {

  }

  @Test
  public void testAutApp() {
    MainCorridorEntity mainCorridorEntity1 = new MainCorridorEntity(1);
    SubCorridorEntity subCorridorEntity11 = new SubCorridorEntity(1);
    SubCorridorEntity subCorridorEntity12 = new SubCorridorEntity(2);
    MainCorridorEntity mainCorridorEntity2 = new MainCorridorEntity(1);
    SubCorridorEntity subCorridorEntity21 = new SubCorridorEntity(1);
    SubCorridorEntity subCorridorEntity22 = new SubCorridorEntity(2);
    MainCorridorEntity mainCorridorEntity3 = new MainCorridorEntity(1);
    SubCorridorEntity subCorridorEntity31 = new SubCorridorEntity(1);
    SubCorridorEntity subCorridorEntity32 = new SubCorridorEntity(2);
    List<MainCorridorEntity> mainCorridorEntities1 = new ArrayList<MainCorridorEntity>(
        Arrays.asList(mainCorridorEntity1));
    List<SubCorridorEntity> subCorridorEntities1 = new ArrayList<SubCorridorEntity>(
        Arrays.asList(subCorridorEntity11, subCorridorEntity12));
    List<MainCorridorEntity> mainCorridorEntities2 = new ArrayList<MainCorridorEntity>(
        Arrays.asList(mainCorridorEntity2));
    List<SubCorridorEntity> subCorridorEntities2 = new ArrayList<SubCorridorEntity>(
        Arrays.asList(subCorridorEntity21, subCorridorEntity22));
    List<MainCorridorEntity> mainCorridorEntities3 = new ArrayList<MainCorridorEntity>(
        Arrays.asList(mainCorridorEntity3));
    List<SubCorridorEntity> subCorridorEntities3 = new ArrayList<SubCorridorEntity>(
        Arrays.asList(subCorridorEntity31, subCorridorEntity32));
    FloorsEntity f1 = new FloorsEntity(1);
    f1.setMainCorridors(mainCorridorEntities1);
    f1.setSubCorridors(subCorridorEntities1);
    FloorsEntity f2 = new FloorsEntity(2);
    f2.setMainCorridors(mainCorridorEntities2);
    f2.setSubCorridors(subCorridorEntities2);
    FloorsEntity f3 = new FloorsEntity(3);
    f3.setMainCorridors(mainCorridorEntities3);
    f3.setSubCorridors(subCorridorEntities3);
    HotelEntity hotelEntity = new HotelEntity(1, "Hotel");
    List<FloorsEntity> floorsEntities = new ArrayList<FloorsEntity>(Arrays.asList(f1, f2, f3));
    hotelEntity.setFloors(floorsEntities);
    System.out.println("Default State:");
    printApplianceStatus(hotelEntity);
    assertEquals(hotelEntity.getFloors().get(0).getSubCorridors().get(0).getAcEntity().isAcStatus(), true);
    List<Integer> sensorDataCorridorNumber = new ArrayList<Integer>(Arrays.asList(1));
    SensorInput s1 = new SensorInput(1, sensorDataCorridorNumber, false);
    hotelEntity.setApplianceConsumption(new ArrayList<SensorInput>(Arrays.asList(s1)));
    System.out.println("After Sensor Input:");
    printApplianceStatus(hotelEntity);
    assertEquals(hotelEntity.getFloors().get(0).getSubCorridors().get(1).getAcEntity().isAcStatus(), false);

  }

  public static void printApplianceStatus(HotelEntity hotel) {
    for (FloorsEntity f : hotel.getFloors()) {
      System.out.println(f.toString());
    }
  }
}
