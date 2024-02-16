package com.organisation.applitrackbackend.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/sign_up")
    public void signUp(@RequestBody User user)
    {
        userService.signUp(user);
    }

    @GetMapping("/all_users")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete_user/{user_id}")
    public void deleteUserAccount(@PathVariable("user_id") Long id_user)
    {
        userService.deleteUserAccount(id_user);
    }
}
