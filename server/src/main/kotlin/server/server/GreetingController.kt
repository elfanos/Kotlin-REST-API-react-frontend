package server.server

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * Created by Rasmus on 07/01/18.
 */
@RestController
class GreetingController {

    val counter = AtomicLong()
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "Wawdd") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")

}