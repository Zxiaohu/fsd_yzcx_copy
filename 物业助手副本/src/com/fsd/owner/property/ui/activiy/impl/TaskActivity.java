package com.fsd.owner.property.ui.activiy.impl;

import android.os.Bundle;
import com.fsd.owner.property.R;
import com.fsd.owner.property.ui.activiy.ITaskView;
import com.fsd.owner.property.ui.activiy.base.BaseActivity;
import com.fsd.owner.property.ui.view.TitleBar;
import com.fsd.owner.property.ui.view.TitleBar.TitleBarListener;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

/***
 * TaskActivity
 * @author zxh
 * 订单详情页
 */
public class TaskActivity extends BaseActivity implements ITaskView, TitleBarListener{

	@ViewInject(R.id.tb_task_detail)
	private TitleBar bar;


	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		this.setContentView(R.layout.activity_task);
		ViewUtils.inject(this);
		initData();
	}

	private void initData() {
		// TODO Auto-generated method stub
		bar.setLCR("返回","详细信息", null);
		bar.setListener(this);
	}
	@Override
	public void back() {
		// TODO Auto-generated method stub
		this.finish();
	}
	@Override
	public void edit() {
		// TODO Auto-generated method stub
		//缺省
	}
	
}
