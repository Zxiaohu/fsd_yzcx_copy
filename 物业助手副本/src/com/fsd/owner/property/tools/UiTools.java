package com.fsd.owner.property.tools;

import android.view.View;
import android.widget.TextView;


/***
 * UiTools
 * @author zxh
 * view相关的工具类
 */

public class UiTools {
	
	public static int mUseId;
	public static void setUseId(int id){
		mUseId=id;
	}
	/***
	 * 
	 * @param includeviewid include的id
	 * @param view 布局view
	 * @return 找到的view对象
	 */
	public static View getView(int includeviewid,View view){
		return view.findViewById(includeviewid).findViewById(mUseId);
	}
	
	public static void setText(TextView []textViews,String[] strs){
		for (int i = 0; i < strs.length; i++) {
			textViews[i].setText(strs[i]);
		}
	}
}
