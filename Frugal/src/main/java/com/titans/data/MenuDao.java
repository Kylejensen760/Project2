package com.titans.data;

import java.util.List;

import com.titans.beans.Menu;

public interface MenuDao {
	
	Menu getMenu(int id); // ** we need to change this line 
	Menu addMenu(Menu m);
	Menu saveMenu(Menu m);
	void updateMenu(Menu m);
	void deleteMenu(Menu m);
	List<Menu> getMenu();

}
