package com.fsd.owner.property.ui.fragment.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.fsd.owner.property.R;
import com.fsd.owner.property.presenter.fragment.impl.LoginPersenter;
import com.fsd.owner.property.tools.LogUtil;
import com.fsd.owner.property.tools.SystemTools;
import com.fsd.owner.property.ui.fragment.ILoginView;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

/****
 * 
 * LoginFragment
 * @author zxh
 * 2016年2月1日10:44:39
 * 登录的fragment
 *
 */
public class LoginFragment extends BaseFragment implements OnClickListener,ILoginView {

	@ViewInject(R.id.et_name)
	private EditText et_name;
	@ViewInject(R.id.et_pwd)
	private EditText et_pwd;
	@ViewInject(R.id.btn_login)
	private Button btn_login;
	private LoginPersenter persenter;
	
	@Override
	public View initView(LayoutInflater inflater) {
		// TODO Auto-generated method stub
		mRootView = inflater.inflate(R.layout.fragment_login, null);
		ViewUtils.inject(this,mRootView);
		return mRootView;
	}

	@Override
	public void initData(Bundle savedInstanceState) {
		persenter = new LoginPersenter(this);
		btn_login.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		LogUtil.e("test","我登录了");
		switch (v.getId()) {
		case R.id.btn_login://登录
			persenter.doLogin();
			break;
		default:
			break;
		}
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return et_name.getText().toString();
	}

	@Override
	public String getUserPwd() {
		// TODO Auto-generated method stub
		return et_pwd.getText().toString();
	}

	@Override
	public void onLoginSuccess() {
		// TODO Auto-generated method stub
		SystemTools.toastI("dddddddddddd");
	}

	@Override
	public void gotoRegisterFrg() {
		// TODO Auto-generated method stub
		//跳转注册一页
	}

}
