package lesson7;

import java.io.FileWriter;

public class CsvWriter {
    public void save(String filePath, AppData appData) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Write header
            String[] header = appData.getHeader();
            for (int i = 0; i < header.length; i++) {
                writer.append(header[i]);
                if (i < header.length - 1) {
                    writer.append(';');
                } else {
                    writer.append('\n');
                }
            }

            // Write data
            int[][] data = appData.getData();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    writer.append(String.valueOf(data[i][j]));
                    if (j < data[i].length - 1) {
                        writer.append(';');
                    } else {
                        writer.append('\n');
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
