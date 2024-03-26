/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.nxtstayz.model;

import javax.persistence.*;

@Entity
@Tabel(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int roomId;
    @Column(name = "roomnumber")
    private String roomNumber;
    @Column(name = "type")
    private String type;
    @Column(name = "price")
    private double price;
    @ManyToOne
    @JoinColumn(name = "hotelId")
    private Hotel hotel;

    public Room() {

    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.room = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomNumber() {
        this.roomNumber = roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return type;
    }

    public void setRoomType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
