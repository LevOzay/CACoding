package interface_adapter.clear_users;

// TODO Complete me

import entity.User;
import interface_adapter.ViewManagerModel;
import interface_adapter.logged_in.LoggedInState;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.ArrayList;
import java.util.List;

public class ClearPresenter implements ClearOutputBoundary {

    private ViewManagerModel viewManagerModel;
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    public void present(ClearOutputData data) {
        List<User> users = data.getUsers();
        ClearState clearState = new ClearState();
        List<String> user_strings = new ArrayList<>();
        for (User user : users) {
            user_strings.add(user.getName());
        }
        clearState.setUsers(user_strings);
        clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }
}
