package com.fsd.owner.property.tools;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Html;
import android.text.Spanned;
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
	
	/**设置字体的颜色**/
	public static Spanned getSpanned(String color,String content){
		return Html.fromHtml("<font color="+color+">"+content+"</font>");
	}
	
	/**弹出条目选择的对话框**/
	public static void showItemDialog(Context context,String [] items,final IDialogListener listener){
		//创建对话框
		AlertDialog.Builder d = new AlertDialog.Builder(context);
		d.setItems(items, new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				listener.select(which);
				//消失
				dialog.dismiss();
			}
		});
		d.create().show();
	}
	public interface IDialogListener{
		void select(int which);
	}
}
