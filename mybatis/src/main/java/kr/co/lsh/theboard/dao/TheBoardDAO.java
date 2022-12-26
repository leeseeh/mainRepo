package kr.co.lsh.theboard.dao;

import java.util.List;

import kr.co.lsh.theboard.vo.TheBoardVO;

public interface TheBoardDAO {

int insertBoard(TheBoardVO vo);
	
	TheBoardVO selectBoardOne(long theBoardNum);

	int deleteBoard(long theBoardNum);
	
	List<TheBoardVO> selectAll();
}
