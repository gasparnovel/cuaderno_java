# CFGS Programación 20/21

## Variables y operadores

- Ejercicio 1

Crear dos variables de cualquiera de los tipos básicos, dar un valor a la primera y a continuación asigne la segunda a la primera. Imprimir por pantalla las dos variables. Cambiar el valor de la segunda variable y volver a imprimir las variables por pantalla. ¿Qué es lo que ocurre?

- Ejercicio 2 ej02

A partir de una variable num1 con valor inicial 12 y una variable num2 con valor inicial 4, crear nuevas variables que almacenen el resultado de realizar la suma, resta, multiplicación, división y resto de num1 y num2. Mostrar el valor de las nuevas variables por pantalla.

- Ejercicio 3 ej03

Construir un programa que, dado el radio de una esfera, calcule y devuelva por pantalla el valor de la superficie y el volumen de la esfera correspondiente. Para obtener el valor de PI, utilizar la variable estática Math.PI.

Volumen esfera = (4/3)\*PI\*R3 Superficie esfera = 4\*PI\*R2

- Ejercicio 4 ej04

Construir un programa que dado el peso (en kilogramos) y la altura de una persona (en metros) calcule y muestre por pantalla su Indice de Masa Corporal (IMS) o índice de Quetelet. Este índice pretende determinar el intervalo de peso más saludable que puede tener una persona. El valor de este índice se calcula mediante la siguiente expresión:

`IMS = peso/altura2 `

Se suele establecer un intervalo de 18 a 25 como saludable en personas adultas. Para la realización de ejercicios, en los que el usuario deba introducir datos por teclado, es posible utilizar las siguientes instrucciones para leer los datos por teclado:

Scanner entrada = new Scanner(System.in); int num = entrada.nextInt();

## Sentencias condicionales

- Ejercicio 5 ej05

Definir dos variables num1 y num2 e implementar un programa que asigne un valor a cada una, y obtenga el mayor de los dos, mostrando el resultado por pantalla.

- Ejercicio 6 ej06

Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:

| Valor de IMC | Diagnóstico | | --------------------: | :------------- | | < 16 | Criterio de ingreso en hospital | | de 16 a 17 | Infrapeso | | de 17 a 18 | Bajo peso | de 18 a 25 | Peso normal (saludable) | de 25 a 30 | Sobrepeso | de 30 a 35 | Sobrepeso crónico | de 35 a 40 | Obesidad premórbida | > 40 | Obesidad mórbida

Nota 1: se recomienda el empleo de sentencias if–else anidadas.

Nota 2: Los operando (peso y altura) deben ser introducidos por teclado por el usuario.

- Ejercicio 7 ej07

Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y  división)  con  valores  numéricos  enteros.  El  usuario  debe  especificar  la operación con el primer carácter del primer parámetro de la línea de comandos: S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d para la división. Los valores de los operandos se deben indicar en el segundo y tercer parámetros.

## Bucles
- Ejercicio 8 ej08

Construir  un  programa  que  visualice  por  pantalla  todos  los  caracteres correspondientes a letras minúsculas.

- Ejercicio 9 ej09

Construir un programa que calcule el factorial de un valor numérico introducido como parámetro o argumento en la línea de comandos.![](Aspose.Words.d0a1c163-068e-46d4-8ba9-803f9aec12e0.005.png)

- Ejercicio 10 ej10

Construir un programa en el que, utilizando un bucle for, se escriba por pantalla una tabla de conversión de grados Fahrenheit a Celsius, para los valores de 0 hasta 300 grados, en intervalos de 20. La regla de conversión es la siguiente:

ªC = (5/9)(ºF - 32)

- Ejercicio 11 ej11

Definir un array bidimensional para representar una agenda semanal, donde se contemplen los 7 días de la semana y las 24 horas de cada día. Utilizar bucles for anidados para inicializar la agenda a: "No tengo planes.". Añadir "planes" a la agenda y mostrar el resultado por pantalla.

- Ejercicio 12 ej12

