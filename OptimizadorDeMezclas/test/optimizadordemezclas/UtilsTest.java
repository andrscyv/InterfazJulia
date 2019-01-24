/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizadordemezclas;

import java.nio.charset.Charset;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author El_jefe
 */
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    

    /**
     * Test of leeValRes method, of class Utils.
     */
    @Test
    public void testLeeValRes() {
        System.out.println("leeValRes");
        String[] expResult ={"[719090.0]","748236.0"};
        String[] result = Utils.leeValRes("valoresResTest.txt");
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of getDataFromCsv method, of class Utils.
     */
    @Test
    public void testGetDataFromCsv() {
        System.out.println("");
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("==============GET_DATA_FROM_CSV===============");
        System.out.println("==============================================");
        System.out.println("");
        System.out.println("");
        ArrayList<String[]> res = Utils.getDataFromCsv("basicos_optimizados", false);
        for(String[] lin : res){
            for( String cel : lin)
                System.out.print(cel + ", ");
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        
        System.out.println("");
        System.out.println("");
        
        //assertArrayEquals(expResult, result);
    }
}
