package com.nms.kqxs.model;

import java.util.Date;
import java.util.Map;

public abstract class LotteryEntry {

	public static String	DB	= "GIAI DB";
	public static String	G1	= "GIAI NHAT";
	public static String	G2	= "GIAI NHI";
	public static String	G3	= "GIAI BA";
	public static String	G4	= "GIAI TU";
	public static String	G5	= "GIAI NAM";
	public static String	G6	= "GIAI SAU";
	public static String	G7	= "GIAI BAY";

	public LotteryEntry() {
	}

	public LotteryEntry(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	public LotteryEntry(String name, Map<String, String[]> result) {
		this.name = name;
		this.date = new Date();
		this.result = result;
	}

	public LotteryEntry(String name, Date date, Map<String, String[]> result) {
		this.name = name;
		this.date = date;
		this.result = result;
	}

	public boolean isFinished() {
		Map<String, Integer> structureMap = getStructureMap();
		for (Map.Entry<String, Integer> entry : structureMap.entrySet()) {
			String[] giai = result.get(entry.getKey());
			if (hasNull(giai, entry.getValue())) {
				return false;
			}
		}
		return true;
	}

	protected String				name;
	protected Date					date;
	protected Map<String, String[]>	result;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Map<String, String[]> getResult() {
		return result;
	}

	public void setResult(Map<String, String[]> result) {
		this.result = result;
	}

	protected boolean isNull(String value) {
		if (value == null || value.trim().isEmpty()) {
			return true;
		}

		return false;
	}

	protected boolean hasNull(String[] array, int count) {
		if (array == null) {
			return true;
		}

		if (array.length != count) {
			return true;
		}

		for (int i = 0; i < array.length; i++) {
			if (isNull(array[i])) {
				return true;
			}
		}

		return false;
	}

	protected String paserResult(String[] array) {
		StringBuilder sb = new StringBuilder();

		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				sb.append(array[i] == null ? "" : array[i]);
				if (i < array.length - 1) {
					sb.append(" - ");
				}
			}
		}

		return sb.toString();
	}

	public abstract Map<String, Integer> getStructureMap();

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
}
