package guru.springframework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springboot.DependencyInjectionApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DependencyInjectionApplication.class)
public class DependencyInjectionApplicationTests {

	@Test
	public void contextLoads() {
	}

}
