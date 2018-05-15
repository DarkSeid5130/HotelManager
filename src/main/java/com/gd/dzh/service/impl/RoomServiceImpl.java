package com.gd.dzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gd.dzh.domain.VRoomorder;
import com.gd.dzh.domain.VRoomorderExample;
import com.gd.dzh.domain.VRoomorderExample.Criteria;
import com.gd.dzh.mapper.RoomMapper;
import com.gd.dzh.mapper.VRoomorderMapper;
import com.gd.dzh.service.RoomService;

@Service("roomService")
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomMapper roomMapper;
	
	@Autowired
	private VRoomorderMapper vrm;
	
	@Override
	public List<VRoomorder> getRooms(String roomnum,String roomtype,String roomstatus) {
		VRoomorderExample vRoomorderExample = new VRoomorderExample();
		Criteria criteria = vRoomorderExample.createCriteria();
		if (roomnum!=null&&roomnum!="") {
			criteria.andRoomnumEqualTo(roomnum);
		}
		if (roomtype!=null&&roomtype!=""&&Integer.parseInt(roomtype)!=10) {
			
			criteria.andRoomtypeEqualTo(Integer.parseInt(roomtype));
		}
		if (roomstatus!=null&&roomstatus!=""&&Integer.parseInt(roomstatus)!=10) {
			criteria.andRoomstatusEqualTo(Integer.parseInt(roomstatus));
		}
		List<VRoomorder> vrms = vrm.selectByExample(vRoomorderExample);
		return vrms;
	}

}
