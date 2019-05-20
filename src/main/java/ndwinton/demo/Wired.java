package ndwinton.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Component
public class Wired {
    private final UUID uniqueCandidate;
    private final String explicitlyNamedBean;
    private final String methodNameBean;
    private final String byQualifierNotName;
    private final String byNameAsQualifier;
    private final String byMethodNameAsQualifier;
    private final List<String> allStrings;
    private final List<Object> bySharedQualifier;
    private final List<String> namedStringList;
    private final Exception bySharedQualifierAgain;
    private final String byFunkyName;
    private final Number numberByPrimary;
    private final File fileFromCondition;
    private final Environment springEnvironment;

    public Wired(
            UUID uniqueCandidateBean,
            String methodNameBean,
            String explicitlyNamedBean,
            @Qualifier("some-qualifier") String byQualifierNotName,
            @Qualifier("explicitlyNamedBean") String byNameAsQualifier,
            @Qualifier("methodNameBean") String byMethodNameAsQualifier,
            List<String> allStrings,
            @Qualifier("some-qualifier") List<Object> bySharedQualifier,
            @Qualifier("stringListBeanName") List<String> namedStringList,
            @Qualifier("some-qualifier") Exception bySharedQualifierAgain,
            @Qualifier("Bean with @FUNKY* name!") String byFunkyName,
            Number numberByPrimary,
            File fileFromCondition,
            Environment springEnvironment
    ) {
        this.uniqueCandidate = uniqueCandidateBean;
        this.methodNameBean = methodNameBean;
        this.explicitlyNamedBean = explicitlyNamedBean;
        this.byQualifierNotName = byQualifierNotName;
        this.byNameAsQualifier = byNameAsQualifier;
        this.allStrings = allStrings;
        this.bySharedQualifier = bySharedQualifier;
        this.bySharedQualifierAgain = bySharedQualifierAgain;
        this.namedStringList = namedStringList;
        this.byFunkyName = byFunkyName;
        this.byMethodNameAsQualifier = byMethodNameAsQualifier;
        this.numberByPrimary = numberByPrimary;
        this.fileFromCondition = fileFromCondition;
        this.springEnvironment = springEnvironment;

        System.out.println("=====================");
        System.out.println("uniqueCandidate = " + uniqueCandidate);
        System.out.println("explicitlyNamedBean = " + this.explicitlyNamedBean);
        System.out.println("methodNameBean = " + this.methodNameBean);
        System.out.println("byQualifierNotName = " + this.byQualifierNotName);
        System.out.println("byNameAsQualifier = " + this.byNameAsQualifier);
        System.out.println("byMethodNameAsQualifier = " + this.byMethodNameAsQualifier);
        System.out.println("allStrings = " + this.allStrings);
        System.out.println("bySharedQualifier = " + this.bySharedQualifier);
        System.out.println("bySharedQualifierAgain = " + this.bySharedQualifierAgain);
        System.out.println("namedStringList = " + this.namedStringList);
        System.out.println("byFunkyName = " + this.byFunkyName);
        System.out.println("numberByPrimary = " + this.numberByPrimary);
        System.out.println("fileFromCondition = " + this.fileFromCondition.toString());
        System.out.println("springEnvironment = " + this.springEnvironment.toString());
        System.out.println("=====================");
    }
}
