package comeit.framework.configure.environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LocalProfile {
  protected final Logger log = LoggerFactory.getLogger(LocalProfile.class);
  
  @Bean
  public String test() {
    log.debug("[LocalProfile] 로컬!!!!!!!!");
    return "local";
  }
}
