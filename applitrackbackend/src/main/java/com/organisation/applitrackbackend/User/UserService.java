package com.organisation.applitrackbackend.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void signUp(@RequestBody User user)
    {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUserAccount(Long id_user) {
        boolean user_account_exists = userRepository.existsById(id_user);

        if(!user_account_exists)
        {
            throw new IllegalStateException("User ID " + id_user + " does not exist");
        }

        userRepository.deleteById(id_user);
    }
}
