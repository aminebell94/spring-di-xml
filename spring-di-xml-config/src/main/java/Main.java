import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import services.UserService;

public class Main {


    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/resources/beans.xml");

        UserService userServiceUsingConstructorInjection = ctx.getBean("userServiceImplUsingConstructorInjection", UserService.class);
        UserService userServiceUsingSetterInjection = ctx.getBean("userServiceImplUsingSetterInjection", UserService.class);

        userServiceUsingConstructorInjection.addUser();
        userServiceUsingConstructorInjection.updateUser();
        userServiceUsingConstructorInjection.deleteUser();

        userServiceUsingSetterInjection.addUser();
        userServiceUsingSetterInjection.updateUser();
        userServiceUsingSetterInjection.deleteUser();


    }
}
