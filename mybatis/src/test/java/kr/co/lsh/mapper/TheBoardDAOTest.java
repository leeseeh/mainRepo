package kr.co.lsh.mapper;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import kr.co.lsh.theboard.dao.TheBoardDAO;
import kr.co.lsh.theboard.vo.TheBoardVO;
import lombok.extern.log4j.Log4j;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TheBoardDAOTest{
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	private TheBoardDAO dao;
	
	@Test
	public void getBoardOneTest() {
		
		for(String beanName : context.getBeanDefinitionNames()) {
			System.out.println("888888888888  => " + beanName);
		}
		System.out.println(dao.selectBoardOne(17) + " ===============");
	}
	
	@Test
	public void delBoardTest() {
		assertEquals(dao.deleteBoard(11), 1);
	}
	
	@Test
	public void getAllTest() {
		List<TheBoardVO> list = dao.selectAll();
		for(TheBoardVO vo : list) {
			System.out.println( vo);
		}
	}
}
