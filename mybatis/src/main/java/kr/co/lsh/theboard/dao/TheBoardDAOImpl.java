package kr.co.lsh.theboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.lsh.theboard.vo.TheBoardVO;

@Repository
public class TheBoardDAOImpl implements TheBoardDAO {

	@Autowired
	private SqlSession session;
	
	@Override
	public int insertBoard(TheBoardVO vo) {
		return session.insert("TheBoardNS.insertTB", vo);
	}

	@Override
	public TheBoardVO selectBoardOne(long theBoardNum) {
		return session.selectOne("TheBoardNS.selectTB", theBoardNum);
	}

	@Override
	public int deleteBoard(long theBoardNum) {
		return session.delete("TheBoardNS.deleteTB", theBoardNum);
	}

	@Override
	public List<TheBoardVO> selectAll() {
		return session.selectList("TheBoardNS.selectAll");
	}

}
