package com.kaicom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @SpringBootApplication  来注释一个主程序，说明是一个springBoot应用
 */
@SpringBootApplication
/**
 @Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration  spring boot 的配置类 标注在某个类上，标识这是一个spring boot的配置类

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration


@EnableAutoConfiguration
@ComponentScan(excludeFilters = {
		@Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
public @interface SpringBootApplication {
 */
public class HelloWorldApplication {
	public static void main(String[] args) {
		//spring应用启动起来
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
