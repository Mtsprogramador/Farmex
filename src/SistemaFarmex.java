import Views.TelaLogin;

public class SistemaFarmex {
    
    public static void  main(String[]args){
        
        // usado para evitar travamento de tela  !!!//
       java.awt.EventQueue.invokeLater(new Runnable(){
           public void run(){
       
       TelaLogin tela = new TelaLogin ();
       tela.setVisible(true);
           }
    
});
    }
}
