package controller;

import java.util.HashMap;
import java.util.Map;

public class RequestControllerMapping {
	private static final Map<RequestKeyValue,Controller> mapping = new HashMap<>();
	
	public static void init() {
		//로그인 기능
		mapping.put(new RequestKeyValue("/login.hrd", "GET"), new LoginViewController());
		mapping.put(new RequestKeyValue("/login.hrd", "POST"), new LoginActionController());
		mapping.put(new RequestKeyValue("/logout.hrd", "GET"), new LogoutController());
		mapping.put(new RequestKeyValue("/join.hrd", "POST"), new RegActionController());
		mapping.put(new RequestKeyValue("/join.hrd", "GET"), new RegisterController());
		
	}
	//url,method 필드를 저장하는 key 를 전달받아 HashMap에서 value(컨트롤러)를 리턴
	public static Controller getController(RequestKeyValue key) {
		return mapping.get(key);
	}
}
