package com.netcracker.chTwo.exThirteen;

import com.opencsv.CSVReader;
import java.io.FileReader;

public class ReadCSV {
    public ReadCSV() {
    }

    public void read(String csv) throws Exception
    {
        try {
            FileReader filereader = new FileReader(csv);
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null ) {
                for (String cell : nextRecord) {
                    System.out.print(cell + " " );
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
