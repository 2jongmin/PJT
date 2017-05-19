package comeit.framework.configure.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
// <tx:annotation-driven/>
@EnableTransactionManagement
@Import(value={DatasourceContextConfig.class})
@ImportResource(value={"classpath:/conf/spring/aop-config.xml"})
public class TransactionContextConfig implements TransactionManagementConfigurer {
  protected final Logger log = LoggerFactory.getLogger(TransactionContextConfig.class);
  
  @Autowired
  private DatasourceContextConfig datasourceContextConfig;
  
  /**
   * 
   */
  @Override
  public PlatformTransactionManager annotationDrivenTransactionManager() {
    log.debug("annotationDrivenTransactionManager");
    return txManager();
  }
  
  /**
   * 
   * @return
   */
  @Bean(name="txManager")
  public DataSourceTransactionManager txManager() {
    log.debug("txManager");
    DataSourceTransactionManager txManager = new DataSourceTransactionManager();
    txManager.setDataSource(datasourceContextConfig.dataSource());
    //txManager.setDataSource(datasourceContextConfig.dataSourceJndi());
    return txManager;
  }
}
