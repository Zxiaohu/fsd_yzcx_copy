package com.fsd.owner.property.ui.fragment.impl;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.fsd.owner.property.R;
import com.fsd.owner.property.model.bean.ConfigInfo;
import com.fsd.owner.property.tools.UiTools;
import com.fsd.owner.property.ui.activiy.impl.TempActivity;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;
import com.fsd.owner.property.ui.view.TitleBar;
import com.fsd.owner.property.ui.view.TitleBar.TitleBarListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class PayFragment extends BaseFragment implements TitleBarListener {

	@ViewInject(R.id.tb_fw_pay)
	private TitleBar bar;
	
	@ViewInject(R.id.lv_subservice)
	private ListView lv_subservice;
	
	@Override
	public View initView(LayoutInflater inflater) {
		// TODO Auto-generated method stub
		mRootView = inflater.inflate(R.layout.fragment_pay, null);
		ViewUtils.inject(this,mRootView);
		return mRootView;
	}

	@Override
	public void initData(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//获取页面传过来的数据
		Bundle b = getArguments();
		String subservices = b.getString("r");
		String id = b.getString("id");
		String name = b.getString("name");
		
		//设置标题栏内容
		bar.setLCR("返回",name,null);
		bar.setListener(this);
		
		//获取字符串中的内容
		List<ConfigInfo> lists=new Gson().fromJson(subservices, new TypeToken<List<ConfigInfo>>(){}.getType());
		String test[]=new String[lists.size()];
		List<Spanned> list = new ArrayList<Spanned>();
		
		for (int i = 0; i < lists.size(); i++) {
			test[i]=lists.get(i).getConfigvalue();
			Spanned spanned = UiTools.getSpanned("#d55dd5",lists.get(i).getConfigvalue());
			list.add(spanned);
		}
		//填充listView
		lv_subservice.setAdapter(new ArrayAdapter<Spanned>(mContext, android.R.layout.simple_list_item_1,list));
		
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
