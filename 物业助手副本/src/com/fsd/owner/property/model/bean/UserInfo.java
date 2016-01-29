package com.fsd.owner.property.model.bean;
/**
 * UserInfo 
 * @author zxh
 * you  know
 * 2016年1月29日13:48:27
 */
public class UserInfo {

	/**昵称**/
	private String nickname;
	/**积分**/
	private String score;
	/**头像**/
	private String photo;
	/**收货地址**/
	private String address;
	/**房间的id**/
	private String house_id;
	/**房间的名字**/
	private String house_name;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHouse_id() {
		return house_id;
	}
	public void setHouse_id(String house_id) {
		this.house_id = house_id;
	}
	public String getHouse_name() {
		return house_name;
	}
	public void setHouse_name(String house_name) {
		this.house_name = house_name;
	}
	
}
