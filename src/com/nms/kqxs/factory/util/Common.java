package com.nms.kqxs.factory.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Common {

	/**
	 * Get first result of matched in text
	 * @param regex regex string.
	 * @param text
	 * @param group
	 * @return
	 */
	public static String getFisrtWithPattern(String regex, String text, int group) {
		Pattern pattern = Pattern.compile(regex, Pattern.DOTALL | Pattern.UNICODE_CHARACTER_CLASS);
		Matcher m = pattern.matcher(text);
		if (m.find()) {
			return m.group(group).trim();
		}
		return null;
	}

	/**
	 * Return list of lottery result that separated by "-".
	 * @param regex
	 * @param group
	 * @param text
	 * @return
	 */
	public static String[] getResultPath(String regex, int group, String text) {
		String value = getFisrtWithPattern(regex, text, group);
		if (value != null && !value.isEmpty()) {
			return value.split("-");
		}
		return null;
	}

	/**
	 * Convert data to string with pattern (dd/MM).
	 * @param date
	 * @return
	 */
	public static String convertDate(Date date) {
		DateFormat format = new SimpleDateFormat("dd/MM");
		return format.format(date);
	}

}
