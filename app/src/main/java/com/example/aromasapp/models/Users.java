package com.example.aromasapp.models;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public String username;
    public String password;

    public static boolean passwordIsValis(String User, String Password){
        for (Users i:getUsers()){
            if (i.username.equals(User)&& i.password.equals(Password) ){
                return true;
            }
        }
        return false;
    }

    public static List<Users> getUsers(){
        List<Users> list = new ArrayList<Users>();
        Users o = new Users();
        o.username = "nory";
        o.password = "123456";
        list.add(o);

        Users t = new Users();
        t.username = "epifania";
        t.password = "1234567";
        list.add(t);

        Users n = new Users();
        n.username = "daisy";
        n.password = "12345678";
        list.add(n);
        return list;
    }
}