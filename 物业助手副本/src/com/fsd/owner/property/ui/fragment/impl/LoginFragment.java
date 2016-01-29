package com.fsd.owner.property.ui.fragment.impl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.fsd.owner.property.R;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

/****
 * 
 * LoginFragment
 * @author zxh
 * 登录的fragment
 *
 */
public class LoginFragment extends BaseFragment implements OnClickListener {

	@ViewInject(R.id.et_name)
	private EditText et_name;
	@ViewInject(R.id.et_pwd)
	private EditText et_pwd;
	@ViewInject(R.id.btn_login)
	private Button btn_login;
	
	@Override
	public View initView(LayoutInflater inflater) {
		// TODO Auto-generated method stub
		mRootView = inflater.inflate(R.layout.fragment_login, null);
		ViewUtils.inject(this,mRootView);
		return mRootView;
	}

	@Override
	public void initData() {
		// TODO Auto-generated method stub\
		btn_login.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_login://登录
			
			break;
		default:
			break;
		}
	}

}
