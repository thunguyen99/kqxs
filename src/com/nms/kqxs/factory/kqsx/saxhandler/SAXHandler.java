package com.nms.kqxs.factory.kqsx.saxhandler;

import java.util.Date;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.nms.kqxs.factory.util.Common;
import com.nms.kqxs.model.LotteryEntry;

public abstract class SAXHandler extends DefaultHandler {
	protected LotteryEntry	entry				= null;
	protected Date			orderDate			= null;
	protected boolean		isProcessingItem	= false;
	protected boolean		hasEntry			= false;
	protected boolean		isProcessingTitle	= false;
	protected boolean		isProcessingDesc	= false;
	protected String		title				= "";
	protected String		description			= "";

	public LotteryEntry getLotteryEntry() {
		return entry;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if ("item".equals(qName)) {
			isProcessingItem = true;
		} else if ("description".equals(qName)) {
			isProcessingDesc = true;
			description = "";
		} else if ("title".equals(qName)) {
			isProcessingTitle = true;
			title = "";
		}

		if (isProcessingItem && isProcessingDesc && (!title.trim().isEmpty() && title != null)) {
			if (title.matches(".*" + Common.convertDate(orderDate) + ".*")) {
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

	protected abstract LotteryEntry buildLottery(String description, String title, Date date);
}
