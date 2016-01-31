package com.fsd.owner.property.presenter.fragment.impl;

import android.content.Context;

import com.fsd.owner.property.ui.fragment.IReginsterView;

public class RegisterPresenter {
	
	private IReginsterView mView;
	private Context mContext;
	
	public RegisterPresenter(IReginsterView mView, Context mContext) {
		super();
		this.mView = mView;
		this.mContext = mContext;
	}
	
	/**获取用户的信息**/
	public void  getUserInfo(){
		/**弹出选择房号信息的对话框**/
		
	}
}
