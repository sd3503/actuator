package hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class TrafficController {

    @GetMapping("/cpu")
    public String cpu() {
        log.info("cpu log");
        long value = 0;

        for (int i = 0; i < 10000000000L; i++) {
            value++;
        }

        return "ok value" + value;
    }

    private List<String> list = new ArrayList<>();

    @GetMapping("/jvm")
    public String jvm() {
        log.info("cpu log");
        long value = 0;

        for (int i = 0; i < 1000000; i++) {
            list.add("helloJVM" + i);
        }

        return "ok value" + value;
    }
}
