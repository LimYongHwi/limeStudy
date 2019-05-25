package common.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("CommonDao")
public class CommonDao {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "common.dao.CommonMapper";
	
	/*DB���� ���� �ð���ȸ*/
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	};
}
