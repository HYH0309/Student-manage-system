package com.example.hyh.service.login;


import com.example.hyh.entity.login.Login;
import com.example.hyh.entity.Result;
import com.example.hyh.entity.login.Stu;

public interface StuService {
    Stu findByUser(String uname);
    void register(String uname, String pwd);
    boolean existsByUsername(String uname);
    boolean verifyUserPassword(String rawPassword, String encodedPassword);
    Result login(Login login);
}
