package fr.oga.mscandidatemanager;

import fr.oga.mscandidatemanager.entities.Candidate;
import fr.oga.mscandidatemanager.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class MsCandidateManagerApplication {
    @Autowired
    private CandidateRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(MsCandidateManagerApplication.class, args);
    }

    @Bean
    ApplicationRunner init(){
        return (args -> {
            List<Candidate> c = Arrays.asList(new Candidate(0,"amine","riahi","amine@gmail.com"),
                    new Candidate(0, "ayed", "hchich", "ayedhchich@gmail.com"),
                    new Candidate(0, "safwane", "soker", "saf@gmail.com"),
                    new Candidate(0, "baha", "rahmouni", "boh@gmail.com"));
            repository.saveAll(c);

        });
    }
}
