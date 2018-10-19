package testmybatis;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMybatis {
	public static void main(String[] args) {
		String conf = "conf.xml";// ����mybatis�����ļ�
		// һ�²���
		InputStream is = TestMybatis.class.getClassLoader().getResourceAsStream(conf);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();

		// ѡ����Ҫ�Ĳ���
		String statement = "com.testmybatis.model.mapping.userMapping.getUser";
		// ӳ�������ִ��session
		com.testmybatis.model.pojo.Mytalkuser user = session.selectOne(statement, 1);
		// ������
		System.out.println(user);
	}
}
