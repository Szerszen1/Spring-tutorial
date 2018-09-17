package szerszen.springtutorial;

import java.util.logging.Logger;

public class UserCreator {
	Logger logger = Logger.getLogger(this.getClass().getName());

	public User createUser(String userName) {
		logger.info("Tworzenie u¿ytkownika " + userName);
		User user = new User();
		user.setName(userName);
		return user;
	}
}
