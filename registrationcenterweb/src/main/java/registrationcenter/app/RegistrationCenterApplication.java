package registrationcenter.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Wangxy on 2018/1/31..
 *
 * @author wangxy
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistrationCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationCenterApplication.class, args);
    }
}
