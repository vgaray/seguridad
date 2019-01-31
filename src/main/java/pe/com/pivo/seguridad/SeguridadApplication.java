package pe.com.pivo.seguridad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;


@ComponentScan(basePackages = {"pe.com.pivo.seguridad"})
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)
@ImportResource(locations = "classpath:mybatis-config.xml")
@SpringBootApplication(scanBasePackages={"pe.com.pivo.seguridad"})

public class SeguridadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeguridadApplication.class, args);
	}

}

