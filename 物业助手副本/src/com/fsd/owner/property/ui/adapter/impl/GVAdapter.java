package com.fsd.owner.property.ui.adapter.impl;

import java.util.List;

import com.fsd.owner.property.R;
import com.fsd.owner.property.model.bean.Item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/***
 * RoomSpAdapter
 * @author zxh
 * 房间选择的适配器
 */
public class GVAdapter extends BaseAdapter{
	
	/**需要填充的数据**/
	//private String [] datas;
	private List<Item> datas;

	private Context context;
	
	public GVAdapter(List<Item> datas,Context context) {
		super();
		this.context =context;
		this.datas = datas;
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return datas.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return datas.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder viewHolder;
		//如果缓存为空，
		if(convertView==null){

			viewHolder = new ViewHolder();
			convertView = View.inflate(context, R.layout.adapter_uc_item, null);
			viewHolder.textView=(TextView) convertView.findViewById(R.id.tv_desc);
			convertView.setTag(viewHolder);
			
		}else{
			viewHolder = (ViewHolder) convertView.getTag();
		}
			
			viewHolder.textView.setText(datas.get(position).desc);
		
		return convertView;
	}
	
	private class ViewHolder{
		TextView textView;
	}

}
