package services;

import repositories.UserRepo;


public class UserServiceImplUsingConstructorInjection implements UserService {

    private UserRepo userRepo;

    public UserServiceImplUsingConstructorInjection(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void addUser() {
        userRepo.create();
        System.out.println("UserServiceImplUsingConstructorInjection adding user");

    }

    public void updateUser() {
        userRepo.update();
        System.out.println("UserServiceImplUsingConstructorInjection updating user");
    }

    public void deleteUser() {
        userRepo.delete();
        System.out.println("UserServiceImplUsingConstructorInjection deleting user");

    }
}
