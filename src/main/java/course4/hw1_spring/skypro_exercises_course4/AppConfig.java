package course4.hw1_spring.skypro_exercises_course4;

import course4.hw1_spring.skypro_exercises_course4.Model.Bus;
import course4.hw1_spring.skypro_exercises_course4.Model.Car;
import course4.hw1_spring.skypro_exercises_course4.Model.Driver;
import course4.hw1_spring.skypro_exercises_course4.Model.Pickup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Car getCarBean() {
        return new Car("Car");
    }

    @Bean
    public Bus getBusBean() {
        return new Bus("Bus");
    }

    @Bean
    public Pickup getPickupBean() {
        return new Pickup("Pickup");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("John1", getCarBean());
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("John2", getBusBean());
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("John3", getPickupBean());
    }
}
