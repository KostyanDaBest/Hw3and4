package entity;


import repository.FileRepository;

import java.util.Objects;

public class User {
    long id;
    String name;
    String surname;
    String login;
    String password;


    public User(long l, String name, String surname, String login, String password) {
        this.id = id;
        this.name = this.name;
        this.surname = this.surname;
        this.login = this.login;
        this.password = this.password;
    }

    public long getId() {

        return id;

    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String isLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String isPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, login, password);
    }


}


