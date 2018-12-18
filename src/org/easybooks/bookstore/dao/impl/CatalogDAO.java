package org.easybooks.bookstore.dao.impl;
import java.util.List;
import org.easybooks.bookstore.dao.*;
import org.hibernate.*;
public class CatalogDAO extends BaseDAO implements ICatalogDAO{
	//得到所有的图书类别
	public List getAllCatalogs(){
		Session session=getSession();
		Query query=session.createQuery("from Catalog c");
		List catalogs=query.list();
		session.close();
		return catalogs;
	}
}
