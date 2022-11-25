package pro.runcode.democonsumingrest

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class DemoConsumingRestApplication {
    companion object {
        private val log = LoggerFactory.getLogger(DemoConsumingRestApplication.javaClass)
    }

    @Bean
    fun restTemplate(builder: RestTemplateBuilder): RestTemplate = builder.build()

    @Bean
    fun run(restTemplate: RestTemplate): CommandLineRunner {
        return CommandLineRunner {
            val quote: Quote? = restTemplate.getForObject("http://localhost:8080/api/random", Quote::class.java)
            log.info(quote.toString())
        }
    }
}

fun main(args: Array<String>) {
    runApplication<DemoConsumingRestApplication>(*args)
}
