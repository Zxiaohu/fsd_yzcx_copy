package com.fsd.owner.property.ui.fragment.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.fsd.owner.property.R;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;

public class PayFragment extends BaseFragment {

	@Override
	public View initView(LayoutInflater inflater) {
		// TODO Auto-generated method stub
		mRootView = inflater.inflate(R.layout.fragment_pay, null);
		return mRootView;
	}

	@Override
	public void initData(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
	}

}
