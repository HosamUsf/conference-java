import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

   /* @Bean(name = "speakerService")
    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service= new SpeakerServiceImpl();

//      SpeakerServiceImpl service =
//              new SpeakerServiceImpl(getSpeakerRepository());

      //      service.setRepository(getSpeakerRepository());
      return service;
    }



    @Bean(name ="speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

    */


}


