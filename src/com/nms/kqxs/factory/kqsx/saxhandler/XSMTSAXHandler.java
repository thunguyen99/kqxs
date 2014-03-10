package com.nms.kqxs.factory.kqsx.saxhandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.nms.kqxs.factory.util.Common;
import com.nms.kqxs.model.LotteryEntry;
import com.nms.kqxs.model.impl.XSMTLotteryEntry;

public class XSMTSAXHandler extends SAXHandler {

	public XSMTSAXHandler(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	protected LotteryEntry buildLottery(String description, String title, Date date) {
		Map<String, String[]> result = new HashMap<String, String[]>();
		LotteryEntry entry = new XSMTLotteryEntry();

		String[] dbResult = Common.getResultPath("B\\:(.*)1\\:", 1, description);
		result.put(XSMTLotteryEntry.DB, dbResult);

		String[] g1Result = Common.getResultPath("1\\:(.*)2\\:", 1, description);
		result.put(XSMTLotteryEntry.G1, g1Result);

		String[] g2Result = Common.getResultPath("2\\:(.*)3\\:", 1, description);
		result.put(XSMTLotteryEntry.G2, g2Result);

		String[] g3Result = Common.getResultPath("3\\:(.*)4\\:", 1, description);
		result.put(XSMTLotteryEntry.G3, g3Result);

		String[] g4Result = Common.getResultPath("4\\:(.*)5\\:", 1, description);
		result.put(XSMTLotteryEntry.G4, g4Result);

		String[] g5Result = Common.getResultPath("5\\:(.*)6\\:", 1, description);
		result.put(XSMTLotteryEntry.G5, g5Result);

		String[] g6Result = Common.getResultPath("6\\:(.*)7\\:", 1, description);
		result.put(XSMTLotteryEntry.G6, g6Result);

		String[] g7Result = Common.getResultPath("7\\:(.*)8\\:", 1, description);
		result.put(XSMTLotteryEntry.G7, g7Result);
		
		String[] g8Result = Common.getResultPath("8\\:(.*)", 1, description);
		result.put(XSMTLotteryEntry.G8, g8Result);

		entry.setDate(date);
		entry.setName(title);
		entry.setResult(result);

		return entry;
	}
}
