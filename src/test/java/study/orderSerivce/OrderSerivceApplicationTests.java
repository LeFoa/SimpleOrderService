package study.orderSerivce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import study.orderSerivce.domain.entity.User;

@SpringBootTest
class OrderSerivceApplicationTests {

	@Test
	void contextLoads() {

		User sdd = User.builder()
				.name("성현")
				.authId("asdase")
				.password("12313")
				.build();

		System.out.println("sdd = " + sdd.getId());
		System.out.println("sdd = " + sdd.getName());
		System.out.println("sdd = " + sdd.getAuthId());
		System.out.println("sdd = " + sdd.getPassword());
		System.out.println("sdd = " + sdd.getEmail());
		System.out.println("sdd = " + sdd.getAddress());
	}

}
