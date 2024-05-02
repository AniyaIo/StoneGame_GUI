/**
 * 処理の流れを書く
 */
package com.example.stonegame_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class StoneGame extends Application {

    //最初に呼ばれる
    @Override
    public void start(Stage stage) throws IOException {
        //fxmlファイル(レイアウト)読み込み
        FXMLLoader fxmlLoader = new FXMLLoader(StoneGame.class.getResource("InputForm.fxml"));
        //scene作成
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Scene scene = new Scene(fxmlLoader.load());
        //stage(ウィンドウ)作成
        stage.setTitle("TakeStoneGame");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}