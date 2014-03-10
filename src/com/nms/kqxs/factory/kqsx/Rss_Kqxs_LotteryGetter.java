package com.nms.kqxs.factory.kqsx;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.nms.kqxs.factory.LotteryGetter;
import com.nms.kqxs.factory.kqsx.saxhandler.SAXHandler;
import com.nms.kqxs.model.LotteryEntry;

public class Rss_Kqxs_LotteryGetter implements LotteryGetter {

	private String	link;
	private SAXHandler handler;
	
	public Rss_Kqxs_LotteryGetter(String link, SAXHandler handler) {
		this.link = link;
		this.handler = handler;
	}

	@Override
	public LotteryEntry getLottery() throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		URL url = new URL(link);
		URLConnection conn = url.openConnection();
		InputStream in = null;

		LotteryEntry entry = null;

		try {
			conn.connect();
			in = conn.getInputStream();
			SAXParser paser = factory.newSAXParser();
			paser.parse(in, handler);
			entry = handler.getLotteryEntry();
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
