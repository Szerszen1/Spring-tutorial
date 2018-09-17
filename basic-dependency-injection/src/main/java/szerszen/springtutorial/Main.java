package szerszen.springtutorial;

import szerszen.springtutorial.api.Logger;
import szerszen.springtutorial.api.UsersRepository;
import szerszen.springtutorial.domain.User;
import szerszen.springtutorial.implementations.LoggerImpl;
import szerszen.springtutorial.implementations.UsersRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository userRepository = new UsersRepositoryImpl();
		userRepository.setLogger(logger);
		
		User user = userRepository.createUser("Janusz");
	}
}
