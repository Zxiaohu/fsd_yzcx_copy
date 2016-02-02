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
			String keys[] = new String[length+1];
			String names[] = new String[length+1];
			keys[0]="请选择";
			names[0]="请选择";
			for (int i = 0; i <length; i++) {
				JSONObject object = array.getJSONObject(i);
				keys[i+1]=object.getString(key.getName());
				names[i+1]=object.getString(name.getName());
			
			}

			return new String[][]{keys,names};


		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LogUtil.e("json","json解析错误");
		}
		return null;
	}

	public static String[] getArr4json(String jsonstr,JsonParam name){
		try {
			JSONArray array = new JSONArray(jsonstr);
			int length=array.length();
			String []arr=new String[length+1];
			arr[0]="请选择";
			for (int i = 0; i < length; i++) {
				JSONObject jsonObject=array.getJSONObject(i);
				arr[i+1]=jsonObject.getString(name.getName());
			}
			return arr;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
