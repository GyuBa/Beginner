package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.BcryptService;
import service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private BcryptService bcryptService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String root() throws JsonProcessingException {
        System.out.println("루트");
        System.out.println(new ObjectMapper().writeValueAsString(userService.getUserList()));
        return "Success!!!!!";
    }

    @RequestMapping(value = "/pwd", method = RequestMethod.GET)
    @ResponseBody
    public String test() throws JsonProcessingException {
        System.out.println("Bcrypt 실행됨");
        System.out.println(new ObjectMapper().writeValueAsString(userService.getUserList()));
        String hash_cod = bcryptService.hashing("asdf");
        return hash_cod + '\n' + bcryptService.decode("asdf", hash_cod);
    }
}
