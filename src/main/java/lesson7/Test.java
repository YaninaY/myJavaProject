package lesson7;

public class Test {
    public static void main(String[] args) {
        String[] header = new String[]{"Value 1", "Value 2", "Value 3"};
        int[][] data = new int[][]{{100, 200, 123}, {300, 400, 500}};
        AppData appData = new AppData(header, data);
        String fileName = "data.csv";

        // Write CSV
        CsvWriter writer = new CsvWriter();
        writer.save(fileName, appData);

        // Read CSV
        CsvReader reader = new CsvReader();
        AppData readAppData = reader.read(fileName);
        String[] readHeader = readAppData.getHeader();
        int[][] readData = readAppData.getData();

        // Print header
        for (int i = 0; i < readHeader.length; i++) {
            System.out.print(readHeader[i] + " ");
        }

        System.out.println();
        // Print data
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }

            System.out.println();
        }
    }
}
