package com.example.maninstore.service;

import com.example.maninstore.domain.User;
import com.example.maninstore.domain.enums.Authority;
import com.example.maninstore.controller.dto.auth.JoinRequestDto;
import com.example.maninstore.handler.ex.CustomValidationException;
import com.example.maninstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public void Join(JoinRequestDto joinRequestDto){

        Optional<User> findUser = userRepository.findByUsername(joinRequestDto.getUsername());

        if(findUser.isEmpty()){
            String encodePassword = bCryptPasswordEncoder.encode(joinRequestDto.getPassword());
            User user = User.createUser(joinRequestDto.getUsername(),
                                        encodePassword,
                                        joinRequestDto.getName(),
                                        joinRequestDto.getPhone(),
                                        Enum.valueOf(Authority.class, joinRequestDto.getRole()));
            userRepository.save(user);
        }else{
            throw new CustomValidationException("사용중인 아이디 입니다.");
        }
    }
}
