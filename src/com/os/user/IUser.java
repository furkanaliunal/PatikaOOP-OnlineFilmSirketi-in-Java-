package com.os.user;

import java.util.ArrayList;

public interface IUser {
	public String getName();
	public void setName(String name);
	public String toString();
	public UserType getUserType();
	public void setUserType(UserType userType);
	public int getID();
	public void addCurrency(Float amount);
	public float getCurrency();
	public Boolean pay(Float amount);
	public ArrayList<Integer> getPurchasedFilms();
	public String toStringDetailed();
}
