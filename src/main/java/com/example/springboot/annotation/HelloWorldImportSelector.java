package com.example.springboot.annotation;

import com.example.springboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2019/7/6 22:54
 * description:
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] { HelloWorldConfiguration.class.getName()} ;
    }
}
