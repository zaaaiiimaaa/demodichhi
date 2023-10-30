package com.example.demo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class HelloController {
    @FXML
    private Button ForgetButton;
    @FXML
    private TextField FullnameField;
    @FXML
    private TextField Emailfield;
    @FXML
    private TextField UsernameField;
    @FXML
    private TextField NumberField;
    @FXML
    private TextField PasswordField;
    @FXML
    private TextField RepeatField;

    @FXML
    private  void handleSignUpButtonAction()
    {
        String Full=FullnameField.getText();
        String email=Emailfield.getText();
        String user=UsernameField.getText();
        String number=NumberField.getText();
        String pass=PasswordField.getText();
        String repeat=RepeatField.getText();

        try(BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\Desktop\\PLANTPAL\\USER.txt",true)))
        {
            String userdata=Full + "," + email +","+ user +","+number+","+pass+","+repeat;
            writer.write(userdata);
            writer.newLine();
            writer.flush();


        }
        catch(IOException e){
            e.printStackTrace();
    }

    }
    @FXML
    private Label myusername;
    @FXML
    private Textfield mytextfield;
    @FXML
    private Label mypassword;

   private Stage stage;

  private Scene scene;

  private Parent root;

  public void switchtoScene1(ActionEvent event) throws IOException
  {
     Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
      stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
      scene=new Scene(root);
      stage.setScene(scene);
      stage.show();
  }
    public void switchtoScene2(ActionEvent event) throws IOException
    {
       Parent  root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchtomyaccount(ActionEvent event) throws IOException
    {
        Parent  root = FXMLLoader.load(getClass().getResource("myaccount.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchtoforgetpassword(ActionEvent event) throws IOException
    {
        Parent  root = FXMLLoader.load(getClass().getResource("forget-password.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}