package com.fsd.owner.property.tools;

import android.os.Bundle;

/****
 * 
 * @author zxh
 *
 */
public class BudleTools {

	public enum BParam{
		FLAG("flag"),TIP("t"),CONTENT("c");
		private String des;
		private BParam(String des){this.des=des;}
		public String getDes(){
			return des;
		}
	}
	public static Bundle setStr(BParam []BP,String []v){
		Bundle b= new Bundle();
		for (int i = 0; i < v.length; i++) {
			b.putString(BP[i].getDes(), v[i]);
		}
		return b;
	}
}
