package com.netcracker.chTwo.exThirteen;


public class Main {
    public static void main(String[] args) throws Exception {
       /* Download the JAR file for OpenCSV from http://opencsv.sourceforge.net. Write
        a class with a main method that reads a CSV file of your choice and prints
                some of the content. There is sample code on the OpenCSV website. You
        haven’t yet learned to deal with exceptions. Just use the following header
        for the main method:
        public static void main(String[] args) throws Exception
        The point of this exercise is not to do anything useful with CSV files, but
        to practice using a library that is delivered as a JAR file.*/
        String csv = "src/com/netcracker/chTwo/exThirteen/x.csv";
        ReadCSV readCSV = new ReadCSV();
        readCSV.read(csv);
}
}
