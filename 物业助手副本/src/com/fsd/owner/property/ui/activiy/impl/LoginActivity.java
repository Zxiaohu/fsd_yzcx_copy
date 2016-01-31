package com.fsd.owner.property.ui.activiy.impl;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import com.fsd.owner.property.R;
import com.fsd.owner.property.ui.activiy.base.BaseActivity;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;
import com.fsd.owner.property.ui.fragment.impl.LoginFragment;
import com.fsd.owner.property.ui.fragment.impl.RegisterFragment;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
/***
 * LoginActivity
 * @author zxh
 * 主界面activity
 */
public class LoginActivity extends BaseActivity {
	
	@ViewInject(R.id.vp_content)
	private ViewPager vp_content;
	
	List<BaseFragment> mFragments;
	
	FragmentPagerAdapter adapter;
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_login);
		ViewUtils.inject(this);
		
		//初始化fragment
		initFragments();
		
		//初始化 fragment适配器
		adapter=new MyPagerAdater(getSupportFragmentManager(), mFragments);
		
		if(adapter!=null){
			vp_content.setAdapter(adapter);
		}
		
	}

	private void initFragments() {
		// TODO Auto-generated method stub
		mFragments = new ArrayList<BaseFragment>();
		LoginFragment loginFragment = new LoginFragment();
		RegisterFragment registerFragment = new RegisterFragment();
		mFragments.add(loginFragment);
		mFragments.add(registerFragment);
		//return mFragments;
	}
	
	
	/****
	 * 
	 * @author xiaohu
	 *
	 */
	class MyPagerAdater extends FragmentPagerAdapter{

		private List<BaseFragment> fragments;
		
		public MyPagerAdater(FragmentManager fm,List<BaseFragment> fragments) {
			super(fm);
			// TODO Auto-generated constructor stub
			this.fragments=fragments;
		}

		
		@Override
		public Fragment getItem(int arg0) {
			// TODO Auto-generated method stub
			return fragments.get(arg0);
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return fragments.size();
		}
	}
}
