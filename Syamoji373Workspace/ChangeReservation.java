/*
作成者：シモジ
更新日時：2025年1月5日23時47分
動作・役割：予約情報変更機能
コメント： 改善の余地あり
*/

public class ChangeReservation {
    public int ChangeReservation(){
        // 予約者名
        String reserver;
        // 予約日時
        String date_and_time;
        // 予約人数
        String number_of_people;
        int flag = 0;

        while(flag == 0){
            // 入力を受け取る？？？
            reserver = getParameter("");
            date_and_time = getParameter("");
            number_of_people = getParameter("");

            // 入力チェック
            if(reserver != null && date_and_time != null && number_of_people != null){
                flag = 1;
            }
        }
        
        //予約情報のテーブル
        String table_name  = "RESERVATION";
        // where 以下の条件文
        String instruction = "";
        UpdateDB(table_name, instruction);
        return 0;
    }
}