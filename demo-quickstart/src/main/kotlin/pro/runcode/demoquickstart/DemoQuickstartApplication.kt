package pro.runcode.demoquickstart

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class DemoQuickstartApplication {
    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello $name"
    }
}

fun main(args: Array<String>) {
    runApplication<DemoQuickstartApplication>(*args)
}
