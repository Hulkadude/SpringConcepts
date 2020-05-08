package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import com.nineleaps.learning.SpringConcepts.model.Information;

public class BeanDefineDemo {
	public static void main(String args[]) {
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		BeanDefinitionBuilder b =
                BeanDefinitionBuilder.rootBeanDefinition(Information.class)
                                     .addPropertyValue("email", "123@abc.com")
                                     .addPropertyValue("team", "India");
		
      defaultListableBeanFactory.registerBeanDefinition("myInfo", b.getBeanDefinition());
     // defaultListableBeanFactory.registerSingleton("myInfo", new Information());
      Information info = defaultListableBeanFactory.getBean(Information.class);
      
      System.out.println(info);
      System.out.println("Type: "+defaultListableBeanFactory.getType("myInfo"));
	}
}
