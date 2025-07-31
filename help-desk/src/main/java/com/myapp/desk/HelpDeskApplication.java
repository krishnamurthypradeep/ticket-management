package com.myapp.desk;

import com.myapp.desk.domain.Agent;
import com.myapp.desk.domain.Ticket;
import com.myapp.desk.respository.AgentRepository;
import com.myapp.desk.respository.TicketRepository;
import com.myapp.desk.service.TicketService;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
// SpringBootConfiguration
// EnableAutoConfiguration
// ComponentScan (Start Scanning The Classes which are annotated with Component, Controller, RestController, Repository,Service
@SpringBootApplication
@EnableAdminServer
@EnableCaching
public class HelpDeskApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelpDeskApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(TicketRepository ticketRepository) {
//        return args -> {
//            ticketRepository.save(new Ticket("KeyBoard NotWorking", LocalDateTime.now(),null,null));
//            ticketRepository.findAll().forEach(System.out::println);
//        };
//    }

   // @Bean
    CommandLineRunner commandLineRunner(AgentRepository agentRepository) {
        return args -> {
         Agent agent =   agentRepository.save(new Agent("Agent1"));
            System.out.println(agent);
        };
    }

    //@Bean
    CommandLineRunner ticketService(TicketService ticketService) {
        return args -> {
            System.out.println(  ticketService.assignAgentToTicket(1L,2L));
        };
    }

}
// spring-data-jpa-starter
// DataSource (DB Connection pool)
// Transactional
// Hibernate Provider

// spring-boot-starter-web
// Tomcat
// JacksonJson (Objects to Json and Json back to objects)
// spring-data-cache-redis

// Declarative Approach
// Imperative
// Declarative
// Actuator
// Tracing (zipkin)
// springboot-starter-security

// Open API Swagger
// Zipkin for Tracing
// Spring bOot Admin Status
// Redis For Caching
// Security (KeyCloak Identity And Access management Tool)
// Actuator (Health and other stats)
// PostgreSql (This is replacing our Inmemory DB H2)
// Day 10 (Docker CI CD)

// Postgres
// Zipkin
// Redis
// KeyCloak (Identity and access management)