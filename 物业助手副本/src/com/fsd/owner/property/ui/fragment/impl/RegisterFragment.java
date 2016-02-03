package com.fsd.owner.property.ui.fragment.impl;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.fsd.owner.property.R;
import com.fsd.owner.property.global.SPParam;
import com.fsd.owner.property.presenter.fragment.impl.RegisterPresenter;
import com.fsd.owner.property.tools.SharedPfTools;
import com.fsd.owner.property.ui.fragment.IReginsterView;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;
import com.fsd.owner.property.ui.view.button.TimeButton;
import com.fsd.owner.property.ui.view.roomchoose.RoomChooser;
import com.fsd.owner.property.ui.view.roomchoose.RoomChooser.OnRoomInfoCompleteListener;
import com.fsd.owner.property.ui.view.roomchoose.RoomInfo;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
/***
 * RegisterFragment
 * @author zxh
 * 注册的fragment
 */
public class RegisterFragment extends BaseFragment implements IReginsterView, OnClickListener, OnRoomInfoCompleteListener{

	@ViewInject(R.id.tv_choose_house)
	private TextView tv_choose_house;

	@ViewInject(R.id.tv_name)
	private TextView tv_name;

	@ViewInject(R.id.tv_phonenum)
	private TextView tv_phonenum;

	@ViewInject(R.id.roomch)
	private RoomChooser roomChooser;
	
	@ViewInject(R.id.et_phonenum)
	private EditText et_phonenum;
	
	@ViewInject(R.id.btn_checknum)
	private TimeButton btn_checkNum;
	
	@ViewInject(R.id.et_checknum)
	private EditText et_checknum;
	
	@ViewInject(R.id.btn_rel)
	private Button btn_rel;
	
	RegisterPresenter presenter;

	@Override
	public View initView(LayoutInflater inflater) {
		// TODO Auto-generated method stub
		mRootView=inflater.inflate(R.layout.fragment_register,null);
		ViewUtils.inject(this,mRootView);
		return mRootView;
	}


	@Override
	public void initData() {
		//初始化控制器
		presenter = new RegisterPresenter(this, mContext);
		// TODO Auto-generated method stub
		tv_choose_house.setOnClickListener(this);
		//选择房号完成的事件
		roomChooser.setCompleteListener(this);

	}


	@Override
	public void setUserInfo(String[] userinfo) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getUserPhoneNum() {
		// TODO Auto-generated method stub
		return et_phonenum.getText().toString();
	}


	@Override
	public String getCheckNum() {
		// TODO Auto-generated method stub
		return et_checknum.getText().toString();
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tv_choose_house:
			//业主选择房号的信息
			roomChooser.sartRequest();			
			break;
		case R.id.btn_checknum:
			//发送验证请求
			presenter.executeCheckNum();
			break;
		case R.id.btn_rel:
			//注册提交操作
			presenter.executeRel();
			break;
		default:
			break;
		}
	}


	@Override
	public void onRoomInfoSuccess(RoomInfo roomInfo) {
		// TODO Auto-generated method stub
		tv_name.setText(roomInfo.getMastername());
		String telnumber = roomInfo.getTelnumber();
		
		//保存用户的电话到缓存中
		if(telnumber.length()==11){
			SharedPfTools.insertData(SPParam.PhoneNum,telnumber);
			String star=telnumber.substring(0,3);
			String end=telnumber.substring(telnumber.length()-5, telnumber.length()-1);
			tv_phonenum.setText(star+"****"+end);
		}else{
			tv_phonenum.setText(telnumber);
		}
		//presenter.getUserInfo();
	}


}
