package com.example.my_springboot_learn.mapper;


import com.example.my_springboot_learn.model.User;

import java.util.List;

public interface UserMapper extends BaseMapper{


    List<User> selectAllUser() throws Exception;

}
