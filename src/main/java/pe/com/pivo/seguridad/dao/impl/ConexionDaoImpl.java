/**
 * 
 */
package pe.com.pivo.seguridad.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.pivo.seguridad.dao.ConexionDao;

public class ConexionDaoImpl implements ConexionDao {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Override
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

}
