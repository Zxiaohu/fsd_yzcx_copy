package com.fsd.owner.property.tools;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fsd.owner.property.global.JsonParam;
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
	
	/**将json转为2维数组**/
	public static String[][] getArr24Json(String jsonstr,JsonParam key,JsonParam name){
		LogUtil.e("json",jsonstr);
		try {
			JSONArray array = new JSONArray(jsonstr);
			int length = array.length();
			String keys[] = new String[length];
			String names[] = new String[array.length()];
			
			for (int i = 0; i < length; i++) {
				JSONObject object = array.getJSONObject(i);
				keys[i]=object.getString(key.getName());
				names[i]=object.getString(name.getName());
			}
			
			return new String[][]{keys,names};
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LogUtil.e("json","json解析错误");
		}
		return null;
	}
}
