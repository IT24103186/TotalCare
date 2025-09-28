package com.group08.totalcare.Controller;

import com.group08.totalcare.Entity.User;
import com.group08.totalcare.Service.UserValidationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")

public class LoginController {
    private final UserValidationService validationService = new UserValidationService();

    // POST: /auth/login
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        if (validationService.validateEmail(email) && validationService.validatePassword(password)) {
            return "Login successful" ;
        } else {
            return "Invalid email or password";
        }
    }
}
