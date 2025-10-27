package controller;



import org.example.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    @Test
    void helloReturnsExpectedMessage() {
        HelloController controller = new HelloController();
        String resp = controller.hello();
        assertThat(resp).isEqualTo("Hello from Spring Boot!");
    }
}

