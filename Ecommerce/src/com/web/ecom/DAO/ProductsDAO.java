package com.web.ecom.DAO;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.web.ecom.model.ProductsBean;

public class ProductsDAO {

	private HibernateTemplate hibernateTemplate;
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public NamedParameterJdbcTemplate getNamedJdbcTemplate() {
		return namedJdbcTemplate;
	}

	public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
	}



	public List<ProductsBean> getAllProducts(ProductsBean pb){
		String sql = "select * from products";
		SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(pb);
		return namedJdbcTemplate.query(sql, sqlParameterSource, new BeanPropertyRowMapper<>(ProductsBean.class));
	}
	
}
