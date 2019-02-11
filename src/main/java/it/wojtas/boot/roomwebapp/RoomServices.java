package it.wojtas.boot.roomwebapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServices {
    private static List<Room> rooms = new ArrayList<Room>();

    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room((long) i, "R" + i, "Room " + i, "King size"));
        }
    }

    public List<Room> getAllRooms(){
        return rooms;
    }
}
