package com.fsd.owner.property.ui.fragment.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.fsd.owner.property.R;
import com.fsd.owner.property.ui.activiy.impl.TempActivity;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;
import com.fsd.owner.property.ui.view.TitleBar;
import com.fsd.owner.property.ui.view.TitleBar.TitleBarListener;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class PaiGongFragment extends BaseFragment implements TitleBarListener {
	
	@ViewInject(R.id.tb_pg)
	private TitleBar bar;
	@ViewInject(R.id.et_pg_content)
	private EditText et_content;
	@Override
	public View initView(LayoutInflater inflater) {
		// TODO Auto-generated method stub
		mRootView = inflater.inflate(R.layout.fragment_paigong, null);
		ViewUtils.inject(this,mRootView);
		return mRootView;
	}

	@Override
	public void initData(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//设置派工
		bar.setLCR("返回","派工详情", null);
		bar.setListener(this);
		
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		((TempActivity)mContext).finish();
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		
	}

}
