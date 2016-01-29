package com.fsd.owner.property.ui.activiy.impl;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.fsd.owner.property.R;
import com.fsd.owner.property.ui.activiy.ILoginView;
import com.fsd.owner.property.ui.activiy.base.BaseActivity;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
/***
 * LoginActivity
 * @author zxh
 * 主界面activity
 */
public class LoginActivity extends BaseActivity implements ILoginView {
	
	@ViewInject(R.id.vp_content)
	private ViewPager vp_content;
	
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_login);
		ViewUtils.inject(this);
	}
	
	
}
