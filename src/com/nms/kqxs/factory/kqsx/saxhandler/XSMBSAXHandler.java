package com.nms.kqxs.factory.kqsx.saxhandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.nms.kqxs.factory.util.Common;
import com.nms.kqxs.model.LotteryEntry;
import com.nms.kqxs.model.impl.XSMBLotteryEntry;

public class XSMBSAXHandler extends SAXHandler {

	public XSMBSAXHandler(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	protected LotteryEntry buildLottery(String description, String title, Date date) {
		Map<String, String[]> result = new HashMap<String, String[]>();
		LotteryEntry entry = new XSMBLotteryEntry();

		String[] dbResult = Common.getResultPath("B\\:(.*)1\\:", 1, description);
		result.put(XSMBLotteryEntry.DB, dbResult);

		String[] g1Result = Common.getResultPath("1\\:(.*)2\\:", 1, description);
		result.put(XSMBLotteryEntry.G1, g1Result);

		String[] g2Result = Common.getResultPath("2\\:(.*)3\\:", 1, description);
		result.put(XSMBLotteryEntry.G2, g2Result);

		String[] g3Result = Common.getResultPath("3\\:(.*)4\\:", 1, description);
		result.put(XSMBLotteryEntry.G3, g3Result);

		String[] g4Result = Common.getResultPath("4\\:(.*)5\\:", 1, description);
		result.put(XSMBLotteryEntry.G4, g4Result);

		String[] g5Result = Common.getResultPath("5\\:(.*)6\\:", 1, description);
		result.put(XSMBLotteryEntry.G5, g5Result);

		String[] g6Result = Common.getResultPath("6\\:(.*)7\\:", 1, description);
		result.put(XSMBLotteryEntry.G6, g6Result);

		String[] g7Result = Common.getResultPath("7\\:(.*)", 1, description);
		result.put(XSMBLotteryEntry.G7, g7Result);

		entry.setDate(date);
		entry.setName(title);
		entry.setResult(result);

		return entry;
	}
}
