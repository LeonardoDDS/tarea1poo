package unam.poo.leonardo.tarea1poo;
public class Tarea1POO {
    public static void main(String[] args) {
        //lenght()
        String s = "Hola";
        int x = s.length();
        System.out.println(x);
        System.out.println("-----");
        
        //isEmpty()
        String s1 = "Hola";
        boolean b1 = s1.isEmpty();
        System.out.println(b1);
        String s2 = "";
        boolean b2 = s2.isEmpty();
        System.out.println(b2);
        System.out.println("-----");
        
        //equals()
        String z = "Hola";
        String y = "Hola";
        if (z.equals(y)){
            System.out.println("Si pasa por aquí");
        }
        System.out.println("-----");
        
        //indexOf(), lastIndexOf
        String palabra = "Hola, como estas?";
        int p1 = palabra.indexOf('a');
        int p2 = palabra.lastIndexOf('a');
        System.out.println("Primera a en la posición: " + p1 + 
                "\nUltima posición de a: " + p2);
        System.out.println("-----");
        
        //Ejemplo 2 de indexOf(), lastIndexOf()
        String palabra2 = "Hola, como estas? Estas como querias?";
        int i = palabra2.indexOf("como");
        int i2 = palabra2.indexOf("estas");
        int lI = palabra2.lastIndexOf("como");
        System.out.println("Primera ocurrencia: " + i + "\nSegunda ocurrencia: " + i2 + 
                "\nUltima ocurrencia: " + lI);
        System.out.println("-----");
        
        //UpperCase, LowerCase
        String palabra3 = "Hola como estas";
        String may = palabra3.toUpperCase();
        String min = palabra3.toLowerCase();
        System.out.println("La frase en mayusculas: " +  may +  "\nLa frase en minusculas: " + min);
        System.out.println("-----");
        
        //subString
        String coord1 = palabra3.substring(0,3);
        String coord2 = palabra3.substring(5,8);
        String coord3 = palabra3.substring(10);
        System.out.println("Primer palabra: " + coord1 + "\nSegunda palabra: " + coord2 + 
                "\nTercera palabra: " + coord3);
        System.out.println("-----");
        
        //parseInt, toString
        //con enteros
        String sI = "1234";
        int pI = Integer.parseInt(sI);
        String t1 = Integer.toString(pI);
        System.out.println("pI retorna: " + pI + "\nt1 retorna: " + t1);
        
        //flotantes
        String sI2 = "1234.56";
        double d = Double.parseDouble(sI2);
        String t2 = Double.toString(d);
        System.out.println("sI2 retodna: " + sI2 + "\nt2 retorna: " + t2);
        System.out.println("-----");
        
        //clase StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("apenas le entendi a ");
        sb.append("Git Bash, ");
        sb.append("por alguna razón ");
        sb.append("se me complico");
        sb.setCharAt(1,'0');
        sb.setCharAt(3, '4');
        sb.setCharAt(6, '4');
        sb.setCharAt(14, 'O');
        System.out.println(sb);
    }
}