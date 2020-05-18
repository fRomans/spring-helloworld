import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean11 = (HelloWorld) applicationContext.getBean("helloworld");

        boolean equ =  bean1 == bean11;

        System.out.println(bean1.getMessage());
        System.out.println(bean11.getMessage());
        System.out.println(equ);

        Cat bean2 = (Cat) applicationContext.getBean("cat");
        Cat bean22 = (Cat) applicationContext.getBean("cat");

        boolean equ2 =  bean2 == bean22;

        System.out.println(bean2.getMessage());
        System.out.println(bean22.getMessage());
        System.out.println(equ2);

    }
}

//    Спринг позволяет использовать различные типы бинов, одни будут жить от старта до завершения
//    программы, другие будут создаваться при каждом запросе или открытии новой сессии,
//    третьи при каждом вызове будут создаваться новые. За это отвечает аннотация @Scope.