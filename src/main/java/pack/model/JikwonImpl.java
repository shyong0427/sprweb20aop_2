package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JikwonImpl extends SqlSessionDaoSupport implements JikwonInter{
	@Autowired
	public JikwonImpl(SqlSessionFactory factory) {
		// TODO Auto-generated constructor stub
		setSqlSessionFactory(factory);
	}
	
	@Override
	public List<JikwonDto> jikwonList() {
		return getSqlSession().selectList("selectDataAll");
	}
	
	@Override
	public JikwonDto getLoginInfo(String id) {
		return getSqlSession().selectOne("selectLogin", id);
	}
}







