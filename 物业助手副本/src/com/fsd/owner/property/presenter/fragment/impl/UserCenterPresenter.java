package com.fsd.owner.property.presenter.fragment.impl;
import com.fsd.owner.property.global.SPParam;
import com.fsd.owner.property.model.bean.UserInfo;
import com.fsd.owner.property.model.httpdao.impl.FetchUserInfoDao;
import com.fsd.owner.property.model.httpdao.impl.FetchUserInfoDao.FetchListener;
import com.fsd.owner.property.tools.DataTools;
import com.fsd.owner.property.tools.SharedPfTools;
import com.fsd.owner.property.tools.SystemTools;
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
		String uname=SharedPfTools.queryStr(SPParam.PhoneNum);
		//1.存在
		if(uname!=null){

			//通过手机号去查询用户的信息
			fetchInfoDao.setUname(uname);
			//发送请求
			fetchInfoDao.sendHttp();
		}
		//2.不存在
		else{
			mView.onUserNotLogin();
		}
	}

	@Override
	public void onUserInfoReadly(String userinfo) {
		// TODO Auto-generated method stub
		try{
			//同步数据到本地缓存
			SharedPfTools.insertData(SPParam.UserInfo,userinfo);
			/**获取用户的信息***/
			UserInfo userinfo_obj = DataTools.getUserInfo();
			/**回传数据**/
			mView.onUserLogin(userinfo_obj);
		
		}catch(Exception exception){
			SystemTools.fail("系统异常");
		}
	}
}
