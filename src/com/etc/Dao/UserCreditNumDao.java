package com.etc.Dao;

import hibernate.User;
import hibernate.Usercreditnum;

public interface UserCreditNumDao extends BaseDao<Usercreditnum>
{
	public Usercreditnum addCredit(int userID,String Creditnumber);
	public Usercreditnum addCredit(User user,String Creditnumber);
	
	public Usercreditnum deleteCredit(int userID,String Creditnum);
	public Usercreditnum deleteCredit(User user,String creditnum);

}
