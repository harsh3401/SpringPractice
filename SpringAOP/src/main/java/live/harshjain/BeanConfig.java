package live.harshjain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "live.harshjain")
@EnableAspectJAutoProxy
public class BeanConfig {
}
