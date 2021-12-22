package net.valmarfina.springsecurityapp.service;
import net.valmarfina.springsecurityapp.model.User;

public interface UserService {
  void save(User user);
  User findByUsername(String username);
}