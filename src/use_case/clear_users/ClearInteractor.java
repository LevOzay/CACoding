package use_case.clear_users;
import java.util.List;
import entity.User;

public class ClearInteractor implements ClearInputBoundary {

        final ClearUserDataAccessInterface clearDataAccessObject;

        final ClearOutputBoundary clearOutputBoundary;

        public ClearInteractor(ClearUserDataAccessInterface clearDataAccessObject, ClearOutputBoundary clearOutputBoundary) {
            this.clearDataAccessObject = clearDataAccessObject;
            this.clearOutputBoundary = clearOutputBoundary;
        }

        @Override
        public void execute() {
            List<User> users = clearDataAccessObject.clearUsers();
            ClearOutputData clearOutputData = new ClearOutputData(users);
            clearOutputBoundary.present(clearOutputData);
        }
}
