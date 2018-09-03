package org.ml.accountcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;



/**
 * {@link EnableAsync }异步
 * 在需要异步执行方法上添加@Async注解
 *
 * @author RLY
 */
@EnableAsync
@SpringBootApplication
public class AccountCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountCenterApplication.class, args);
    }
}
