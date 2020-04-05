package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import it.polito.tdp.anagrammi.model.Parola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParolaDaAnagrammare;

    @FXML
    private Button btnCalcolaAnagrammi;

    @FXML
    private TextArea txtAnagrammiOK;

    @FXML
    private TextArea txtAnagrammiErrati;

    @FXML
    private Button btnReset;

    @FXML
    void calcolaAnagrammi(ActionEvent event) {
    	List<Parola> anagrammiOk;
    	List<Parola> anagrammiNonOk;
    	String parola=txtParolaDaAnagrammare.getText();
    	model.doAnagramma(parola);
    	anagrammiOk=model.getAnagrammiOk();
    	anagrammiNonOk=model.getAnagrammiNo();
    	for(Parola p:anagrammiOk) {
    		txtAnagrammiOK.appendText(p.toString()+"\n");
    	}
    	for(Parola p:anagrammiNonOk) {
    		txtAnagrammiErrati.appendText(p.toString()+"\n");
    	}
    	anagrammiOk.clear();
    	anagrammiNonOk.clear();
    }

    @FXML
    void reset(ActionEvent event) {
    	txtParolaDaAnagrammare.clear();
    	txtAnagrammiOK.clear();
    	txtAnagrammiErrati.clear();
    }

    @FXML
    void initialize() {
        assert txtParolaDaAnagrammare != null : "fx:id=\"txtParolaDaAnagrammare\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCalcolaAnagrammi != null : "fx:id=\"btnCalcolaAnagrammi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAnagrammiOK != null : "fx:id=\"txtAnagrammiOK\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAnagrammiErrati != null : "fx:id=\"txtAnagrammiErrati\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    
    public void setModel(Model model) {
    	this.model=model;
    }
}
