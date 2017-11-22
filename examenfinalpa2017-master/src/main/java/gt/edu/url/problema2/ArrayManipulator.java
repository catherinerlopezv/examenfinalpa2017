package gt.edu.url.problema2;

import java.io.BufferedReader;

public interface ArrayManipulator<E> {
	
	public int subsets(List<E> set);
        BufferedReader br = null;
        String sCurrentLine = null;
        String tipoEstructura = "";
       
            
           
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                if (sCurrentLine == "Stack") 
                {
                    tipoEstructura = "Stack";
                } 
                else
                {
                 //5 4 3 2 1
                    String[] numbers = sCurrentLine.split(" ");
                    for (int i = 0; i < numbers.length; i++) {
                    
                    }      
                       
                }
}
}
