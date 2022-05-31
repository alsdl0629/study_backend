package com.example.mini;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public void createUser(UserDto dto) {
        userRepository.save(User.builder()
                .id(dto.getId())
                .password(dto.getPassword())
                .build());

        userRepository.save(new User(dto.getId(), dto.getPassword()
        ));
    }

}
