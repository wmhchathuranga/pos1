package com.example.posui1;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private Text date_text;
    @FXML
    private Text time_text;
    @FXML
    private ScrollPane content;
    @FXML
    private Button btn_sales;
    @FXML
    private Button btn_customer;
    @FXML
    private Button btn_cashier;
    @FXML
    private Button btn_products;
    @FXML
    private Button btn_invoice;
    @FXML
    private Button btn_reports;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Timeline timeline = new Timeline(

                new KeyFrame(Duration.seconds(1), event -> {
                    date_text.setText("Date : "+ java.time.LocalDate.now());
                    time_text.setText("Time : "+ java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
                })
        );
        try {
            salesPanel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    @FXML
    private void salesPanel() throws IOException {
        btn_sales.setDisable(true);
        btn_customer.setDisable(false);
        btn_cashier.setDisable(false);
        btn_products.setDisable(false);
        btn_invoice.setDisable(false);
        btn_reports.setDisable(false);
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Sales.fxml")));
        content.setContent(anchorPane);

    }

    @FXML
    private void customerPanel() throws IOException {
        btn_sales.setDisable(false);
        btn_customer.setDisable(true);
        btn_cashier.setDisable(false);
        btn_products.setDisable(false);
        btn_invoice.setDisable(false);
        btn_reports.setDisable(false);
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Customer.fxml")));
        content.setContent(anchorPane);

    }

    @FXML
    private void cashierPanel() throws IOException {
        btn_sales.setDisable(false);
        btn_customer.setDisable(false);
        btn_cashier.setDisable(true);
        btn_products.setDisable(false);
        btn_invoice.setDisable(false);
        btn_reports.setDisable(false);
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Cashier.fxml")));
        content.setContent(anchorPane);

    }

    @FXML
    private void productsPanel() throws IOException {
        btn_sales.setDisable(false);
        btn_customer.setDisable(false);
        btn_cashier.setDisable(false);
        btn_products.setDisable(true);
        btn_invoice.setDisable(false);
        btn_reports.setDisable(false);
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Products.fxml")));
        content.setContent(anchorPane);

    }
    @FXML
    private void invoicePanel() throws IOException {
        btn_sales.setDisable(false);
        btn_customer.setDisable(false);
        btn_cashier.setDisable(false);
        btn_products.setDisable(false);
        btn_invoice.setDisable(true);
        btn_reports.setDisable(false);
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Invoices.fxml")));
        content.setContent(anchorPane);

    }
    @FXML
    private void reportsPanel() throws IOException {
        btn_sales.setDisable(false);
        btn_customer.setDisable(false);
        btn_cashier.setDisable(false);
        btn_products.setDisable(false);
        btn_invoice.setDisable(false);
        btn_reports.setDisable(true);
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Reports.fxml")));
        content.setContent(anchorPane);

    }


}