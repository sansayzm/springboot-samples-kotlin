package pro.runcode.demorestfulwebservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoRestfulWebServiceApplication

fun main(args: Array<String>) {
    runApplication<DemoRestfulWebServiceApplication>(*args)
}
