
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
public class ProcessFile {

    public void loatFile(ArrayList<BusRouter> b) {
        File f = new File("C:\\Users\\ptuan\\Documents\\NetBeansProjects\\Assigment2_CSD\\input.txt");
        try {
            FileReader fileread = new FileReader(f);
            BufferedReader buf = new BufferedReader(fileread);
            String line;
            while ((line = buf.readLine()) != null) {
                if (line.startsWith("B") || line.startsWith("b")) {
                    String k[] = line.split("[.]");
                    if (k != null) {
                        int pri = 0;
                        String bus[] = k[0].split("\\s+");
                        String p[] = k[1].split("\\s+");
                        String stop[] = k[2].split(",");
                        if (p != null) {
                            pri = Integer.parseInt(p[2]);
                        }
                            b.add(new BusRouter(bus[1], pri, stop));
                    }
                } else if (line.startsWith("F") || line.startsWith("f")) {
                }
            }
        } catch (Exception e) {
        }
    }

    public boolean fileChecker() {
        File file = new File("C:\\Users\\ptuan\\Documents\\NetBeansProjects\\Assigment2_CSD\\input.txt");
        if (!file.exists()) {
            try {
                System.out.println("File not exist!!!");
                file.createNewFile();
                System.out.print("File created.");
                return true;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }
}
