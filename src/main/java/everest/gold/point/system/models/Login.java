package everest.gold.point.system.models;

public class Login {

    Response  response = new Response();
    public Response points( String account_id,String channel_id ){

        System.out.println("1.Account id: "+account_id);
        System.out.println("1.totalpoints: "+channel_id);
        response.setAccountID(account_id);
        response.setTotalPoints(channel_id);

      return response;
    }
}
