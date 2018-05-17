package ru.mos.ugd.bus.gisrenupdate.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class WSConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/*");
    }

//    @Bean(name = "updates")
//    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema updatesSchema) {
//        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//        wsdl11Definition.setPortTypeName("UpdatesPort");
//        wsdl11Definition.setLocationUri("/ws");
//        wsdl11Definition.setTargetNamespace("http://bus.ugd.mos.ru/ws");
//        wsdl11Definition.setSchema(updatesSchema);
//        return wsdl11Definition;
//    }

    @Bean(name = "U_007_340_IN")
    public Wsdl11Definition defaultWsdl11Definition() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("wsdl/U_007_340_IN.wsdl")); //your wsdl location
        return wsdl11Definition;
    }

//    @Bean
//    public XsdSchema updatesSchema() {
//        return new SimpleXsdSchema(new ClassPathResource("{xsd/U_007_340_341.xsd},{xsd/U_007_340_IN.xsd},{xsd_common/Confirmation_v1.0.xsd}"));
//    }
}
