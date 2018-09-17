package szerszen.springtutorial.api;

import szerszen.springtutorial.domain.User;

public interface UsersRepository {
	User createUser(String name);
	void setLogger(Logger logger);

}
