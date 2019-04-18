package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons203_JMX_ON_THE_CLIENT_SIDE_nesdelal;

import SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons202_JMX_NOTIFICATION_NA_GIT.HelloMBean;

import javax.management.JMX;
import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;

/**
 * Created by user on 23.09.2018.
 */
public class Client {
    public static void main(String[] args) throws IOException, MalformedObjectNameException {
        JMXServiceURL url=new JMXServiceURL("service:jmx:rmi:///jndi/rmi://:9999/jmxrmi");
        JMXConnector jmxc= JMXConnectorFactory.connect(url,null);
        MBeanServerConnection mbsc=jmxc.getMBeanServerConnection();


        ObjectName mbeanName=new ObjectName("Lessons201_JMX_on_the_Server_side_NA_GIT:type=Hello");
        HelloMBean mbeanProxy= JMX.newMBeanProxy(mbsc,mbeanName,HelloMBean.class,true);

        mbeanProxy.sayHello();

        jmxc.close();
    }
}
