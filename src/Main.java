
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ptuan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        ArrayList<BusRouter> bus = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ListChoice ls = new ListChoice();
        ProcessFile pro = new ProcessFile();
        do{
            ls.menu();
            choice = sc.nextInt();
            switch(choice){
                case 1 : 
                    if(!pro.fileChecker()){
                        pro.loatFile(bus);
                        ls.disPlay(bus);
                    }
                case 2 :
                case 3 :
                case 4 :
                case 5 :  
            }
        }while(choice != 6);
    }
    
}
