package com.etc.Dao;

import hibernate.User;
import hibernate.Usercreditnum;

public interface UserCreditNumDao extends BaseDao<Usercreditnum>
{
	public boolean addCredit(int userID,String Creditnumber);
	public boolean addCredit(User user,String Creditnumber);
	
	public boolean deleteCredit(int userID,String Creditnum);
	public boolean deleteCredit(User user,String creditnum);

}
