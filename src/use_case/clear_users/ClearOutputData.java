package use_case.clear_users;

// TODO Complete me

import entity.User;

import java.util.List;

public class ClearOutputData {

    private final List<User> users;
    public ClearOutputData(List<User> clearUsers) {
        this.users = clearUsers;
    }
    public List<User> getUsers() {
        return users;
    }
}
