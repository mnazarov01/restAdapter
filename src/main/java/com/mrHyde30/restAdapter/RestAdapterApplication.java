package com.mrHyde30.restAdapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.soap.MessageFactory;

@SpringBootApplication
public class RestAdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestAdapterApplication.class, args);
	}

	@Bean
	public WebServiceTemplate webServiceTemplate() throws Exception {

			SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory(
					MessageFactory.newInstance());
			messageFactory.afterPropertiesSet();

			WebServiceTemplate webServiceTemplate = new WebServiceTemplate(
					messageFactory);
			Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

			marshaller.setContextPath("com.mrHyde30.restAdapter.soap");
			marshaller.afterPropertiesSet();

			webServiceTemplate.setMarshaller(marshaller);
			webServiceTemplate.setUnmarshaller(marshaller);
			webServiceTemplate.setDefaultUri("http://www.dneonline.com/calculator.asmx");

			webServiceTemplate.afterPropertiesSet();
			return webServiceTemplate;

	}

}
