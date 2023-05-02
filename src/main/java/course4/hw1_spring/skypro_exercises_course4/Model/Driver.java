package course4.hw1_spring.skypro_exercises_course4.Model;

import lombok.Getter;

@Getter
public class Driver {
    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void printState() {
        System.out.println(name + " ," + transport.getState());
    }
}
