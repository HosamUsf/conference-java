
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);


//        SpeakerService service = new SpeakerServiceImpl();


//        SpeakerService service =
//                appContext.getBean("speakerService", SpeakerService.class);
//
//        SpeakerService service2 =
//                appContext.getBean("speakerService", SpeakerService.class);
//
//        System.out.println(service);
//
//
//        System.out.println(service.findAll().get(0).getFirstName());
//
//        System.out.println(service2);
        Arrays.stream(appContext.getBeanDefinitionNames()).toList().forEach(System.out::println);
    }

}
