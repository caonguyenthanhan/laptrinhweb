package vn.iostar.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import vn.iostar.dao.ICategoryDao;
import vn.iostar.models.CategoryModel;
import vn.iostar.configs.DBconnectSQL;

public class CategoryDaoImpl implements ICategoryDao {

	public Connection conn=null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;
	
	
	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM Category";
		List<CategoryModel> list =new ArrayList<>() ;
		try {
			Connection conn = DBconnectSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CategoryModel category = new CategoryModel();
				category.setCategoryid(rs.getInt("cate_id"));
				category.setCategoryname(rs.getString("cate_name"));
				category.setImages(rs.getString(" images " ));
				category.setStatus(rs.getInt( " status "));
				list.add(category);
			}
			conn.close();
			ps.close();
			rs.close();
			return list;
			}
		return null;
	}

	@Override
	public CategoryModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(CategoryModel category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CategoryModel category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryModel> findName(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
