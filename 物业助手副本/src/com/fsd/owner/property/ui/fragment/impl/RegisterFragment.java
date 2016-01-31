package com.fsd.owner.property.ui.fragment.impl;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.fsd.owner.property.R;
import com.fsd.owner.property.ui.fragment.IReginsterView;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
/***
 * RegisterFragment
 * @author zxh
 * 注册的fragment
 */
public class RegisterFragment extends BaseFragment implements IReginsterView{
	
	@ViewInject(R.id.tv_choose_house)
	private TextView tv_choose_house;
	
	@ViewInject(R.id.tv_name)
	private TextView tv_name;
	
	@ViewInject(R.id.tv_phonenum)
	private TextView tv_phonenum;
	
	
	
	@Override
	public View initView(LayoutInflater inflater) {
		// TODO Auto-generated method stub
		mRootView=inflater.inflate(R.layout.fragment_register,null);
		ViewUtils.inject(this,mRootView);
		return mRootView;
	}
	
	
	@Override
	public void initData() {
		// TODO Auto-generated method stub

	}


	@Override
	public void setUserInfo(String[] userinfo) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getUserPhoneNum() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getCheckNum() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
