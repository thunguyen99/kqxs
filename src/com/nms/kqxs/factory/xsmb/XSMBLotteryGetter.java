package com.nms.kqxs.factory.xsmb;

import java.util.Date;

import com.nms.kqxs.factory.LotteryGetter;
import com.nms.kqxs.model.LotteryEntry;
import com.nms.kqxs.model.impl.XSMBLotteryEntry;

public abstract class XSMBLotteryGetter implements LotteryGetter {
	
	protected Date orderDate;
	
	protected abstract XSMBLotteryEntry getXSMBLottery() throws Exception;

	@Override
	public LotteryEntry getLottery() {
		try {
			return getXSMBLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
