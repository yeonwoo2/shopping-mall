package com.example.maninstore.domain;

import com.example.maninstore.domain.enums.Authority;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String name;

    private String phone;

    @Enumerated(EnumType.STRING)
    private Authority auth; //USER, ADMIN

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime updateDate;

    public static User createUser(String username, String password, String name, String phone, Authority auth){
        User user = new User();
        user.username = username;
        user.password = password;
        user.name = name;
        user.phone = phone;
        user.auth = auth;
        return user;
    }

}
