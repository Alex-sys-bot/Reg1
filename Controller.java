package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;


public class Controller {
    Module module = new Module();

    @FXML
    private TextField textLogin;

    @FXML
    private PasswordField textPass;

    @FXML
    private Label showStatus;

    @FXML
    public void pressRegistr(ActionEvent event) throws IOException {
        module.reg(textLogin.getText(), textPass.getText());
        showStatus.setText("Вы зарегистрированы");
    }

    @FXML
    public void pressSignOut(ActionEvent event) throws IOException {
        module.sign(textLogin.getText(), textPass.getText());
        showStatus.setText("Вы авторизированы");
    }
}
