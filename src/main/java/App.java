import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = 
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
    }
}

//    Спринг позволяет использовать различные типы бинов, одни будут жить от старта до завершения
//    программы, другие будут создаваться при каждом запросе или открытии новой сессии,
//    третьи при каждом вызове будут создаваться новые. За это отвечает аннотация @Scope.