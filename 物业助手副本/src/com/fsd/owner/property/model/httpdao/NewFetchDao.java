package com.fsd.owner.property.model.httpdao;

import android.app.ProgressDialog;
import android.content.Context;

import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;

/****
 * 改进网络请求的封装
 * @author zxh
 * 修改了对网络请求的封装
 */
public class NewFetchDao extends RequestCallBack<String>{
	
	private String mURL;//地址
	private RequestParams mParams;//请求的参数
	
	/**是否显示dialog**/
	private boolean isShowDialog=false;
	
	/**进度对话框**/
	private ProgressDialog progressDialog;
	private IHttpListenner listenner;
	
	public NewFetchDao(String mURL,RequestParams mParams,IHttpListenner listenner) {
		this.mURL = mURL;
		this.mParams = mParams;
		this.listenner=listenner;
	}
	
	/**是否开启进度框**/
	public NewFetchDao setShowDialog(boolean isShow,Context context){
		isShow=true;
		progressDialog = new ProgressDialog(context);
		return this;
	}
	
	/**网络请求**/
	public void fetch(){
		HttpUtils httpUtils = new HttpUtils(6*3000);
		httpUtils.send(HttpMethod.POST, mURL, mParams,this);
	}
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		if(isShowDialog){
			progressDialog.show();
		}
	}
	
	@Override
	public void onCancelled() {
		// TODO Auto-generated method stub
		super.onCancelled();
	
	}
	
	@Override
	public void onLoading(long total, long current, boolean isUploading) {
		// TODO Auto-generated method stub
		super.onLoading(total, current, isUploading);
		if(isShowDialog){
			progressDialog.show();
		}
	}
	@Override
	public void onFailure(HttpException arg0, String arg1) {
		// TODO Auto-generated method stub
		if(isShowDialog){
			progressDialog.dismiss();
		}
		listenner.fail(arg1);
	}

	@Override
	public void onSuccess(ResponseInfo<String> arg0) {
		// TODO Auto-generated method stub
		if(isShowDialog){
			progressDialog.dismiss();
		}
		listenner.success(arg0.result.toString());
	}
	
	/**网络请求完毕后的接口**/
	public interface IHttpListenner{
		void success(String r);
		void fail(String arg1);
	}
}
