package szerszen.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import szerszen.springtutorial.api.UsersRepository;
import szerszen.springtutorial.domain.User;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		UsersRepository usersRepository = context.getBean("repozytoriumUzytkownika",UsersRepository.class);
		
		User janek = usersRepository.createUser("janek");

	}

}
