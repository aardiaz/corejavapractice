package abstraction;

import java.io.Serializable;

public interface UserService extends CommonService, Serializable {

	void addUser();
	void deleteUser();
	
  	default void searchUser() {
		
	}
   	
	default void searchUsersdffs() {
		
	}
	
	static void add() {
		
	}
	
}
