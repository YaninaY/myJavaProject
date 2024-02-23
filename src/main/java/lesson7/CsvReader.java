package lesson7;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvReader {
    public AppData read(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Reader header
            String[] header = reader.readLine().split(";");

            // Read data
            int rowCount = 0;
            while (reader.readLine() != null) {
                rowCount++;
            }

            // Point to the beginning of the file
            reader.close();
            reader = new BufferedReader(new FileReader(filePath));

            // Skip header
            reader.readLine();

            String line;
            int rowIndex = 0;
            int[][] data = new int[rowCount][header.length];
            while ((line = reader.readLine()) != null) {
                String[] lineData = line.split(";");
                for (int i = 0; i < lineData.length; i++) {
                    data[rowIndex][i] = Integer.parseInt(lineData[i]);
                }

                rowIndex++;
            }

            reader.close();
            return new AppData(header, data);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
