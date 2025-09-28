package com.group08.totalcare.Controller;

import com.group08.totalcare.Entity.User;
import com.group08.totalcare.Service.UserValidationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")

public class RegisterController {

    private final UserValidationService validationService = new UserValidationService();

    // POST: /auth/register
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        if (validationService.validateRegistration(user, user.getPassword())) {
            return "Registration successful";
        } else {
            return "Registration failed";
        }
    }
}
