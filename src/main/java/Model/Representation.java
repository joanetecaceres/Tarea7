/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Carolina Caceres
 */
public class Representation {
    
    /**
     * Creates HTML to present the results in the view
     * @param result to be presented
     * @return String with HTML tags to present a table in the browser
     */
    static public String htmlRepresentation(List<Result> results) {
        
        String htmlRepresentation = "<table><tr><td> Resultado </td></tr> ";
        
        for(int j = 1 ; j < results.size() ;j++ ){         
            
            htmlRepresentation +="<tr><td>";
            htmlRepresentation += "Caso de Prueba " + j;            
            htmlRepresentation +="</td></tr>";      
                        
            htmlRepresentation +="<tr><td>";
            htmlRepresentation += "Rx,y: " + results.get(j).getCorrelationR();            
            htmlRepresentation +="</td></tr>";      
                               
            htmlRepresentation +="<tr><td>";
            htmlRepresentation +="R2: " +  results.get(j).getCorrelationSquareR();            
            htmlRepresentation +="</td></tr>";  
            
            htmlRepresentation +="<tr><td>";
            htmlRepresentation +="Significance: " +  results.get(j).getExpSignificance();            
            htmlRepresentation +="</td></tr>";     
            
            htmlRepresentation +="<tr><td>";
            htmlRepresentation +="B0: " +  results.get(j).getExpB0();            
            htmlRepresentation +="</td></tr>";    
            
            htmlRepresentation +="<tr><td>";
            htmlRepresentation +="B1: " +  results.get(j).getExpB1();            
            htmlRepresentation +="</td></tr>";    
            
            htmlRepresentation +="<tr><td>";
            htmlRepresentation +="Yk: " +  results.get(j).getExpYk();            
            htmlRepresentation +="</td></tr>";    
            
            htmlRepresentation +="<tr><td>";
            htmlRepresentation +="Range: " +  results.get(j).getExpRange();            
            htmlRepresentation +="</td></tr>";    
            
            htmlRepresentation +="<tr><td>";
            htmlRepresentation +="UPI (70%)-: " +  results.get(j).getExpUPI();            
            htmlRepresentation +="</td></tr>";    
            
            htmlRepresentation +="<tr><td>";
            htmlRepresentation +="LPI (70%): " +  results.get(j).getLPI();            
            htmlRepresentation +="</td></tr>";    
            
        }       
        
        htmlRepresentation +="</table>";
        
        return htmlRepresentation;
    }    
}