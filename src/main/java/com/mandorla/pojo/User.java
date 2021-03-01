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
    @Column(length = 15,name = "phoneNumber")
    private Integer phoneNumber;
    @Column(length = 50,name = "username")
    private String username;
    @Column(length = 20,name = "password")
    private String password;
    @Column(length = 50,unique = true)
    private String email;


}
