package chapter06;

public class MemberService {
	
	boolean login(String id, String password){
//		null 값일 경우 아래 방법으로 하면 null pointer 에러가 사라짐
		if ("hong".equals(id) && "12345".equals(password)) {
			return true;
		}
		return false;
		
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
