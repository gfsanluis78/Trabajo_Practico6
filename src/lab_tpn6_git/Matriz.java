package lab_tpn6_git;

//import javax.swing.JOptionPane;

public class Matriz {
    
    public Matriz() {}
       
    public void armar(){
    int matriz[][] = new int[4][];
    matriz [0]= new int[4];
    matriz [1]= new int[3];
    matriz [2]= new int[5];
    matriz [3]= new int[2];
            
    int i,j,fila=0,numero=3;
               
    for(i=0;i<matriz.length;i++){
        for(j=0;j<matriz[i].length;j++){
            matriz[i][j] = numero;
            numero+=3;
            
//        De esta forma los valores son para ingresar por inputDialog  
//        String numero_string = JOptionPane.showInputDialog("Ingrese un numero");
//        matriz[i][j] = Integer.parseInt(numero_string);
        System.out.print(matriz[i][j]+" ");
        }
        System.out.println("");
    }
        System.out.println("");
        System.out.println("A continuacion se enumeran los pares por fila...");
    
        for (i = 0; i < matriz.length; i++) {
        fila++;
        System.out.print("Fila "+fila+": ");
            for (j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]%2 == 0){
                   System.out.print(matriz[i][j] + " ");
                    } 
            }
            System.out.println("");
    }
    }
}
