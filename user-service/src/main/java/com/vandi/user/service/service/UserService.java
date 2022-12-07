/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vandi.user.service.service;

import com.vandi.user.service.dto.User;
import java.util.List;

/**
 *
 * @author Vandi
 */
public interface UserService {
    public List<User> getalluser();

    public User getUser(String id);

    public void addUser(User user);   

    public List<User> getAllUsers();

    public User updateUser(User user);

    public User deleteUser(String id);
   
}