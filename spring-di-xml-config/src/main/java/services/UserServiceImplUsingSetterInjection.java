package services;

import repositories.UserRepo;

public class UserServiceImplUsingSetterInjection implements UserService {

    private UserRepo userRepo;


    public void addUser() {
        userRepo.create();
        System.out.println("UserServiceImplUsingSetterInjection adding user");
    }

    public void updateUser() {
        userRepo.update();
        System.out.println("UserServiceImplUsingSetterInjection updating user");
    }

    public void deleteUser() {
        userRepo.delete();
        System.out.println("UserServiceImplUsingSetterInjection deleting user");

    }

    public void setUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    
}
