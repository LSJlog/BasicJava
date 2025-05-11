package chapter20.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import chapter20.memo.MemoDAO;
import chapter20.memo.MemoVO;

class TestUnit {
	// TDD: Test Driven Development
	// 테스크코드를 작성하는 회사가 체계적인 회사
	// 테스트코드 작성 -> 성공 -> 코드 옮기기
	MemoDAO dao = new MemoDAO();

	@Test
	void test() {
		try {
			List<MemoVO> list = dao.selectMemos("");
			assertEquals(0, list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	void selectMemo() {
		MemoVO memo = dao.selectMemo(0);
		assertNull(memo);
	}
	@Test
	void insertMemo() {
		try {
			int insertMemo = dao.insertMemo(new MemoVO("7번재 시간", "이제 2시간 남음", "a001"));
			assertEquals(1,insertMemo);
			List<MemoVO> list = dao.selectMemos("");
			assertEquals(0, list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
