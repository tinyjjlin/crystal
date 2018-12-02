package com.tiny.crystal.validator;

/**
 * @author tiny lin
 * @date 2018/12/2
 */

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

// 指定真正实现校验规则的类
@Constraint(validatedBy = PhoneValidationValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PhoneValidation {
    String message() default "不是正确的手机号码";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    @Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER })
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        PhoneValidation[] value();
    }
}
