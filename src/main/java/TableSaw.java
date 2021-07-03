import tech.tablesaw.api.*;
import java.io.IOException;

public class TableSaw {

    public static void main(String[] args) {

        String path = "src\\main\\Wuzzuf_Jobs.csv";

        try {
            
            //importing data from csv
            Table df = Table.read().csv(path);
            
            //display some of The data information
            System.out.println("display some of The data :\n"+df.first(10));

            //dispaly data structure and summary
            System.out.println(df.structure());
            System.out.println(df.summary());

            //Counting the jobs for each company and display it in descending order 
            var uniqe = df.countBy("Company");
            Table descending = uniqe.sortDescendingOn("Count");
            System.out.println(descending);
          
            //cheching for missing Value
            Table checkMissing = df.missingValueCounts();
            System.out.println(checkMissing);
            

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}