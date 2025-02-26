import javax.swing.*;

public class ATIVIDADE_003_Tabuada {
    public static void main(String[] args) {

        String ex = "";

        for(int a =1;a<=10;a++){
            for(int b=1;b<=5;b++){
                ex +=(b+ "x" +a+ "=" +(b*a)+" \t");
            }
            ex +=(" ");
            ex +=("\n");

        }
        ex +=(" ");
        ex +=("\n");
        for(int a =1;a<=10;a++){
            for(int b=6;b<=10;b++){
                ex +=(b+ "x" +a+ "=" +(b*a)+" \t");
            }
            ex +=(" ");

            ex +=("\n");

        }
        JTextArea JtxArea = new JTextArea(ex);
        JOptionPane.showMessageDialog(null, JtxArea);
    }

}