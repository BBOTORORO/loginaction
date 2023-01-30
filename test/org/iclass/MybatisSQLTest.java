package org.iclass;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.iclass.dao.NewMemberMybatisDao;
import org.iclass.vo.NewMember;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mybatis.SqlSessionBean;

class MybatisSQLTest {

	private NewMemberMybatisDao dao = NewMemberMybatisDao.getInstance();
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

	
	@DisplayName("sqlsession 연결 테스트 ")
	@Test
	void session() {
		SqlSession mapper = SqlSessionBean.getSession();
		assertNotEquals(mapper, null);
		mapper.close();
		
	}
	@DisplayName("sqlsession 전체 조회 테스트- 현재 예상값 3")
	@Test
	void selectList() {
		SqlSession mapper = SqlSessionBean.getSession();
		assertEquals(dao.selectAll().size(),3);
		
	}
	@DisplayName("insert 테스트 - id:momo 로 추가 ")	//첫번쨰 테스트는 성공 두번쨰 테스트는 실패가 되야합니다 : 원인은 모모가 PK이기 떄문입니다. 
	@Test
	void insert() {
		
		int result = dao.insert(NewMember.builder()
				.id("urusi")
				.name("우루시")
				.password("1212")
				.email("urusi@naver.com")
			//	.age(23)
			//	.gender("2")
			//	.hobbies("달리기")
				.build()
				);
		
		assertEquals(result, 1);
	
	}
	
	@Test
	@DisplayName("로그인")
	void login() {
		String id= "momo";
		String password = "1111";
		Map<String,String> map = new HashMap<String,String>();
		map.put("id" ,id);
		map.put("password" ,password);
	
	//	NewMember vo = dao.login(map);
	//	assertNotNull(vo.getId());
	}
	
		
		
	
}
