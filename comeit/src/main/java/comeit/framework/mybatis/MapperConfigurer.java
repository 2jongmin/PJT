package comeit.framework.mybatis;

import org.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * Mapper 어노테이션으로 스캔을 Repository 어노테이션 스캔으로 변경
 * 동작여부 테스트 해야함
 * @author hskim
 *
 */
public class MapperConfigurer extends MapperScannerConfigurer {
  /**
   * 기본 정보(anntationClass, sqlSessionFactoryBeanName)으로 설정한다.
   */
  public MapperConfigurer() {
      super.setAnnotationClass(org.springframework.stereotype.Repository.class);
      super.setSqlSessionFactoryBeanName("sqlSessionFactory");
  }
}
