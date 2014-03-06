package com.nms.kqxs.factory.xsmb.impl;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.nms.kqxs.factory.xsmb.XSMBLotteryGetter;
import com.nms.kqxs.model.impl.XSMBLotteryEntry;

public class RSS_kqxs_XSMBLotteryGetterImpl extends XSMBLotteryGetter {
	private static final String link = "http://xskt.com.vn/rss-feed/mien-bac-xsmb.rss";
	
	public RSS_kqxs_XSMBLotteryGetterImpl(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	protected XSMBLotteryEntry getXSMBLottery() throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		URL url = new URL(link);
		URLConnection conn = url.openConnection();
		InputStream in = null;

		XSMBLotteryEntry entry = null;

		try {
			conn.connect();
			in = conn.getInputStream();
			SAXParser paser = factory.newSAXParser();
			RSS_kqxs_XSMBSAXHandler handler = new RSS_kqxs_XSMBSAXHandler(orderDate);
			paser.parse(in, handler);
			entry = handler.entry;
		} catch (Exception e) {
			throw e;
		} finally {
			if (in != null) {
				in.close();
			}
		}

		return entry;
	}
}
