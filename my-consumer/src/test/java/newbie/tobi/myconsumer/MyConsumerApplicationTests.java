package newbie.tobi.myconsumer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyConsumerApplicationTests {
	@Autowired
	MyProviderClient myProviderClient;
	@Test
	void testEcho() {
		String msg = myProviderClient.test("hello");
		System.out.println(msg);
	}

	@Test
	void testEX() {
		String result = myProviderClient.ex();
		System.out.println(result);
	}
}
