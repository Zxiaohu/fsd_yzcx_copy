package com.fsd.owner.property.ui.fragment.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

import com.fsd.owner.property.R;
import com.fsd.owner.property.tools.SystemTools;
import com.fsd.owner.property.ui.activiy.impl.TempActivity;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;
import com.fsd.owner.property.ui.view.SimpleItem;
import com.fsd.owner.property.ui.view.TitleBar;
import com.fsd.owner.property.ui.view.TitleBar.TitleBarListener;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class PaiGongFragment extends BaseFragment implements TitleBarListener, OnClickListener {
	
	@ViewInject(R.id.tb_pg)
	private TitleBar bar;
	@ViewInject(R.id.et_pg_content)
	private EditText et_content;
	@ViewInject(R.id.si_select_photo)
	private SimpleItem si_photo;
	@ViewInject(R.id.si_select_address)
	private SimpleItem si_address;
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
		
		//设置派工的标题
		bar.setLCR("返回","派工详情", null);
		bar.setListener(this);
		
		//设置选择照片的条目的内容
		si_photo.setTAndC("选择照片","");
		//设置选择照片监听
		si_photo.setOnClickListener(this);
	
		//设置选择地址的条目
		si_address.setTAndC("选择地址", "");
		si_address.setOnClickListener(this);
	
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.si_select_photo:
			//选择照片
			SystemTools.toastI("选择照片");
			break;
		
		default:
			break;
		}
	}

}
