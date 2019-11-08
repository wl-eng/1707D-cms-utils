package com.wanglei;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	public static boolean main(String str) {
		return(str==null||str.trim().equals(""));
	}
	public static boolean haveValue(String str) {
		// TODO Auto-generated method stub
		return !(str==null||str.trim().equals(""));
	}
	public static boolean isMobile(String str) {
		// TODO Auto-generated method stub
		String regex="^([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*)$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(str);
		return matcher.find();
	}
	public static boolean isEmail(String str) {
		// TODO Auto-generated method stub
		String regex="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(str);
		return matcher.find();
	}
	public static String getRandomStr(int n) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			sb.append((char)'A'+random.nextInt(26));
		}
		return sb.toString();
	}
}
