package com.crm.kqxs.client;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.nms.kqxs.facade.LotteryFacade;
import com.nms.kqxs.model.LotteryEntry;

public class Client {
	
	public static void main(String[] args) throws ParseException {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date orderDate = format.parse("04/03/2014");
		
		
		LotteryEntry kq = null;
		
		kq = LotteryFacade.getXS_MB(orderDate);
		
		if (kq != null) {
			System.out.println(kq.getName());
			System.out.println(kq.toString());
			System.out.println(kq.isFinished() ? "Da du ket qua" : "Chua du ket qua");
		} else {
			System.out.println("Khong co ket qua!");
		}
	}
}
