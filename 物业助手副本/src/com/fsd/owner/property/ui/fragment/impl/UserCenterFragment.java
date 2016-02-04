package com.fsd.owner.property.ui.fragment.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.fsd.owner.property.R;
import com.fsd.owner.property.ui.fragment.IUserCenterView;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;

public class UserCenterFragment extends BaseFragment implements IUserCenterView{

	@Override
	public void gotoUserInfoFrg() {
		// TODO Auto-generated method stub
	}

	@Override
	public void onUserLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserNotLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public View initView(LayoutInflater inflater) {
		// TODO Auto-generated method stub
		mRootView=inflater.inflate(R.layout.fragment_usercenter, null);
		return mRootView;
	}

	@Override
	public void initData(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
	}
}
