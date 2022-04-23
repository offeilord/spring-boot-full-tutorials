package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Scope(scopeName = "prototype")
@Component
public class Doctor implements Staff, BeanNameAware {

    private String qualification;

    public void assist() {
        System.out.println("Doctor is assisting");
    }


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set bean name method is called");
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println("Post construct method is called");
    }
}
