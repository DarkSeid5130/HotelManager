package com.gd.dzh.domain;

public class Room {
    private Integer id;

    private String roomnum;

    private Integer roomstatus;

    private Integer roomprice;

    private Integer isdelete;

    private Integer roomtype;

    private String ext01;

    private String ext02;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum == null ? null : roomnum.trim();
    }

    public Integer getRoomstatus() {
        return roomstatus;
    }

    public void setRoomstatus(Integer roomstatus) {
        this.roomstatus = roomstatus;
    }

    public Integer getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(Integer roomprice) {
        this.roomprice = roomprice;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(Integer roomtype) {
        this.roomtype = roomtype;
    }

    public String getExt01() {
        return ext01;
    }

    public void setExt01(String ext01) {
        this.ext01 = ext01 == null ? null : ext01.trim();
    }

    public String getExt02() {
        return ext02;
    }

    public void setExt02(String ext02) {
        this.ext02 = ext02 == null ? null : ext02.trim();
    }
}