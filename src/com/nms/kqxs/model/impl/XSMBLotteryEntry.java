package com.nms.kqxs.model.impl;

import java.util.HashMap;
import java.util.Map;

import com.nms.kqxs.model.LotteryEntry;

public class XSMBLotteryEntry extends LotteryEntry {
	
	@Override
	public Map<String, Integer> getStructureMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put(DB, 1);
		map.put(G1, 1);
		map.put(G2, 2);
		map.put(G3, 6);
		map.put(G4, 4);
		map.put(G5, 6);
		map.put(G6, 3);
		map.put(G7, 4);

		return map;
	}
}
