
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lsosa
 */
public class DecimalFormat {
    
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        double A=sn.nextInt();
        double B=sn.nextInt();
        String total= df.Format((A/B));
        System.out.print(total);


    }

    private DecimalFormat(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String Format(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
