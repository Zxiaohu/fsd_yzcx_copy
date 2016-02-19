package com.fsd.owner.property.ui.fragment.impl.order;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.fsd.owner.property.R;
import com.fsd.owner.property.ui.fragment.ITaskProgressView;
import com.fsd.owner.property.ui.fragment.base.BaseFragment;
import com.lidroid.xutils.ViewUtils;

/**
 *
 */
public class TaskProgressFragment extends BaseFragment implements ITaskProgressView{

    @Override
    public View initView(LayoutInflater inflater) {
        mRootView=inflater.inflate(R.layout.fragment_taskprogress,null);
        ViewUtils.inject(this,mRootView);
        return mRootView;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }
}
