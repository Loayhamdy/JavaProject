import java.util.List;

public class Main {
    
        static String path;

    static {
        path = "src\\main\\Wuzzuf_Jobs.csv";
    }

    public static void main(String[] args){
    
        JobDAO jobDAO = new JobDAO();
        List<Job> job = jobDAO.readjobFromCsv(path);
        
        int i =0 ;
        for(Job j: job)
        {
            System.out.println("#"+(i++)+j);
        }
        
    }
}
