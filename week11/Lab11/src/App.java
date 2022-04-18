import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application{

    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();

    private Button btCalculate = new Button("Calculate");
    private Button btClear = new Button("Clear");
    private Button btSave = new Button("Save");
    private Button btLoad = new Button("Load");
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
        gridPane.add(tfAnnualInterestRate, 3, 0);
        gridPane.add(new Label("Number of Years:"), 0, 1);
        gridPane.add(tfNumberOfYears, 3, 1);
        gridPane.add(new Label("Loan Amount:"), 0, 2);
        gridPane.add(tfLoanAmount, 3, 2);
        gridPane.add(new Label("Monthly Payment:"), 0, 3);
        gridPane.add(tfMonthlyPayment, 3, 3);
        gridPane.add(new Label("Total Payment:"), 0, 4);
        gridPane.add(tfTotalPayment, 3, 4);
        gridPane.add(btCalculate, 3, 5);
        gridPane.add(btSave, 0, 5);
        gridPane.add(btLoad, 1, 5);
        gridPane.add(btClear, 2, 5);

        gridPane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);
        GridPane.setHalignment(btSave, HPos.RIGHT);  
        GridPane.setHalignment(btLoad, HPos.LEFT);
        GridPane.setHalignment(btClear, HPos.LEFT);

        btCalculate.setOnAction(e -> calculateLoanPayment());
        btClear.setOnAction(e -> clearTextField());
        btSave.setOnAction(e -> {
            try {
                saveData();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        btLoad.setOnAction(e -> {
            try {
                loadData();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("LoanCalculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void calculateLoanPayment() {
        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        loan loan = new loan(interest, year, loanAmount);

        tfMonthlyPayment.setText(String.format("$%.2f",loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f",loan.getTotalPayment()));
    }

    private void clearTextField() {
        tfAnnualInterestRate.setText("");
        tfNumberOfYears.setText("");
        tfLoanAmount.setText("");
        tfMonthlyPayment.setText("");
        tfTotalPayment.setText("");
    }

    private void saveData() throws IOException{
        try(DataOutputStream output = new DataOutputStream(new FileOutputStream("src\\loan.dat"));){
            output.writeUTF(tfAnnualInterestRate.getText());
            output.writeUTF(tfNumberOfYears.getText());
            output.writeUTF(tfLoanAmount.getText());
            output.writeUTF(tfMonthlyPayment.getText());
            output.writeUTF(tfTotalPayment.getText());
        }
    }

    private void loadData() throws IOException{
        try(DataInputStream input = new DataInputStream(new FileInputStream("src\\loan.dat"));){
            tfAnnualInterestRate.setText(input.readUTF());
            tfNumberOfYears.setText(input.readUTF());
            tfLoanAmount.setText(input.readUTF());
            tfMonthlyPayment.setText(input.readUTF());
            tfTotalPayment.setText(input.readUTF());
        }
    }
}