package com.jsp.controller.ClassRoom;

import com.jsp.dao.ClassRoomDao;
import com.jsp.dto.ClassRoom;

public class SaveClassRoom {

	public static void main(String[] args) {
		ClassRoom cl=new ClassRoom();
		cl.setName("name");
		cl.setSeat_Capacity(25);
		new ClassRoomDao().saveClassRoom(cl);

	}

}
