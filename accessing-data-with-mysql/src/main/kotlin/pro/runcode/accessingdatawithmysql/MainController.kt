package pro.runcode.accessingdatawithmysql

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody


@Controller
@RequestMapping(path = ["/demo"])
class MainController {
    @Autowired
    private lateinit var userRepository: UserRepository

    @PostMapping(path = ["/add"])
    @ResponseBody
    fun addNewUser(
        @RequestParam name: String, @RequestParam email: String
    ): String? {
        val user = User(name = name, email = email)
        userRepository.save(user)
        return "Saved"
    }
}