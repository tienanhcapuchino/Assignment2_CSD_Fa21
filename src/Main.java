

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String [] a = {"Hanoi", "longan", "tphcm"};

        Scanner sc = new Scanner(System.in);
        BusRouter b1 = new BusRouter("88", 1000000, a);
        int choice;
        ArrayList<BusRouter> bus = new ArrayList<>();
        ListChoice ls = new ListChoice();
        ProcessFile pro = new ProcessFile();
        bus.add(b1);
        do{
            ls.menu();
            choice = sc.nextInt();
            switch(choice){
                case 1 : 
                    if(!pro.fileChecker()){
                        pro.loatFile(bus);
                        ls.disPlay(bus);
                    }
                    break;
                case 2 :
                    ls.addRoute(bus);
                    break;
                case 3 :
                    ls.disPlay(bus);
                    break;
                case 4 :
                case 5 :  
            }
        }while(choice != 6);
    }
    
}

