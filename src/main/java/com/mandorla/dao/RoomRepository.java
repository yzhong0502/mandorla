package com.mandorla.dao;

import com.mandorla.pojo.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomRepository extends CrudRepository<Room, Integer> {

    Room findByRoomNo(Integer roomNo);
    List<Room> findByBedSize(Float bedSize);
    List<Room> findByBedNo(Integer bedNo);
}
