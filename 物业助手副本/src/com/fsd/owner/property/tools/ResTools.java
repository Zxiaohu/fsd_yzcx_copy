package com.fsd.owner.property.tools;

import com.fsd.owner.property.global.MyApplication;

/****
 * ResourcesTools
 * @author zxh
 * 资源文件管理类
 */
public class ResTools {


	public static String []getArr(int nameid){
		String[] stringArrays=null;
		try{
			stringArrays = MyApplication.getContext().getResources().getStringArray(nameid);
			return stringArrays;
		}catch(Exception exception){
			SystemTools.fail("系统异常");
		}
		return stringArrays;
	}

}
