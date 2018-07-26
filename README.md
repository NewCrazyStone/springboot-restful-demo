# springboot-restful-demo
Spring Boot 构建一个Restful架构风格的web项目，springboot + mybatis 整合 jersey框架实现微服务架构

## 运行环境
    JDK8, spring boot 2.0.3， apache-maven-3.0.4， mysql数据库， redis服务

## 项目风格
    典型的springMVC 风格
    
## sql 文件
    在resources 文件下
    
## mysql 数据库中数据交互测试 ， 连接redis 数据库中数据交互测试

##添加了mybatis 分页插件 和 mybatis-generator插件，用于自动生成mapper接口，mapper映射文件，和表对应的实体类
 <!-- 分页插件 -->
    <dependency>
        <groupId>com.github.pagehelper</groupId>
        <artifactId>pagehelper-spring-boot-starter</artifactId>
        <version>1.2.3</version>
    </dependency>
    
    
 <!-- mybatis generator 自动生成代码插件 -->
    <plugin>
        <groupId>org.mybatis.generator</groupId>
        <artifactId>mybatis-generator-maven-plugin</artifactId>
        <version>1.3.5</version>
        <configuration>
            <configurationFile>${basedir}/src/main/resources/generator/generatorConfig.xml</configurationFile>
            <overwrite>true</overwrite>
            <verbose>true</verbose>
        </configuration>
    </plugin>
        