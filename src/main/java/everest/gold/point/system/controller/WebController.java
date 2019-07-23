package everest.gold.point.system.controller;


import everest.gold.point.system.models.Login;
import everest.gold.point.system.models.PointResponse;
import everest.gold.point.system.models.PostPointResponse;
import everest.gold.point.system.models.Response;
import org.springframework.web.bind.annotation.*;
import everest.gold.point.system.models.PointRedeemResponse;
import everest.gold.point.system.models.PostPoint;
import java.util.logging.Logger;


@RestController
public class WebController {


    @RequestMapping(value = "/everestgold/v1/getpointsummary", method = RequestMethod.GET)
    public Response Getpointsummary(@RequestParam(value = "account_id") String account_id, @RequestParam(value = "event_type", required = false) String event_type, @RequestParam(value = "trans_id", required = false) String trans_id, @RequestParam(value = "channel_id") String channel_id, @RequestParam(value = "value", required = false) String[] value) {

        Response response = new Response();

        if (event_type.equalsIgnoreCase("LOGIN")) {
            response.setAccountID("123456");
            response.setTotalPoints("100");


            System.out.print("Inside Event TYpe LOGIN :"+event_type);
        }else if (event_type.equalsIgnoreCase("REG")) {

            System.out.print("Inside Event TYpe LOGIN :"+event_type+"\n");
        }else if (event_type.equalsIgnoreCase("PFEED")) {

            System.out.print("Inside Event TYpe LOGIN :"+event_type+"\n");
        }else if (event_type.equalsIgnoreCase("CFEED")) {

            System.out.print("Inside Event TYpe LOGIN :"+event_type+"\n");
        }else if (event_type.equalsIgnoreCase("RCOM")) {

            System.out.print("Inside Event TYpe LOGIN :"+event_type+"\n");
        }else if (event_type.equalsIgnoreCase("LPOST")) {

            System.out.print("Inside Event TYpe LOGIN :"+event_type+"\n");
        }else if (event_type.equalsIgnoreCase("LREPLY")) {

            System.out.print("Inside Event TYpe LOGIN :"+event_type+"\n");
        }else if (event_type.equalsIgnoreCase("SFEED")) {

            System.out.print("Inside Event TYpe LOGIN :"+event_type +"\n");
        }else if (event_type.equalsIgnoreCase("SPROFILE")) {

            System.out.print("Inside Event TYpe LOGIN :"+event_type+"\n");
        }else if (event_type.equalsIgnoreCase("DMESSAGE")) {

            System.out.print("Inside Event TYpe LOGIN :"+event_type+"\n");
        } else if (event_type.equalsIgnoreCase("TBUY")) {

            System.out.print("Inside Event TYpe LOGIN :"+event_type+"\n");
        }else if (event_type.equalsIgnoreCase("TSELL")) {

            System.out.print("Inside Event TYpe LOGIN :"+event_type+"\n");
        }else if(event_type.equalsIgnoreCase("REDEEM")){

        }else{
            System.out.println("Event type is Missing");
        }
        return response;
    }


    @RequestMapping(value = "/everestgold/v1/getpointhistory",method = RequestMethod.GET)
    public PostPointResponse getpointhistory(@RequestParam(value = "account_id") String account_id,@RequestParam(value = "event_type",required = false) String event_type,@RequestParam(value = "trans_id",required = false) String trans_id,@RequestParam(value = "channel_id") String channel_id,@RequestParam(value = "value",required = false) String []value) {
        PostPointResponse response = new PostPointResponse();
        response.setAccountID("123456");
        response.settotalPoints("100");
        response.setTrans("10000");
        response.setDate("18-Jul-2019");
        return response;
    }


    @RequestMapping(value = "/everestgold/v1/getpoints",method = RequestMethod.POST)
    @ResponseBody
    public PointResponse getpoints(@RequestBody PointResponse point){

        PointResponse point_trade = new PointResponse();

        point_trade.setAccount_id("123456");
        point_trade.setEvent_type(point.getEvent_type());
        point_trade.setMessage("You are awarded 100 points");
        // point_trade.setEvent_type(point.getEvent_type());
        //  point_trade.setTrans_id(point.getTrans_id());
        // point_trade.setChannel_id(point.getChannel_id());
        //  point_trade.setValue(point.getValue());
        System.out.println("Point_trade:" + point.getAccount_id());
        System.out.println("Event_Type:" + point.getEvent_type());
        return point_trade;
    }

    @RequestMapping(value = "/everestgold/v1/redeempoint",method = RequestMethod.POST)
    @ResponseBody
    public PointRedeemResponse redeempoint(@RequestBody PointRedeemResponse PointRedeemResponse){

        PointRedeemResponse point_redeem = new PointRedeemResponse();

        point_redeem.setAccount_id("123456");
        point_redeem.setPoints("100");
        point_redeem.setMessage("You have been successfully redeemed 11 EGT gold with 100 points successfully");

        return point_redeem;
    }

}