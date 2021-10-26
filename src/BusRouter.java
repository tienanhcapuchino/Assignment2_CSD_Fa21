/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ptuan
 */
public class BusRouter {
    public String router;
    public int price;
    public String [] Stop;

    public BusRouter() {
    }

    public BusRouter(String router, int price, String[] Stop) {
        this.router = router;
        this.price = price;
        this.Stop = Stop;
    }

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getStop() {
        return Stop;
    }

    public void setStop(String[] Stop) {
        this.Stop = Stop;
    }
    public String Stop(){
        String k ="";
        for (int i = 0; i < Stop.length; i++) {
            k += Stop[i];
        }
        return k;
    }
    
}
