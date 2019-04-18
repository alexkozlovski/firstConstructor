package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons219_Annotations;


import java.beans.Transient;
import java.lang.annotation.*;

/**
 * Created by user on 27.09.2018.
 */
public class Main {
    public static void main(String[] args) {

    }
    @Deprecated
    class  myClass{
        @myAnn(j=2,i=5,run=false)

        @javax.persistence.Transient
        int i;
         myClass() {

        }
        @Transient
        public void method(@Deprecated int i){

        }
    }class classik extends myClass{

    }
}

@Inherited//если аннотация помечена этой аннотаций -> класс помечен создаваемой аннотацией,
// то классы наследники будут помечены этой аннотацией
@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.ANNOTATION_TYPE.FIELD,ElementType.LOCAL_VARIABLE})
@interface myAnn{
    int i()default 1;
    boolean run() default true;
    int j();

}
@interface bugReport{
    enum Status{UNCONFIRMED,CONFIRMED,FIXED,NOTABUG}
    boolean showStopper();
    String assignedTo()default "none";
    String assignedTo2()default "";

    int i()default 2;
    Class<?> testClass() default Void.class;
    bugReport.Status status()default bugReport.Status.NOTABUG;
    //Reference ref()default @Reference();
    String reportedBy() default "none";
}