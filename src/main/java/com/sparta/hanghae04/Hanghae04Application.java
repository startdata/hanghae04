package com.sparta.hanghae04;

import com.sparta.hanghae04.models.Contents;
import com.sparta.hanghae04.repository.ContentsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@EnableJpaAuditing
@SpringBootApplication
public class Hanghae04Application {

    public static void main(String[] args) {
        SpringApplication.run(Hanghae04Application.class, args);
    }

    @PostConstruct
    public void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }

    @Bean
    public CommandLineRunner demo(ContentsRepository repository) {
        return (args) -> {
            repository.save(new Contents("항해99", "선원1", "어푸어푸"));
        };
    }
}
