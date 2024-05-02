/**
 * ボタンなどのアクションが起こる際に使う
 */
package com.example.stonegame_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InputFormController {
    private int stones;
    private String[] playerName;
    private int takeMax;
    private int takeMin;
    private String stoneSymbol;
    private int playingUser;

    @FXML
    private Label stonesLabel;
    @FXML
    private Label playerNameLabel;
    @FXML
    private TextField inputStoneTakeCount;
    @FXML
    private Button takeStoneBT;

    final public int maxScore = 100;

    //コンストラクタ
    public InputFormController(){
        //変数初期化
        this.stones=25;
        this.playerName = new String[]{"プレイヤーA", "プレイヤーB"};
        this.takeMax=3;
        this.takeMin=1;
        this.stoneSymbol="●";
        this.playingUser= this.playerName.length-1;
    }

    @FXML
    protected void onTakeStoneClick(ActionEvent actionEvent) {
        Alert result = new Alert(Alert.AlertType.INFORMATION);
        result.setTitle("結果");
        int takeStone=Integer.parseInt(inputStoneTakeCount.getText());
        updatePlayingUser();

        stones-=takeStone;
        if(stones<1){
            result.setContentText(this.playerName[0]+"の勝利");
            stonesLabel.setText("現在の石の数:"+this.playerName[playingUser]);
            result.show();
        }else {
            stonesLabel.setText("現在の石の数:" + stones);
            playerNameLabel.setText(this.playerName[playingUser]);
        }
    }

    private void updatePlayingUser(){
        if(this.playingUser>=this.playerName.length-1){
            this.playingUser=0;
        }else{
            this.playingUser++;
        }
    }
}