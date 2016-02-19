package com.fsd.owner.property.ui.activiy.impl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.fsd.owner.property.R;
import com.fsd.owner.property.ui.activiy.ITaskView;
import com.fsd.owner.property.ui.activiy.base.BaseActivity;
import com.fsd.owner.property.ui.fragment.impl.order.TaskProgressFragment;
import com.fsd.owner.property.ui.view.TitleBar;
import com.fsd.owner.property.ui.view.TitleBar.TitleBarListener;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

/***
 * TaskActivity
 *
 * @author zxh
 *         订单详情页
 */
public class TaskActivity extends BaseActivity implements ITaskView, TitleBarListener {

    @ViewInject(R.id.tb_task_detail)
    private TitleBar bar;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle arg0) {
        // TODO Auto-generated method stub
        super.onCreate(arg0);
        this.setContentView(R.layout.activity_task);
        ViewUtils.inject(this);
        initData();
    }

    private void initData() {
        // TODO Auto-generated method stub

        manager = getSupportFragmentManager();
        transaction=manager.beginTransaction();

        Intent data = getIntent();
        String orderid = data.getStringExtra("orderid");
        TaskProgressFragment fragment= new TaskProgressFragment();
        Bundle b = new Bundle();
        b.putString("orderid",orderid);
        fragment.setArguments(b);

        transaction.add(R.id.fl_task_content,fragment);

        transaction.commit();

        bar.setLCR("返回", "详细信息", null);
        bar.setListener(this);
    }

    @Override
    public void back() {
        // TODO Auto-generated method stub
        this.finish();
    }

    @Override
    public void edit() {
        // TODO Auto-generated method stub
        //缺省
    }

}
