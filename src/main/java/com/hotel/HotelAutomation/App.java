package com.hotel.HotelAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hotel.HotelAutomation.entities.FloorsEntity;
import com.hotel.HotelAutomation.entities.HotelEntity;
import com.hotel.HotelAutomation.entities.MainCorridorEntity;
import com.hotel.HotelAutomation.entities.SubCorridorEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MainCorridorEntity mainCorridorEntity = new MainCorridorEntity(1);
        SubCorridorEntity subCorridorEntity1 = new SubCorridorEntity(1);
        SubCorridorEntity subCorridorEntity2 = new SubCorridorEntity(2);
        List<MainCorridorEntity> mainCorridorEntities = new ArrayList<MainCorridorEntity>(Arrays.asList(mainCorridorEntity));
        List<SubCorridorEntity> subCorridorEntities = new ArrayList<SubCorridorEntity>(Arrays.asList(subCorridorEntity1, subCorridorEntity2));
        FloorsEntity f1 = new FloorsEntity(1);
        f1.setMainCorridors(mainCorridorEntities);
        f1.setSubCorridors(subCorridorEntities);
        FloorsEntity f2 = new FloorsEntity(2);
        f2.setMainCorridors(mainCorridorEntities);
        f2.setSubCorridors(subCorridorEntities);
        FloorsEntity f3 = new FloorsEntity(3);
        f3.setMainCorridors(mainCorridorEntities);
        f3.setSubCorridors(subCorridorEntities);
        HotelEntity h = new HotelEntity(1, "Hotel");
        List<FloorsEntity> floorsEntities = new ArrayList<FloorsEntity>(Arrays.asList(f1, f2, f3));
        h.setFloors(floorsEntities);
        for (FloorsEntity f : h.getFloors()) {
          System.out.println(f.toString());
        }
    }
}
