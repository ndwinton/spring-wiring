package ndwinton.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Configuration
public class WiredConfig {

    @Bean
    public UUID iAmTheOneAndOnlyUuidBean() {
        return UUID.randomUUID();
    }

    @Bean
    public String methodNameBean() {
        return "Matched by method name";
    }

    @Bean(name = "explicitlyNamedBean")
    public String beanWithExplicitName() {
        return "Matched by explicit name";
    }

    @Bean(name = "Bean with @FUNKY* name!")
    public String beanWithFunkyName() {
        return "Matched by funky name";
    }

    @Bean
    @Qualifier("some-qualifier")
    public String qualifiedString() {
        return "String matched by qualifier";
    }

    @Bean("stringListBeanName")
    @Qualifier("some-qualifier")
    public List<String> listOfStrings() {
        return Arrays.asList("List of strings with qualifier");
    }

    @Bean
    @Qualifier("some-qualifier")
    public Exception qualifiedException() {
        return new Exception("Exception matched by qualifier");
    }

    @Bean
    public StringBuilder unqualifiedStringBuilder() {
        return new StringBuilder().append("StringBuilder without qualifier");
    }

    @Bean
    @Primary
    public Integer integerValue() {
        return 42;
    }

    @Bean
    public Long longValue() {
        return 123L;
    }

    @Bean
    @ConditionalOnProperty(name = "choose.this.one", havingValue = "true")
    public File byPropertyTrue() {
        return new File("matched-by-property-true.txt");
    }

    @Bean
    @ConditionalOnProperty(name = "choose.this.one", matchIfMissing = true)
    public File byPropertyOtherwise() {
        return new File("matched-by-property-otherwise.txt");
    }
}
