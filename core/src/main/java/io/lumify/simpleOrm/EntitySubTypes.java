package io.lumify.simpleOrm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface EntitySubTypes {
    String discriminatorColumnFamily() default "";

    String discriminatorColumnName();

    Type[] types();

    public @interface Type {
        Class<?> value();

        String name() default "";
    }
}
