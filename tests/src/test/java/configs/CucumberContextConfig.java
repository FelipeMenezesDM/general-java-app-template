package configs;

import br.com.felipemenezesdm.Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
@CucumberContextConfiguration
public class CucumberContextConfig {
}
