package com.nineleaps.learning.SpringConcepts.Events;

import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EmailService implements ApplicationEventPublisherAware {

    private List<String> blackListAddresses;
    private ApplicationEventPublisher publisher;

    public void setBlackList(List<String> blackList) {
        this.blackListAddresses = blackList;
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void sendEmail(String address, String content) {
        if (blackListAddresses.contains(address)) {
            publisher.publishEvent(new BlackListEvent(this, address, content));
            return;
        }
        System.out.println("Email Sent..!!");
    }
    
   
}
