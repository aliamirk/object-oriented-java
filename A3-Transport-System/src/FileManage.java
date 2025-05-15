import java.io.*;
import java.util.*;

class FileManage {
    public static void saveToFile(String filename, Object data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(data.toString());
        writer.close();
    }

    public static List<String> loadFromFile(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        return lines;
    }
}