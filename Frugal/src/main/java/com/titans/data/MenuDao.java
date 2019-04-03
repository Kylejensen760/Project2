package com.titans.data;

import java.util.List;

import com.titans.beans.Menu;

public interface MenuDao {
	
	Menu getMenu(String s); // ** we need to change this line 

	void saveMenu(Menu m);
	void updateMenu(Menu m);
	void deleteMenu(Menu m);
	List<Menu> getMenu();

}
