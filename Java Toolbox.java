//Verifica que el valor ingresado sea un numero entero
public static boolean esEntero(String entrada){
  try {
      int numero = Integer.parseInt(entrada);
      return true;
  }catch (Exception e){
      //System.out.print("Error: " + e);
      return false;
  }
}


//Verifica que el valor ingresado sea un numero entero y positivo
public static boolean esPositivo(String entrada){
  if (esEntero(entrada)){
      int numero = Integer.parseInt(entrada);
      if (numero > 0){
          return true;
      } else {
          return false;
      }
  } else {
      return false;
  }
}


//Captura el teclado del usuario para los inputs
public static String ingresarEntrada(){
  Scanner valorIngresado = new Scanner(System.in);
  return valorIngresado.next();
}
