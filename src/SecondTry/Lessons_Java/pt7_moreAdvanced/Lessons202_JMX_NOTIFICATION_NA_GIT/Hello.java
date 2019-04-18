package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons202_JMX_NOTIFICATION_NA_GIT;

import javax.management.AttributeChangeNotification;
import javax.management.MBeanNotificationInfo;
import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

/**
 * Created by user on 23.09.2018.
 */
public class Hello extends NotificationBroadcasterSupport implements HelloMBean {
    private String name;
    static int sequenceNumber=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {

        System.out.println("hello from jmx");
        Notification notification=new AttributeChangeNotification(this,sequenceNumber++,System.currentTimeMillis(),"Cache size changed",
                "sequenceNumber","int",sequenceNumber-1,sequenceNumber);
        sendNotification(notification);
    }

    @Override
    public int addIntegers(int a, int b) {
        return a+b;
    }

    @Override
    public Person returnPerson() {
        return null;
    }

    @Override
    public MBeanNotificationInfo[] getNotificationInfo(){
        String[] types=new String[]{
                AttributeChangeNotification.ATTRIBUTE_CHANGE
        };

                String name= AttributeChangeNotification.class.getName();
                String description="an attribute if this MBEAN changed";
                MBeanNotificationInfo info=new MBeanNotificationInfo(types,name,description);
                return new MBeanNotificationInfo[]{info};
        }
    }


