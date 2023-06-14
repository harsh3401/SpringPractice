package live.harshjain;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
    private String qualifications;
    public void assist()
    {
        System.out.println("You are being treated");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualifications='" + qualifications + '\'' +
                '}';
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
    @PostConstruct
    public void postConstruct()
    {
        System.out.println("Post Construct method is called");
    }
    @Override
    public void setBeanName(String s) {
        System.out.println("Set bean name method is called");
    }
}
