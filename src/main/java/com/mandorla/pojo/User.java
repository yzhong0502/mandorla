package com.mandorla.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "phoneNumber")
    private Integer phoneNumber;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(unique = true)
    private String email;


}
