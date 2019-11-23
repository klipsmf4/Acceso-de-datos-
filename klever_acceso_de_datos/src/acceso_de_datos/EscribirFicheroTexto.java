package acceso_de_datos;

import java.io.*;

public class EscribirFicheroTexto {
  public static void main(String[] args) throws IOException {
   File fichero = new File("C:\\Users\\DAM2_Vespertino\\Desktop\\klever\\Acceso a Datos\\Archivos_para_escribir\\escribir.txt");//declara fichero          
   FileWriter fic = new FileWriter(fichero); //crear el flujo de salida       
   String cadena ="Esto es una prueba con FileWriter";
   char[] cad = cadena.toCharArray();//convierte un String en array de caracteres
	
   for(int i=0; i<cad.length; i++)
	   fic.write(cad[i]);  //se va escribiendo un car�cter

   fic.append('*'); //a�ado al final un *   
   fic.write(cad);//escribir un array de caracteres   
   String c="\n*esto es lo ultimo*";
   fic.write(c);//escribir un String   
   
   String prov[] = {"Albacete","Avila","Badajoz",
		   "C�ceres","Huelva","Ja�n",
           "Madrid","Segovia","Soria","Toledo",
           "Valladolid","Zamora"};
   
   fic.write("\n");
   for(int i=0; i<prov.length; i++) {
	      fic.write(prov[i]);
	      fic.write("\n");
   }
   
   
   
   fic.close();    //cerrar fichero
   
  }
}
