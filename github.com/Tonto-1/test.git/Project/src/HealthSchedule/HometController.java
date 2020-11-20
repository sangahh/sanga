package HealthSchedule;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import javafx.stage.Stage;

public class HometController implements Initializable{

	@FXML private Button fullBody; //���ſ ��ư
	@FXML private Button upperBody; //��ü� ��ư
	@FXML private Button abs; //���ο ��ư
	@FXML private Button lowerBody; //��ü� ��ư
	@FXML private Button home; //Ȩ ��ư
	@FXML private Button food; //�Ĵ� ��ư
	@FXML private Button body; //�� �� ��ư
	@FXML private Button homet; //ȨƮ ��ư
	
	@FXML private ImageView human; //��ü����
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//fullBody.setOnAction(e->btnfullBody(e));
		home.setOnAction(e->btnhome(e)); 
		food.setOnAction(e->btnfood(e));
		body.setOnAction(e->btnbody(e));
		homet.setOnAction(e->btnhomet(e));
		
		fullBody.setOnAction(e->btnfullBody(e)); 
		upperBody.setOnAction(e->btnhomet(e));
		abs.setOnAction(e->btnhomet(e));
		lowerBody.setOnAction(e->btnhomet(e));
	}
	
	//ü������ �̵�
	 public void btnbody(ActionEvent event) {
		   try {
		     Parent healthChart = FXMLLoader.load(getClass().getResource("chart.fxml"));
		     Scene scene = new Scene(healthChart);
		     Stage primaryStage= (Stage)body.getScene().getWindow();
		     primaryStage.setScene(scene);
		  } catch (Exception e) {}
	   }
	
	//ȨƮ�� �̵�
	private void btnhomet(ActionEvent e) {
		try {
		     Parent healthChart = FXMLLoader.load(getClass().getResource("homet.fxml"));
		     Scene scene = new Scene(healthChart);
		     Stage primaryStage= (Stage)homet.getScene().getWindow();
		     primaryStage.setScene(scene);
		  } catch (Exception e2) {}
	}
	
	//�Ĵ����� �̵�
	private void btnfood(ActionEvent e) {
		
			try {
			     Parent healthChart = FXMLLoader.load(getClass().getResource("food.fxml"));
			     Scene scene = new Scene(healthChart);
			     Stage primaryStage= (Stage)homet.getScene().getWindow();
			     primaryStage.setScene(scene);
			  } catch (Exception e2) {}
		}
	
	
	//Ȩ���� �̵�
	private void btnhome(ActionEvent e) {
		 try {
		     Parent Home = FXMLLoader.load(getClass().getResource("maintest.fxml"));
		     Scene scene = new Scene(Home);
		     Stage primaryStage= (Stage)home.getScene().getWindow();
		     primaryStage.setScene(scene);
		  } catch (Exception e2) {}
	   }	
	

	//���ſ �������� �Ѿ
	public void btnfullBody(ActionEvent e) {
		try {
			Parent part = FXMLLoader.load(getClass().getResource("part.fxml"));
			Scene scene = new Scene(part);
			Stage primaryStage = (Stage)fullBody.getScene().getWindow();
			primaryStage.setScene(scene);
			
		} catch (Exception e2) {}
	}
}
