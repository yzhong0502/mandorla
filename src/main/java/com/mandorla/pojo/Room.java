package com.mandorla.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Room {

    @Id
    private Integer roomNo;
    private Integer price;
    private Float bedSize; // 1.2, 1.5, 1.8
    private Integer bedNo; // number of bed in the room
    private Integer capacity; // the max numbers of living people in this room
    private Integer squareMeter;

}
