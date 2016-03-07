package com.javaseig.mod2.task67;

import java.lang.annotation.*;

/**
 * Created by igor on 08.03.16.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInformation {
    String name();
    String date();
    String comments();
}
