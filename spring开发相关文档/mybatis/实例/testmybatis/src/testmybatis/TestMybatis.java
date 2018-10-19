package testmybatis;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMybatis {
	public static void main(String[] args) {
		String conf = "conf.xml";// 引入mybatis配置文件
		// 一下不变
		InputStream is = TestMybatis.class.getClassLoader().getResourceAsStream(conf);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();

		// 选择需要的操作
		String statement = "com.testmybatis.model.mapping.userMapping.getUser";
		// 映射操作并执行session
		com.testmybatis.model.pojo.Mytalkuser user = session.selectOne(statement, 1);
		// 输出结果
		System.out.println(user);
	}
}
