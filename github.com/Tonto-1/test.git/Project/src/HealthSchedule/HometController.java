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

	@FXML private Button fullBody; //전신운동 버튼
	@FXML private Button upperBody; //상체운동 버튼
	@FXML private Button abs; //복부운동 버튼
	@FXML private Button lowerBody; //하체운동 버튼
	@FXML private Button home; //홈 버튼
	@FXML private Button food; //식단 버튼
	@FXML private Button body; //내 몸 버튼
	@FXML private Button homet; //홈트 버튼
	
	@FXML private ImageView human; //인체사진
	
	
	
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
	
	//체중으로 이동
	 public void btnbody(ActionEvent event) {
		   try {
		     Parent healthChart = FXMLLoader.load(getClass().getResource("chart.fxml"));
		     Scene scene = new Scene(healthChart);
		     Stage primaryStage= (Stage)body.getScene().getWindow();
		     primaryStage.setScene(scene);
		  } catch (Exception e) {}
	   }
	
	//홈트로 이동
	private void btnhomet(ActionEvent e) {
		try {
		     Parent healthChart = FXMLLoader.load(getClass().getResource("homet.fxml"));
		     Scene scene = new Scene(healthChart);
		     Stage primaryStage= (Stage)homet.getScene().getWindow();
		     primaryStage.setScene(scene);
		  } catch (Exception e2) {}
	}
	
	//식단으로 이동
	private void btnfood(ActionEvent e) {
		
			try {
			     Parent healthChart = FXMLLoader.load(getClass().getResource("food.fxml"));
			     Scene scene = new Scene(healthChart);
			     Stage primaryStage= (Stage)homet.getScene().getWindow();
			     primaryStage.setScene(scene);
			  } catch (Exception e2) {}
		}
	
	
	//홈으로 이동
	private void btnhome(ActionEvent e) {
		 try {
		     Parent Home = FXMLLoader.load(getClass().getResource("maintest.fxml"));
		     Scene scene = new Scene(Home);
		     Stage primaryStage= (Stage)home.getScene().getWindow();
		     primaryStage.setScene(scene);
		  } catch (Exception e2) {}
	   }	
	

	//전신운동 페이지로 넘어감
	public void btnfullBody(ActionEvent e) {
		try {
			Parent part = FXMLLoader.load(getClass().getResource("part.fxml"));
			Scene scene = new Scene(part);
			Stage primaryStage = (Stage)fullBody.getScene().getWindow();
			primaryStage.setScene(scene);
			
		} catch (Exception e2) {}
	}
}
