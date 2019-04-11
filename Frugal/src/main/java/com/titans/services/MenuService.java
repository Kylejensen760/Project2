package com.titans.services;


import java.util.List;

import com.titans.beans.Menu;

public interface MenuService {
	
	public Menu getMenu(int id);
	public Menu addMenu(Menu m);
	public Menu saveMenu(Menu m);
	public void updateMenu(Menu m);
	public void deleteMenu(Menu m);
	public List<Menu> getMenu();
}
