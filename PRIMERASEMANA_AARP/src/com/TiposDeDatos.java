package com;

public class TiposDeDatos {

 public static void main(String[] args) {
	
	 //Si queremos escribir algun comentario
	 //lo hacemos anteponiendo dos diagonales//
	 
	 //El metodo main es el punto de entrada y de ejecucion de un programa de Java
	 
	 /*
	  * Comentarios de multiples lineas
	  * con diagonal y asterisco
	  * y conforme demos el salto de linea el comentario
	  * puede ir creciendo
	  */
	 
	 //vamos a ver ejemplos de como se declaran estas variables en Java
	 
	 byte numero;
	 
	 //posteriormente le puedo asignar un valor
	 numero = 127;
	 
	 //Declarar variables con valor asignado desde un inicio
	 byte by= -128;//1 byte de memoria
	 short sh= 32767;//2 bytes de memoria
	 int in= 2147483647; //4 bytes de memoria
	 long largo= 2147859581L; //8 bytes de memoria requieren sufijo L 
	 //para almacenar valores
	 
	 //El tipo de dato mas utilizado (comodín) es el tipo int
	 
	 /*Tipos de datos primitivos
	  * NUMERICOS EN COMA FLOTANTE (DECIMALES)
	  * 
	  */
	 float pulgadas= 2.54F; //4 bytes y requieren del sufijo F
	 double pi=3.1416; //8 bytes de memoria y es el tipo de dato
	 //comodín más utilizado para decimales
	 
	 /*TIPOS DE DATOS PRIMITIVOS
	  * *BOOLEANOS
	  * CARACTER
	  * 
	  */
	 boolean evalua= true; //solo pueden contener true or false
	 //son utiles para evaluar expresiones o condiciones segun se necesite
	 
	 char caracter= 'a';
	 char simbolo= '#';//almacenan un caracter a la vez
	 
	 /*Tipos de datos estructurados
	  *NO PRIMITIVOS
	  *TIPO DE DATO OBJETO 
	  *Son datos más complejos, incluso provenientes de clases
	  */
	 
	 //Cadena de texto -String
	 String nombre= "Adan Apolinar";
	 
	 String cadena;// igual podemos declararlo vacio
	 cadena= "Hola mundo"; //le asignamos valor posteriormente
	 
	 //los tipos de dato objeto, pueden acceder a métodos o funciones
	 //para realizar alguna determinada tarea
	 
	 caracter= '?';//aquí estamos guardando un nuevo valor en la variable caracter
	 
	 nombre.toLowerCase(); // estamos accediendo a una funcion que convierte
	 // lo que esta guardado en nombre a minúsculas
	 
	 //Otros tipo de dato objeto son los Wrapper- Envoltorio
	 //son clases que envuelven a los tipos de dato primitivos para poder
	 //otorgarle otras funcionalidades
	 Byte variable;
	 Short numShort;
	 Integer numInt;
	 Long numLong;
	 Boolean evalua2;
	 Character letra;
	 Float decimal;
	 Double decimales;
	 
	 letra= '$';
	 
	 letra.charValue();
	 
	 //Salida a los datos en consola
	 //Impresión en consola
	 
	 System.out.println("Hola mundo");
	 System.out.println(nombre);//aqui le damos salida a lo que está contenido en la variable nombre
	 //syso+ctrl+espacio para completar la línea más rápido
	 System.out.println(3+18);
	 
	 int x=3;
	 int y=18;
	 
	 System.out.println(x+y);
	 
	 
	 //Concatenacion- se van uniendo los valores uno a uno para mostrarse en consola
	 System.out.println("La suma es: "+x+y);
	 System.out.println("La suma es: "+ (x+y)); //si quiero ver el resulta de la suma
	 //debo de poner entre parentesis la operación
	 
	 
	 
	 
	 
	 
			 
	 
	 
	 
	 
	 
	 
			 
}//cierre del main 
}//Cierre de la clase
