package vetweb.store.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration//Class to be read on application startup to provide configuration instances
public class WebGeneralConfiguration implements WebMvcConfigurer{
	
	@Bean//Configuration purpose instance to set the default language to be used in the application
	public LocaleResolver localeResolver() {
		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
		sessionLocaleResolver.setDefaultLocale(Locale.US);
		return sessionLocaleResolver;//Locale can be set on level of user session, by Accept-Language header and cookies
	}
	
	@Bean//Intercept when the application receives a request changing the language with the locale parameter
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("locale");
		return localeChangeInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());//Adds the method to the framework intercept registry
	}
	
	@Bean//Allows Thymeleaf to use Layout mechanism
	public LayoutDialect layoutDialect() {
		return new LayoutDialect();
	}	

}
