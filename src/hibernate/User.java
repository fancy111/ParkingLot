package hibernate;
// Generated 2017-4-26 14:48:25 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer userId;
	private String userName;
	private String userPassword;
	private String userNickname;
	private String userPhoto;
	private String userGender;
	private Date userSigndate;
	private String userMail;
	private String userPhonenum;
	private Set cars = new HashSet(0);
	private Set usercreditnums = new HashSet(0);
	private Set rentforms = new HashSet(0);
	private Set bookforms = new HashSet(0);

	public User() {
	}

	public User(String userName, String userPassword, Date userSigndate) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSigndate = userSigndate;
	}

	public User(String userName, String userPassword, String userNickname, String userPhoto, String userGender,
			Date userSigndate, String userMail, String userPhonenum, Set cars, Set usercreditnums, Set rentforms,
			Set bookforms) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userNickname = userNickname;
		this.userPhoto = userPhoto;
		this.userGender = userGender;
		this.userSigndate = userSigndate;
		this.userMail = userMail;
		this.userPhonenum = userPhonenum;
		this.cars = cars;
		this.usercreditnums = usercreditnums;
		this.rentforms = rentforms;
		this.bookforms = bookforms;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserNickname() {
		return this.userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserPhoto() {
		return this.userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public String getUserGender() {
		return this.userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public Date getUserSigndate() {
		return this.userSigndate;
	}

	public void setUserSigndate(Date userSigndate) {
		this.userSigndate = userSigndate;
	}

	public String getUserMail() {
		return this.userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserPhonenum() {
		return this.userPhonenum;
	}

	public void setUserPhonenum(String userPhonenum) {
		this.userPhonenum = userPhonenum;
	}

	public Set getCars() {
		return this.cars;
	}

	public void setCars(Set cars) {
		this.cars = cars;
	}

	public Set getUsercreditnums() {
		return this.usercreditnums;
	}

	public void setUsercreditnums(Set usercreditnums) {
		this.usercreditnums = usercreditnums;
	}

	public Set getRentforms() {
		return this.rentforms;
	}

	public void setRentforms(Set rentforms) {
		this.rentforms = rentforms;
	}

	public Set getBookforms() {
		return this.bookforms;
	}

	public void setBookforms(Set bookforms) {
		this.bookforms = bookforms;
	}

}