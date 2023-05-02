package course4.hw1_spring.skypro_exercises_course4;

import course4.hw1_spring.skypro_exercises_course4.Model.Driver;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SkyProExercisesCourse4Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver1 = context.getBean("driver1", Driver.class);
        Driver driver2 = context.getBean("driver2", Driver.class);
        Driver driver3 = context.getBean("driver3", Driver.class);
        driver1.printState();
        driver2.printState();
        driver3.printState();

        context.close();
    }
}
