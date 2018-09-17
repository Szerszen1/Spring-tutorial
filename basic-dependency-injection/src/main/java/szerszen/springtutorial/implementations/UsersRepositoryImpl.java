package szerszen.springtutorial.implementations;

import szerszen.springtutorial.api.Logger;
import szerszen.springtutorial.api.UsersRepository;
import szerszen.springtutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
	private Logger logger;

	public User createUser(String name) {
		logger.log("Tworzenie u¿ytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;

	}

}
