package comeit.framework.configure.environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevProfile {
  protected final Logger log = LoggerFactory.getLogger(DevProfile.class);
  
  @Bean
  public String test() {
    log.debug("[DevProfile] 개발!!!!!!!!");
    return "dev";
  }
}
