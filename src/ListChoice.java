
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ptuan
 */
public class ListChoice {
    ProcessFile pro = new ProcessFile();
    public void menu(){
        System.out.println("Bus Map?");
        System.out.println("\t1.Load data from file");
        System.out.println("\t2.Add a new bus route");
        System.out.println("\t3.Display all the routes");
        System.out.println("\t4.Find a path with fewest stops");
        System.out.println("\t5.Find a path with lowest cost");
        System.out.println("\t6.Exit");
        System.out.print(">Choice: ");
    }
    public void addRoute(ArrayList<BusRouter> bus){
    }
    public void disPlay(ArrayList<BusRouter> bus){
        for (BusRouter bu : bus) {
            System.out.println(bu.getRouter()+"\t"+ bu.getPrice() +"\t"+ bu.Stop());
        }
    }
}
