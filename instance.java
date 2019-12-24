package KadaiBaseBall;

public class instance {

    public static void main(String[] args) {

        BaseBallTeam HC = new BaseBallTeam();

        HC.setName("広島東洋カープ");
        HC.setWin(88);
        HC.setLose(51);
        HC.setDraw(4);
        HC.report();

        BaseBallTeam HT = new BaseBallTeam();

        HT.setName("阪神タイガース");
        HT.setWin(78);
        HT.setLose(61);
        HT.setDraw(4);
        HT.report();

        BaseBallTeam YB = new BaseBallTeam();

        YB.setName("横浜DeNAベイスターズ");
        YB.setWin(73);
        YB.setLose(65);
        YB.setDraw(5);
        YB.report();

        BaseBallTeam YG = new BaseBallTeam();

        YG.setName("読売ジャイアンツ");
        YG.setWin(72);
        YG.setLose(68);
        YG.setDraw(3);
        YG.report();

        BaseBallTeam TD = new BaseBallTeam();

        TD.setName("中日ドラゴンズ");
        TD.setWin(59);
        TD.setLose(79);
        TD.setDraw(5);
        TD.report();

        BaseBallTeam TY = new BaseBallTeam();

        TY.setName("東京ヤクルトスワローズ");
        TY.setWin(45);
        TY.setLose(96);
        TY.setDraw(2);
        TY.report();
    }

}
