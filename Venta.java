/*Una compañía de ventas de computadoras, paga a sus vendedores, un sueldo de $5000,
más una comisión de $200 por cada computadora vendida, más el 5% del valor total de la venta. 

Se nos pide crear un programa que permita ingresar el nombre del vendedor, la cantidad de computadoras vendidas, 
y el valor total de la venta en el mes.
Calcule y muestre el salario total del vendedor.
*/




import java.io.*;

import javax.swing.*;



public class Venta{



static boolean  validar(String v,int inicio,int fin){



boolean estado=true;


for(int i=0;i<v.length();i++){


if(!(v.charAt(i)>=inicio &&  v.charAt(i)<fin)){

JOptionPane.showMessageDialog(null,"Solamente caracteres permitidos de favor");
estado=false;
break;

}



}



return estado;

}






static void datos() throws IOException{


BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));


String pre[]={"Dame el nombre de favor?","Cuantas computadoras vendiste este mes?:","Cual fue la venta al mes?:"};

String[] valores=new String[3]; 

int i=0;

String v;
int inicio=58,fin=256;
boolean bandera=true;



while(i<3){

System.out.print(pre[i]);
v=entrada.readLine();

bandera=validar(v,inicio,fin);



if(bandera==true){

valores[i]=v;
i++;
inicio=48;
fin=58;
}


}

proceso(valores);



}




static void proceso(String valores[]){



float pm=5000f,comision=200f,porcentaje=0.05f;



float res=(Float.parseFloat(valores[1])*comision)+(Float.parseFloat(valores[2])*porcentaje)+pm;




System.out.print(valores[0]+" tendra un salario de:"+res+" pesos");
}





public static void main(String[]args) throws IOException{


datos();







}



}


