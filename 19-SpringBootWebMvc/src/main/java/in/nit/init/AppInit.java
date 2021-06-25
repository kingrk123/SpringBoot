package in.nit.init;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}