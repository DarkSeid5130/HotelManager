package com.gd.dzh.service;

import java.util.List;

import com.gd.dzh.domain.VRoomorder;

public interface RoomService {
	
	public List<VRoomorder> getRooms(String roomnum,String roomtype,String roomstatus);

}
