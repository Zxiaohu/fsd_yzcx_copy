package com.fsd.owner.property.presenter.fragment.impl;
import com.fsd.owner.property.model.dao.impl.FetchUserInfoDao;
import com.fsd.owner.property.model.dao.impl.FetchUserInfoDao.FetchListener;
import com.fsd.owner.property.ui.fragment.IUserCenterView;
/****
 * UserCenterPresenter 用户中心的
 * @author zxh
 * 2016年1月29日16:26:59
 */
public class UserCenterPresenter implements FetchListener {
	
	private IUserCenterView mView;
	private FetchUserInfoDao fetchInfoDao;
	
	public UserCenterPresenter(IUserCenterView view){
		this.mView = view;
		fetchInfoDao = new FetchUserInfoDao();
		//监听
		fetchInfoDao.setFetchListener(this);
	}
	
	/**判断用户是否登录**/
	public void setUserIsLogin(){
		//获取用户的手机号
		
		//1.存在
		mView.onUserLogin();
		
		//2.不存在
		mView.onUserNotLogin();
		
	}
	
	/**个人信息设置**/
	public void setUserInfo(){
		//获取用户的手机号
		
		//通过手机号去查询用户的信息
		fetchInfoDao.setUname("");
		//发送请求
		fetchInfoDao.sendHttp();
	}

	@Override
	public void onUserInfoReadly(String userinfo) {
		// TODO Auto-generated method stub
		mView.gotoUserInfoFrg();
	}
}
