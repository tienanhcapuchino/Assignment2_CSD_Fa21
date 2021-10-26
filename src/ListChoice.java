

import java.util.ArrayList;
import java.util.Scanner;

public class ListChoice {

    Scanner sc = new Scanner(System.in);
    ArrayList <BusRouter> lstBus = new ArrayList<>();
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
    public void addSample(){
        String []a= {"A", "G", "T"};
        String []b= {"J", "G", "Y"};
        String []c= {"K", "L", "N"};
        BusRouter b0 = new BusRouter("xe1", 40, a);
        BusRouter b1 = new BusRouter("xe2", 65, b);
        BusRouter b2 = new BusRouter("xe3", 34, c);
        lstBus.add(b0);
        lstBus.add(b1);
        lstBus.add(b2);
    }
    
    public void addRoute(ArrayList<BusRouter> bus){
        String name;
        int pricee;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Bus: ");
        name = sc.nextLine();
        System.out.println("Enter Price : ");
        pricee = Integer.parseInt(sc.nextLine()); 
        System.out.println("So diem dung: ");
        int n = Integer.parseInt(sc.nextLine());
        String stop[] = new String[n];
        for (int i = 0; i < n; i++) {
             stop[i] = sc.nextLine();
        }
        bus.add(new BusRouter(name, pricee, stop));
    }
    
    
    public void disPlay(ArrayList<BusRouter> bus){
        for (BusRouter bu : bus) {
            System.out.println(bu.getRouter()+"\t"+ bu.getPrice() +"\t"+ bu.Stop());
        }
    }
}

