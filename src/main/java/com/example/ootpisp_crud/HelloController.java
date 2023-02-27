package com.example.ootpisp_crud;

import entities.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private PieChart pie_Chart;
    @FXML
    private Button close;
    @FXML
    private AnchorPane analyse_Panel;
    @FXML
    private Button add_Submit_Button;
    @FXML
    private Button edit_Submit_Button;
    @FXML
    private Label position_Label;
    @FXML
    private TableView<Person> person_Table;
    @FXML
    private TableColumn<Person, Integer> id_Table;
    @FXML
    private TableColumn<Person, String> person_Name;
    @FXML
    private TableColumn<Person, String> person_Surname;
    @FXML
    private TableColumn<Person, String> position_Table;
    @FXML
    private AnchorPane controls_Panel;
    @FXML
    private AnchorPane add_Manager_Panel;
    @FXML
    private AnchorPane add_Student_Panel;
    @FXML
    private AnchorPane add_Designer_Panel;
    @FXML
    private AnchorPane add_Programmer_Panel;
    @FXML
    private AnchorPane add_Tester_Panel;
    @FXML
    private TextField person_Date_TextField,
            person_Year_TextField,
            person_Name_TextField,
            person_Surname_TextField,
            person_Email_TextField,
            person_House_TextField,
            person_City_TextField,
            person_Street_TextField,
            manager_Salary_TextField,
            manager_Experience_TextField,
            manager_bonus_TextField,
            student_University_TextField,
            student_Faculty_TextField,
            student_Specialisation_TextField,
            student_Course_TextField,
            student_Group_TextField,
            programmer_Salary_TextField,
            programmer_Experience_TextField,
            designer_Salary_TextField,
            designer_Experience_TextField,
            tester_Salary_TextField,
            tester_Experience_TextField;
    @FXML
    private ComboBox person_Month_ComboBox;
    @FXML
    private ComboBox person_Sex_ComboBox;
    @FXML
    private ComboBox person_Position_List_ComboBox;
    @FXML
    private ComboBox manager_Education_ComboBox;
    @FXML
    private ComboBox programmer_Education_ComboBox;
    @FXML
    private ComboBox programmer_Category_ComboBox;
    @FXML
    private ComboBox programmer_Skills_ComboBox;
    @FXML
    private ComboBox designer_Education_ComboBox;
    @FXML
    private ComboBox designer_Skills_ComboBox;
    @FXML
    private ComboBox designer_Type_ComboBox;
    @FXML
    private ComboBox tester_Education_ComboBox;
    @FXML
    private ComboBox tester_Type_ComboBox;


    public void view_Add_Panel_Method() {
    }

    public void view_Delete_Panel_Method() {
    }

    public void view_Edit_Panel_Method() {
    }

    public void Submit_Person_Adding_Method() {
    }

    public void Submit_Person_Editing_Method() {
    }

    public void Choose_Add_Person_Position_Panel() {
    }

    public void on_Click_View_Analyze_Panel_Method() {
    }

    public void close_Analyze_Panel_Method() {
    }
}