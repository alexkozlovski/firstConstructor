package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons202_JMX_NOTIFICATION_NA_GIT;

import javax.management.*;
import java.lang.management.ManagementFactory;

/**
 * Created by user on 23.09.2018.
 */
public class Main {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {
        MBeanServer server= ManagementFactory.getPlatformMBeanServer();
        ObjectName name=new ObjectName("Lessons201_JMX_on_the_Server_side_NA_GIT:type=Hello");
        Hello mbean=new Hello();
        server.registerMBean(mbean,name);


        System.out.println("waiting so long2...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
