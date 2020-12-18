package com.xalf.starter.annotation;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional({OnEnabledCondition.class})
public @interface ConditionalOnEnabled {
}
