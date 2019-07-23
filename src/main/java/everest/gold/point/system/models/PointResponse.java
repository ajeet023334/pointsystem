package everest.gold.point.system.models;

public class PointResponse {

    String account_id;
    String event_type;
   // String trans_id;
   // String channel_id;
  //  String value;
    String message;

    public String getAccount_id() {
        return account_id;
    }
    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }
    public String getEvent_type() {
        return event_type;
    }
    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }
    /*public String getTrans_id() {
        return trans_id;
    }
    public void setTrans_id(String trans_id) {
        this.trans_id = trans_id;
    }
    public String getChannel_id() {
        return channel_id;
    }
    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }*/
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
