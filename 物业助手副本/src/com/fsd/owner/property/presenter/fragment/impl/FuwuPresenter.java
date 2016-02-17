package com.fsd.owner.property.presenter.fragment.impl;

import com.fsd.owner.property.global.HttpParam;
import com.fsd.owner.property.global.MyHttpUrl;
import com.fsd.owner.property.model.httpdao.NewFetchDao;
import com.fsd.owner.property.model.httpdao.NewFetchDao.IHttpListenner;
import com.fsd.owner.property.tools.HttpTools;
import com.fsd.owner.property.tools.LogUtil;
import com.fsd.owner.property.ui.fragment.IFuwuView;
import com.lidroid.xutils.http.RequestParams;

public class FuwuPresenter {
	private IFuwuView v;
	private NewFetchDao dao;
	public FuwuPresenter(IFuwuView v) {
		super();
		this.v = v;
	}
	
	//获取子服务项的数据
	public void getSubS(String upid){
		//设置网络请求的参数
		RequestParams params = HttpTools.getParam(
				new HttpParam[]{HttpParam.CONFIGTYPE,HttpParam.UPID},new String[]{"subservice",upid});
		//实例化
		dao = new NewFetchDao(MyHttpUrl.CONFIG,params,new IHttpListenner() {
			@Override
			public void success(String r) {
				// TODO Auto-generated method stub
				LogUtil.i("config",r);
			}
			@Override
			public void fail(String arg1) {
				// TODO Auto-generated method stub
				LogUtil.e("config",arg1);
			}
		});
		//发送请求
		dao.fetch();
	}
}
