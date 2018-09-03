package moe.cnkirito.sample.xsd;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-09-03
 */
public class KiritoNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        super.registerBeanDefinitionParser("application", new KiritoBeanDefinitionParser(ApplicationConfig.class));
        super.registerBeanDefinitionParser("service", new KiritoBeanDefinitionParser(ServiceBean.class));
    }

}