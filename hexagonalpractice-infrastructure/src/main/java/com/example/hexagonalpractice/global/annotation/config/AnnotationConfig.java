package com.example.hexagonalpractice.global.annotation.config;

import com.example.hexagonalpractice.annotation.ReadOnlyUseCase;
import com.example.hexagonalpractice.annotation.UseCase;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.Filter;

@Configuration
@ComponentScan(
        basePackages = {"com.example.hexagonalpractice"},
        includeFilters = {
                @Filter(
                        type = FilterType.ANNOTATION,
                        value = UseCase.class
                ),
                @Filter(
                        type = FilterType.ANNOTATION,
                        value = ReadOnlyUseCase.class
                )
        }
)
public class AnnotationConfig {
}
