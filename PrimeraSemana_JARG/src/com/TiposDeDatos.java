package com; //nombre del paquete

public class TiposDeDatos { //nombre de la clase
	
	public static void main(String[] args) { //apertura del método main
		
	
	
	//el metodo main es el punto de entrada y de ejecución de un programa de java
	
/*
 * Comentarios de múltiples líneas
 * y conforme demos saltos de línea
 * el comentario puede ir creciendo
 *
 */
	
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMERICOS ENTEROS
	 */
	
	//EJEMPLOS DE CÓMO SE DECLARAN ESTAS VARIABLES EN JAVA
	//DECLARAR VARIABLES EIN VALOR ASIGNADO INICIALMENTE
	//ESTO PERMITIRÁ ASIGNARLES UN VALOR MÁS ADELANTE EN CASO DE SER NECESARIO
		
		
	
byte numero;

//posteriormente le puedo asignar un valor
numero = 127; 

//Declarar variables con valor asignado desde un inicio
byte by = 127; //1 byte de memotia (-128 a 127) 
short sh = 32767; //2 bytes de memoria (-32768 a32767)
int in = 2147483647; //4 bytes de memoria (más utilizado para números enteros)
long largo = 2147483649L; //8 bytes de memoria y requieren el sufijo L para almacenar los valores
	

	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMERICOS EN COMA FLOTANTE (DECIMALES)
	 */

float pulgadas = 2.54F; //4 bytes y necesitan el sufijo F
double pi = 3.1416; // 8 bytes de memoria y es el tipo de dato comodín más utilizado en decimales 

	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMERICOS ENTEROS
	 */
	
boolean evalua = true; // Sólo pueden contener true o false y son útiles para evaluar expresiones o condiciones según se necesite

char caracter='a';
char simbolo='#';//almacenan un caracter a la vez 

//CTRL + S para guardar cambios o código que vamos escribiendo


	/*
	 * TIPOS DE DATO ESTRUCTURADOS
	 * NO PRIMITIVOS
	 * TIPO DE OBJETO
	 * Prácticamente son datos más complejos, incluso provenientes de clases
	 */

	//CADENA DE TEXTO-STRING
String nombre = "Johnatan Rendon";

String cadena; //igual podemos declararlo vacío  

cadena = "Hola mundo"; //le asignamos valor posteriormente

//Los tipos de dato objeto, pueden acceder a métodos o funciones para realizar alguna determinada tarea 


caracter = '?'; //aquí estamos guardando un nuevo valor en la variable caracter

nombre.toLowerCase(); //aquí estamos accediendo a una función que convierte lo que está guardando en nombre a minúsculas

//OTROS TIPOS DE DATO OBJETO SON LOS TIPO WRAPPER - ENVOLTORIO
//SON CLASES QUE 'ENVUELVEN' A LOS TIPOS DE DATO PRIMITIVO PARA PODER OTORGARLES OTRAS FUNCIONALIDADES
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
//IMPRESION EN CONSOLA

System.out.println("Hola mundo"); //con println se da un salto de línea para mostrar la siguiente impresión de consola

System.out.println(nombre); //aquí estamos dándole salida a lo contenido en la variable nombre


//syso + ctrl + barra espaciadora y se completa la línea más rápido
System.out.println(3+18);
int x=3;
int y=18;

System.out.println(x+y);

//Concatenacion - se van uniendo los valores uno a uno para mostrarse en consola
System.out.println("la suma es:" + x+y);
System.out.println("La suma es:" + (x+y)); //Si quiero ver el resultado de la suma tengo que eacribir las variables entre paréntesis



	} //cierre del main
	} //cierre de la clase



