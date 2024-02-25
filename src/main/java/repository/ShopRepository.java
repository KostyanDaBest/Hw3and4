package repository;

import entity.User;

import java.util.Collection;

public interface ShopRepository {

        public void add(User user);
        public void deleteUserById(long userId);
        public Collection<User> allUsers();

    }

