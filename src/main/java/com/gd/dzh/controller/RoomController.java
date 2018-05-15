package com.gd.dzh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gd.dzh.domain.Room;
import com.gd.dzh.domain.VRoomorder;
import com.gd.dzh.service.RoomService;
import com.gd.dzh.utils.JsonUtil;

@Controller
public class RoomController {
	
	@Autowired
	@Qualifier("roomService")
	private RoomService roomService;
	
	@RequestMapping(value ="/getRoomSituation")
	@ResponseBody
	public String roomSituation(String roomnum,String roomtype,String roomstatus) {
		System.out.println(roomnum+"====="+roomtype+"====="+roomstatus);
		List<VRoomorder> rooms = roomService.getRooms(roomnum,roomtype,roomstatus);
		System.out.println(rooms.size());
		return JsonUtil.ObjectToJson(rooms);
	}
}
