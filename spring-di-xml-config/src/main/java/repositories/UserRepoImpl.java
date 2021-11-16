package repositories;

public class UserRepoImpl implements UserRepo {

    public UserRepoImpl() {
    }

    @Override
    public void create() {
        System.out.println("UserRepoImpl create");
    }

    @Override
    public void update() {
        System.out.println("UserRepoImpl update");

    }

    @Override
    public void delete() {
        System.out.println("UserRepoImpl delete");

    }
}
