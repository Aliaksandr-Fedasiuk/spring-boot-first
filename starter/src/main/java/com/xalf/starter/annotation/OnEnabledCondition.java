package com.xalf.starter.annotation;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class OnEnabledCondition extends AllNestedConditions {

    public OnEnabledCondition() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @ConditionalOnProperty("myproperties.values")
    public static class R {}

    @ConditionalOnProperty(value = "myproperties.enabled", havingValue = "true")
    public static class С {}
}
