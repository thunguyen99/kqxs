package com.nms.kqxs.factory;

import java.util.Date;

import com.nms.kqxs.factory.xsmb.impl.RSS_kqxs_XSMBLotteryGetterImpl;

public class LotteryGetterFactory {
	
	private Date orderDate;
	private LotteryGetter xsmbGetter = null;
	
	public LotteryGetterFactory(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public LotteryGetter getXSMBLotteryGetter() {
		if (xsmbGetter == null) {
			xsmbGetter = new RSS_kqxs_XSMBLotteryGetterImpl(orderDate);
		}
		
		return xsmbGetter;
	}
}
