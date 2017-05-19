package comeit.framework.configure.initializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import comeit.framework.configure.spring.MvcConfig;

/**
 * WebApplicationInitializer 를 구현하면, 서블릿 컨테이너가 실행될 때 onStartup() 메소드가 자동으로 호출된다.
 * 이 클래스는 web.xml 의 역할을 대신하거나 보충한다. 
 * @author linuxp
 *
 */
public class ApplicationInitializer implements WebApplicationInitializer {
  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    configureServletContext(servletContext);
    registerFilter(servletContext);
  }
  
  /**
   * 스프링 서블릿 컨텍스트 정보
   * @param servletContext
   * @throws ServletException
   */
  public void configureServletContext(ServletContext servletContext) throws ServletException {
    // Spring 설정 xml을 검색하여 스트링에 등록
    //String[] locations = new String[] { "classpath:conf/spring-context/context-*.xml" };
    //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(locations, false);
    //context.refresh();
    
    // Java Base로 작성된 스프링 어플리케이션 설정정보 스캔
    AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
    // comeit.spring 패키지의 @Configuration 어노테이션을 검색하여 스프링에 등록
    applicationContext.scan("comeit.framework.configure.spring");
    //applicationContext.register(AnnotationAwareAspectJAutoProxyCreator.class);
    //applicationContext.refresh();
    // context-application.xml
    //applicationContext.register(ApplicationContextConfig.class);
    // context-dataousrce.xml
    //applicationContext.register(DatasourceContextConfig.class);
    
    // 리스너로 등록
    servletContext.addListener(new ContextLoaderListener(applicationContext));
    
    // comeit.framework.spring.web.HttpServletRequestProvider을 사용하기 위해 아래 리스너를 등록해야 한다.
    servletContext.addListener(new RequestContextListener());

    // dispathcer-servlet.xml 대응
    AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
    dispatcherContext.register(MvcConfig.class);
    dispatcherContext.setServletContext(servletContext);
    
    Dynamic action = servletContext.addServlet("action", new DispatcherServlet(dispatcherContext));
    action.addMapping("/");
    action.setLoadOnStartup(1);
    
  }
  
  /**
   * 필터 등록
   * @param servletContext
   * @throws ServletException
   */
  public void registerFilter(ServletContext servletContext) throws ServletException {
    // Encoding 필터 설정
    FilterRegistration.Dynamic charEncodingFilterReg = servletContext.addFilter("encodingFilter", org.springframework.web.filter.CharacterEncodingFilter.class);
    charEncodingFilterReg.setInitParameter("encoding", "UTF-8");
    charEncodingFilterReg.addMappingForUrlPatterns(null, false, "/*");

    // Spring RESTful, PUT 사용시 FORM PARAMETER를 객체(맵)으로 바인딩 하기 위해 필요한 필터
    FilterRegistration.Dynamic httpPutFormFilterReg = servletContext.addFilter("httpPutFormFilter", org.springframework.web.filter.HttpPutFormContentFilter.class);
    httpPutFormFilterReg.addMappingForServletNames(null, false, "action");
    
    // Sitemesh 필터
    FilterRegistration.Dynamic sitemeshFilterReq = servletContext.addFilter("sitemesh", org.sitemesh.config.ConfigurableSiteMeshFilter.class);
    sitemeshFilterReq.addMappingForUrlPatterns(null, false, "/*");
    
    // Spring Security
    FilterRegistration.Dynamic securityFilterReq = servletContext.addFilter("springSecurityFilterChain", org.springframework.web.filter.DelegatingFilterProxy.class);
    securityFilterReq.addMappingForUrlPatterns(null, false, "/*");
  }
}
