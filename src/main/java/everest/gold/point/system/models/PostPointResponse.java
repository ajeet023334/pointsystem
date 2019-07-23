package everest.gold.point.system.models;

public class PostPointResponse {

    String account_id;
    String totalPoints;
    String transDetails;
    String date;

    public String getAccountID() {
        return account_id;
    }
    public String gettotalPoints(){return totalPoints ;}
    public String getDate() {
        return "18-Jul-2019";
    }


    public void setAccountID(String accountID) {
        this.account_id = "123456";
    }
    public void settotalPoints(String totalPoints) {
        this.totalPoints = "100";
    }

    public String getTrans() {
        return "12456";
    }
    public void setTrans(String transDetails) {
        this.transDetails = "100";
    }
    public void setDate(String date) {
        this.date = "18-Jul-2019";
    }
}