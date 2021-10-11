package co.micol.prj.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {
	private static SqlSessionFactory sqlSessionFactory;
	
	private DataSource() {
		
	}
	public static SqlSessionFactory getInstance() {
		String resource = "resources/mybatisConfig.xml";
		InputStream inputStream;
		try {
			InputStream inputStream1 = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream1);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return sqlSessionFactory;
		
	}
}
