package com.rooting.best.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.Locale;

@Component
public class Messages {
    @Autowired
    private MessageSource messageSource;
    private MessageSourceAccessor accessor;

    @PostConstruct
    private void init() {
        accessor = new MessageSourceAccessor(messageSource);
    }
    public String get(String code) {
        return accessor.getMessage(code,Locale.KOREAN);
    }
    public String get(String code,String args[]) {
        return accessor.getMessage(code,args,Locale.KOREAN);
    }
}