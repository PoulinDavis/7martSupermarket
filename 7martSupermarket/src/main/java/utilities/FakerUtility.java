package utilities;

import com.github.javafaker.Faker;

public class FakerUtility {
	Faker faker = new Faker();//object create cheyunu Faker classine to call instane methd

	public String createRandomFirstName() {
		return faker.name().firstName();
	}

	public String createRandomLastName() {
		return faker.name().lastName();
	}

	public String generateAddress() {
		return faker.address().fullAddress();
	}

	public String generateEmail() {
		return faker.internet().emailAddress();
	}

	public String generateUsername() {
		return faker.name().username();
	}

	public String generatePassword() {
		return faker.internet().password();
	}


}
