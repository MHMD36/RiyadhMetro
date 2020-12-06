import java.io.*;

public class main {
    public static void main(String args[]) throws IOException {
        String row;
        BufferedReader csvReader = new BufferedReader(new FileReader("Red Lane.csv"));
        csvReader.readLine();
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            System.out.println(data[0] + " " + data[1] + " " + data[2]);
        }
        csvReader.close();
    }
}