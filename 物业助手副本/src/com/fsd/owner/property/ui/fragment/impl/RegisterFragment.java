package com.fsd.owner.property.ui.fragment.impl;
import android.view.LayoutInflater;
import android.view.View;

import com.fsd.owner.property.R;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;
import com.lidroid.xutils.ViewUtils;
/***
 * RegisterFragment
 * @author zxh
 * 注册的fragment
 */
public class RegisterFragment extends BaseFragment {
	
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

	
}
