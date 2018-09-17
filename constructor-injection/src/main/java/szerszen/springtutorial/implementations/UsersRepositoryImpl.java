package szerszen.springtutorial.implementations;

import szerszen.springtutorial.api.Logger;
import szerszen.springtutorial.api.UsersRepository;
import szerszen.springtutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
	private Logger logger;

	public UsersRepositoryImpl(Logger logger, String localization, String dbName) {
		this.logger = logger;
		logger.log("Lokalizacja repozytorium: " + localization + "/ " + dbName);
		
	}

	public User createUser(String name) {
		logger.log("Tworzenie u¿ytkownika " + name);
		return new User(name);
	}

}
