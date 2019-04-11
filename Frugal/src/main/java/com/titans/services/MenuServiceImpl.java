package com.titans.services;

import com.titans.beans.Menu;
import com.titans.data.MenuDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	private MenuDao md;
	
	@Override
	public Menu addMenu(Menu m) {
		return md.addMenu(m);
	}

	@Override
	public Menu getMenu(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu saveMenu(Menu m) {
		return md.saveMenu(m);		
	}

	@Override
	public void updateMenu(Menu m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMenu(Menu m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Menu> getMenu() {
		// TODO Auto-generated method stub
		return null;
	}

}
