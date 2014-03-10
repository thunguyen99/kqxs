package com.nms.kqxs.factory;

import com.nms.kqxs.model.LotteryEntry;

public interface LotteryGetter {
	public LotteryEntry getLottery() throws Exception;
}
