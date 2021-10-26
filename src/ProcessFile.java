
import java.io.*;
import java.util.*;

public class ProcessFile {

    public void loatFile(ArrayList<BusRouter> b) {
        File f = new File("input.txt");
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
        File file = new File("input.txt");
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
