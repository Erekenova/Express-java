package prepereToMock.WhatBeOnCode.TryCatch2;

public class Main {
    static User create(){
        User user = new User("Alex");
        try{
            return user;
        }
        finally {
            user.name = "Bob";
            user = new User("Kate");
        }
    }

    static void main() {
        System.out.println(create().name);
    }
}
