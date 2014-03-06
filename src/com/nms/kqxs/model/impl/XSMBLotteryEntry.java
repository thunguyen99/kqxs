package com.nms.kqxs.model.impl;

import java.util.HashMap;
import java.util.Map;

import com.nms.kqxs.model.LotteryEntry;

public class XSMBLotteryEntry extends LotteryEntry {
	public static String DB = "GIAI DB";
	public static String G1 = "GIAI NHAT";
	public static String G2 = "GIAI NHI";
	public static String G3 = "GIAI BA";
	public static String G4 = "GIAI TU";
	public static String G5 = "GIAI NAM";
	public static String G6 = "GIAI SAU";
	public static String G7 = "GIAI BAY";

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		if (result != null) {
			sb.append(DB).append(":\t").append(paserResult(result.get(DB))).append("\n");
			sb.append(G1).append(":\t").append(paserResult(result.get(G1))).append("\n");
			sb.append(G2).append(":\t").append(paserResult(result.get(G2))).append("\n");
			sb.append(G3).append(":\t").append(paserResult(result.get(G3))).append("\n");
			sb.append(G4).append(":\t").append(paserResult(result.get(G4))).append("\n");
			sb.append(G5).append(":\t").append(paserResult(result.get(G5))).append("\n");
			sb.append(G6).append(":\t").append(paserResult(result.get(G6))).append("\n");
			sb.append(G7).append(":\t").append(paserResult(result.get(G7))).append("\n");
		}
		
		return sb.toString();
	}

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
