import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   //так Спринг понимает, что это настроечный класс.
public class AppConfig {
 
    @Bean(name="helloworld") //содержится метод, помеченный аннотацией как бин, этот метод будет выполнен
    // при запуске и его результат станет объектом, управляемым Спрингом.
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
}