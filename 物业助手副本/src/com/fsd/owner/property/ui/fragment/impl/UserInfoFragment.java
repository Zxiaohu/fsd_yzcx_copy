package com.fsd.owner.property.ui.fragment.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fsd.owner.property.R;
import com.fsd.owner.property.tools.ResTools;
import com.fsd.owner.property.tools.UiTools;
import com.fsd.owner.property.ui.fragment.IUserInfoView;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;
import com.fsd.owner.property.ui.view.SimpleItem;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class UserInfoFragment extends BaseFragment implements IUserInfoView,OnClickListener{


	@ViewInject(R.id.iv_head)
	private ImageView iv_head;
	@ViewInject(R.id.si_nickname)
	private SimpleItem si_nickname;
	@ViewInject(R.id.si_address)
	private SimpleItem si_address;
	@ViewInject(R.id.si_houseinfo)
	private SimpleItem si_houseinfo;
	@ViewInject(R.id.si_score)
	private SimpleItem si_score;
	@ViewInject(R.id.ry_head)
	private RelativeLayout ry_head;
	@Override
	public View initView(LayoutInflater inflater) {
		// TODO Auto-generated method stub
		mRootView=inflater.inflate(R.layout.fragment_userinfo,null);
		ViewUtils.inject(this,mRootView);
		initCurrentView();
		return mRootView;
	}

	private void initCurrentView() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void initData(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		//给textView赋值
	
		setContent(
				new SimpleItem[]{si_nickname,si_address,si_houseinfo,si_score}, 
				ResTools.getArr(R.array.userinfo_item),
				ResTools.getArr(R.array.userinfo_item));
		
		si_nickname.setOnClickListener(this);
		si_address.setOnClickListener(this);
		si_houseinfo.setOnClickListener(this);
		si_score.setOnClickListener(this);
		ry_head.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
	public void setContent(SimpleItem [] simpleItems,String []tips,String [] contents){
		for (int i = 0; i < tips.length; i++) {
			simpleItems[i].setTAndC(tips[i],contents[i]);
		}
	}
}
