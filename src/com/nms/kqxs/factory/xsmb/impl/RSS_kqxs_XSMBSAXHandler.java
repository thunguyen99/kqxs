package com.nms.kqxs.factory.xsmb.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.nms.kqxs.model.impl.XSMBLotteryEntry;

public class RSS_kqxs_XSMBSAXHandler extends DefaultHandler {

	public XSMBLotteryEntry	entry				= null;
	private Date			orderDate			= null;
	private boolean			isProcessingItem	= false;
	private boolean			hasEntry			= false;
	private boolean			isProcessingTitle	= false;
	private boolean			isProcessingDesc	= false;
	private String			title				= "";
	private String			description			= "";

	public RSS_kqxs_XSMBSAXHandler() {
		orderDate = new Date();
	}

	public RSS_kqxs_XSMBSAXHandler(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if ("item".equals(qName)) {
			isProcessingItem = true;
		} else if ("description".equals(qName)) {
			isProcessingDesc = true;
		} else if ("title".equals(qName)) {
			isProcessingTitle = true;
		}

		if (isProcessingItem && isProcessingDesc && (!title.trim().isEmpty() && title != null)) {
			if (title.matches(".*" + convertDate(orderDate) + ".*")) {
				hasEntry = true;
			}
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if ("item".equals(qName)) {
			isProcessingItem = false;
		} else if ("description".equals(qName)) {
			if (isProcessingItem && hasEntry) {
				entry = buildLottery(description, title, orderDate);
				hasEntry = false;
				title = "";
				description = "";
			}

			isProcessingDesc = false;
		} else if ("title".equals(qName)) {
			isProcessingTitle = false;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (isProcessingItem && (isProcessingTitle || isProcessingDesc)) {
			String value = new String(ch, start, length);
			if (isProcessingTitle) {
				title = title != null ? title + value : "" + value;
			} else if (isProcessingDesc) {
				description = description != null ? description + value : "" + value;
			}
		}
	}

	private XSMBLotteryEntry buildLottery(String description, String title, Date date) {
		Map<String, String[]> result = new HashMap<String, String[]>();
		XSMBLotteryEntry entry = new XSMBLotteryEntry();

		String[] dbResult = getResultPath("B\\:(.*)1\\:", 1, description);
		result.put(XSMBLotteryEntry.DB, dbResult);

		String[] g1Result = getResultPath("1\\:(.*)2\\:", 1, description);
		result.put(XSMBLotteryEntry.G1, g1Result);

		String[] g2Result = getResultPath("2\\:(.*)3\\:", 1, description);
		result.put(XSMBLotteryEntry.G2, g2Result);

		String[] g3Result = getResultPath("3\\:(.*)4\\:", 1, description);
		result.put(XSMBLotteryEntry.G3, g3Result);

		String[] g4Result = getResultPath("4\\:(.*)5\\:", 1, description);
		result.put(XSMBLotteryEntry.G4, g4Result);

		String[] g5Result = getResultPath("5\\:(.*)6\\:", 1, description);
		result.put(XSMBLotteryEntry.G5, g5Result);

		String[] g6Result = getResultPath("6\\:(.*)7\\:", 1, description);
		result.put(XSMBLotteryEntry.G6, g6Result);

		String[] g7Result = getResultPath("7\\:(.*)", 1, description);
		result.put(XSMBLotteryEntry.G7, g7Result);

		entry.setDate(date);
		entry.setName(title);
		entry.setResult(result);

		return entry;
	}

	private String getFisrtWithPattern(String regex, String text, int group) {
		Pattern pattern = Pattern.compile(regex,Pattern.DOTALL | Pattern.UNICODE_CHARACTER_CLASS);
		Matcher m = pattern.matcher(text);
		if (m.find()) {
			return m.group(group).trim();
		} 
		return null;
	}

	private String[] getResultPath(String regex, int group, String text) {
		String value = getFisrtWithPattern(regex, text, group);
		if (value != null && !value.isEmpty()) {
			return value.split("-");
		}
		return null;
	}

	private String convertDate(Date date) {
		DateFormat format = new SimpleDateFormat("dd/MM");
		return format.format(date);
	}
}
