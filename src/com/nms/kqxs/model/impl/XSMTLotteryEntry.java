package com.nms.kqxs.model.impl;

import java.util.HashMap;
import java.util.Map;

import com.nms.kqxs.model.LotteryEntry;

public class XSMTLotteryEntry extends LotteryEntry {

	public static String G8 = "GIAI_8";

	@Override
	public Map<String, Integer> getStructureMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put(DB, 1);
		map.put(G1, 1);
		map.put(G2, 1);
		map.put(G3, 2);
		map.put(G4, 7);
		map.put(G5, 1);
		map.put(G6, 3);
		map.put(G7, 1);
		map.put(G8, 1);

		return map;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(G8).append(":\t").append(paserResult(result.get(G8))).append("\n");
		return sb.toString();
	}

}
