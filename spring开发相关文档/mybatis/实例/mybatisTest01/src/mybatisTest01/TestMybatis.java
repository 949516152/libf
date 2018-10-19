package mybatisTest01;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.model.pojo.User;

public class TestMybatis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String resource = "MybatisConfig.xml";
			InputStream inputStream  = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session = sqlSessionFactory.openSession();
			
								       //mapper.xml中 命名空间.id名称
			User user = session.selectOne("firstMapper.selectAll");
			System.out.println(user);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
