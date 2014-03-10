package com.crm.kqxs.client;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.nms.kqxs.factory.LotteryGetter;
import com.nms.kqxs.factory.LotteryGetterFactory;
import com.nms.kqxs.model.LotteryEntry;

public class Client {
	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws ParseException
	 */
	public static void main(String[] args) throws InterruptedException, ParseException {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date orderdate = format.parse("09/03/2014");
		
		LotteryGetterFactory factory = new LotteryGetterFactory(orderdate);
		LotteryGetter getter = factory.getXSMBLotteryGetter();
		LotteryEntry kq = getter.getLottery();
		
		if (kq != null) {
			while (kq != null && !kq.isFinished()) {
				TimeUnit.SECONDS.sleep(5);
				kq = getter.getLottery();
			}

			// print kq
			System.out.println(kq.getName());
			System.out.println(kq.toString());
		}
	}
}