Implementar un programa en el que, utilizando un bucle while, se escriban por pantalla los 51 primeros números de la sucesión de Fibonacci, definida por recurrencia como sigue:

f0 = 0

f1 = 1

fn+2 = fn+1 + fn

- Ejercicio 13 ej13

Construir un programa en el que se pida al usuario dos números enteros positivos, n y m, y usando un bucle for, escriba el valor de n elevado a m.

- Ejercicio 14 ej14

Construir un programa en el que se pida al usuario un número entero positivo n (validar que lo sea), y usando un bucle while, escriba por pantalla el valor del factorial de n.

- Ejercicio 15 ej15

Construir un programa que simule el juego de la adivinanza de un número. El ordenador debe generar un número aleatorio entre 1 y 100 y el usuario tiene cinco oportunidades para acertarlo. Después de cada intento el programa debe indicarle al usuario si el número introducido por él es mayor, menor o igual al número a adivinar, y el número de intentos restantes.

Nota: para generar el valor aleatorio puede emplearse la sentencia:

int x  = (int) (100\*Math.random()+1);

## Arrays
- Ejercicio 16 ej16

Construir  un  programa  que  pida  al  usuario  una  serie  de  números  enteros, los almacene en un array, y obtenga el máximo y el mínimo de los valores almacenados.

- Ejercicio 17 ej17

Construir un programa que pida al usuario una serie de números enteros, los almacene en un array, e indique en pantalla si dicho array es capicúa, es decir, si la secuencia de sus elementos es igual vista de delante hacia atrás y de detrás hacia delante.

- Ejercicio 18 ej18

Construir un programa que pida al usuario dos vectores de números enteros v1 y v2, y que construya un nuevo vector del resultado de "concatenar" los vectores![]

v1 y v2. Es decir, colocar los elementos de v2 a continuación de los de v1 y, finalmente, mostrar el resultado de la concatenación por pantalla.

- Ejercicio 19 ej19

Construir un programa que pida al usuario dos vectores de números enteros v1 y v2, y que construya un nuevo vector v que almacene la suma de ambos vectores. El nuevo vector se ha de ajustar al vector más largo proporcionado por el usuario. Finalmente, mostrar el resultado por pantalla.

Por ejemplo, la suma de los vectores [1, 2, 3] y [1, 2, 3, 4, 5] es [2, 4, 6, 4, 5]

## Funciones
- Ejercicio 20 ej20

Crear una función que tome dos parámetros numéricos y calcule el máximo de los dos números. Crear una nueva función con el mismo nombre, que tome tres parámetros, y calcule el máximo de los tres números. Esta segunda función debe hacer uso de la primera.

- Ejercicio 21 ej21

Crear una función que tome como parámetro un número e indique si es primo

- no.

- Ejercicio 22 ej22

Crear una función que tome como parámetro un número y devuelve un array con el número de divisores primos que tiene. Recomendación: crear una nueva función o utilizar la anterior que indique si un número es primo o no.

- Ejercicio 23 ej23

Crear una función que convierte de grados Fahrenheit a Celsius.

ºC = (5/9)(ºF - 32)

## Clases

- Ejercicio 24 ej24

Verificar si una cadena de texto almacenada en una variable nif, es un NIF correcto o no. Si lo es, se mostrará por consola su parte numérica; si no lo es se mostrará el mensaje "NIF no valido". Se tendrá en cuenta lo siguiente:

- Suponer que los NIFs tienen 8 dígitos y, a continuación, una letra (no importa que sea mayúscula o minúscula).

Recomendaciones:

- Usar  el  método  length()  de  java.lang.String  para  conocer  el  número  de caracteres de una cadena de texto.
- Usar  el  método  estático  isLetter(char  c)  de  java.lang.Character  para comprobar que un carácter es una letra.
- Usar el método estático isDigit(char c) de java.lang.Character para comprobar que un carácter es un dígito.
- Usar el método substring(int inicio, int fin) de java.lang.String para obtener la parte numérica del NIF.