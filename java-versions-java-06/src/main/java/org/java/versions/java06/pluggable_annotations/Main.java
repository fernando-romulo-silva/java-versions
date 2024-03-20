package org.java.versions.java06.pluggable_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class Main {
    
    // This allowed developers to analyze and process Java annotations at compile-time.



    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    static @interface MyAnnotation {
        String value();
    }

    static class AnnotationProcessorExample {
	
        @MyAnnotation("Example Value")
        public void myMethod() {
            // Method implementation
        }
    }

}
