package sudoku;

import java.io.IOException;

import sudoku.buildlogic.SudokuBuildLogic;
import sudoku.userinterface.IUserInterfaceContract;
import sudoku.userinterface.UserInterfaceImpl;

public class SudokuApplication extends Application {
    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws IOException {
        uiImpl = new UserInterfaceImpl(primaryStage);

        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static void launch(String[] args) {
    }

}
