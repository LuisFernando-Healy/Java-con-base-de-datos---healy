package com.luisfer.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class StudenController implements Initializable {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null

    @FXML
    private TextField TCourse;

    @FXML
    private TableView<Student> Table;
    @Override
    public void initialize(URL location, ResourceBundle resources) {




    }

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnSAVe;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField tFirstName;

    @FXML
    private TextField tLastName;




    public void CreateStudents(ActionEvent event) {
    }

    public void UpdateStudents(ActionEvent event) {
    }

    public void DeleteStudents(ActionEvent event) {
    }

    public void ClearStudents(ActionEvent event) {
    }


}