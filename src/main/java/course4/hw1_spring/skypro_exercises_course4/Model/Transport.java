package course4.hw1_spring.skypro_exercises_course4.Model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public abstract class Transport {
    private final String model;

    public Transport(String model) {
        this.model = model;
    }

    public String getState() {
        return model + " is ready";
    }

    @PostConstruct
    private void init() {
        System.out.println("Transport is created");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Transport is destroyed");
    }
}
