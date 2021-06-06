package Final;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
public class Controller implements Initializable {
    @FXML
    public TextArea lview;
    @FXML
    public TextField bill_view;
    FinalBillIterator yess = new FinalBillIterator();
    public ArrayList<Coffee> details = new ArrayList<Coffee>();
    @FXML
    Button honey_btn;
    @FXML
    Button instant_btn;
    @FXML
    Button filter_btn;
    @FXML
    Button whipcream_btn;
    @FXML
    Button milk_btn;
    @FXML
    Button next_btn;
    @FXML
    Button bill_btn;
    Coffee test;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lview.setEditable(false);
        bill_view.setEditable(false);
        instant_btn.setOnAction(event -> test = new Cocoa());
        honey_btn.setOnAction(event -> {
            test = new Honey(test);
        });

        filter_btn.setOnAction(event -> test = new BlackCoffee());

        whipcream_btn.setOnAction(event -> test = new WhipCream(test));

        milk_btn.setOnAction(event -> test = new Milk(test));

        next_btn.setOnAction(event -> {

            details.add(test);
            yess.finalOrder.FinalBill.add(test);

            ArrayList<Coffee> dummy = new ArrayList<Coffee>();
            dummy.add(test);

            for (Coffee sample : dummy) {

                lview.appendText("\n" + sample.getDescription() + "  " + sample.cost());
            }

        });
        bill_btn.setOnAction(event -> bill_view.setText(yess.next().toString() ) );

    }

}








