package com.fsd.owner.property.tools;

import com.fsd.owner.property.model.bean.TipInfo;
import com.google.gson.Gson;

public class DataTools {
	/***
	 * 去掉外层的中括号
	 */
	public static String getJsonObj(String str){
		return str.substring(1,str.length()-1);
	}
	public static TipInfo getTipInfo(String str){
		TipInfo info = new Gson().fromJson(getJsonObj(str),TipInfo.class);
		return info;
	}
}
