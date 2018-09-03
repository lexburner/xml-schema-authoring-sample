package moe.cnkirito.sample.xsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-09-03
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:kirito.xml"})
public class XmlSchemaAuthoringSampleApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(XmlSchemaAuthoringSampleApplication.class, args);
        ServiceBean serviceBean = applicationContext.getBean(ServiceBean.class);
        System.out.println(serviceBean.getName());
        ApplicationConfig applicationConfig = applicationContext.getBean(ApplicationConfig.class);
        System.out.println(applicationConfig.getName());
    }
}
