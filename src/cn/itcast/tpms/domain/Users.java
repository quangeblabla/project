package cn.itcast.tpms.domain;
// Generated Mar 17, 2018 9:36:51 AM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Users generated by hbm2java
 */
public class Users implements java.io.Serializable {

	private String uid;
	private String upassword;
	private String uname;
	private String usex;
	private String cat;
	private int uage;
	private String uaddress;
	private String uphone;
	private String upic;
	@JSONField(serialize=false)
	private Set detialCats = new HashSet(0);

	public Users() {
	}

	public Users(String uid, String upassword, String uname, String usex, int uage) {
		this.uid = uid;
		this.upassword = upassword;
		this.uname = uname;
		this.usex = usex;
		this.uage = uage;
	}

	public Users(String uid, String upassword, String uname, String usex, String cat, int uage, String uaddress,
			String uphone, String upic, Set detialCats) {
		this.uid = uid;
		this.upassword = upassword;
		this.uname = uname;
		this.usex = usex;
		this.cat = cat;
		this.uage = uage;
		this.uaddress = uaddress;
		this.uphone = uphone;
		this.upic = upic;
		this.detialCats = detialCats;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpassword() {
		return this.upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUsex() {
		return this.usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	public String getCat() {
		return this.cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public int getUage() {
		return this.uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public String getUaddress() {
		return this.uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUphone() {
		return this.uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUpic() {
		return this.upic;
	}

	public void setUpic(String upic) {
		this.upic = upic;
	}

	public Set getDetialCats() {
		return this.detialCats;
	}

	public void setDetialCats(Set detialCats) {
		this.detialCats = detialCats;
	}

}