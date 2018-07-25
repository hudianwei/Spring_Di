import com.spring.di.User;
import com.spring.di.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class TestDemo {
    @Test
    public void getUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("springuser");
        System.out.println(user.username);
    }

    @Test
    public void getUserService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("sringuserservice");
        System.out.println(user.userservice.username);
    }
    @Test
    public void getUserList() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("userlist");
        System.out.println(user.usernamelist);
    }
    @Test
    public void getProps() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("pro");
        Properties prop=user.getProps();
        String url=prop.getProperty("url");
       System.out.println(url);
    }
}
