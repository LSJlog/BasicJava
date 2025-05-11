package chapter20.memo;

import java.util.List;
import java.util.Scanner;

public class MemoController {
	private MemoService service = new MemoService();
	private MemoView view = new MemoView();
	
	public void selectMemos(String searchWord) throws Exception {
		List<MemoVO> list = service.selectMemos(searchWord);
		view.printMemos(list);
	}
	public void selectMemo(Scanner scanner) {
		int searchNo = view.inputSelectNo(scanner);
		MemoVO memo = service.selectMemo(searchNo);
		view.printMemo(memo);
	}
//	삽입
	public void insertMemo(Scanner scanner) throws Exception {
		MemoVO vo = view.inputInsertMemo(scanner);
		int insertMemo = service.insertMemo(vo);
		view.insertResult(insertMemo);
	}
//	업데이트
	public int updateMemo(Scanner scanner) throws Exception {
		MemoVO vo = view.updateMemo(scanner);
		return service.updateMemo(vo);
	}
//	삭제
	public int deleteMemo(int deleteNo) {
		return service.deleteMemo(deleteNo);
	}
}
