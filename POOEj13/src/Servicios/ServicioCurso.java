/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class ServicioCurso {
    Scanner leer = new Scanner(System.in);
    public void cargarAlumnos(String[] alumnos){                
        for (int i = 0; i < 5; i++){
            alumnos[i] = leer.next();            
        }
    }
    
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        String nom = leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por día");
        int ch = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana");
        int cd = leer.nextInt();
        System.out.println("Ingrese el turno");
        String tur = leer.next();
        System.out.println("Ingrese el precio por hora");
        int ph;
        ph = leer.nextInt();
        System.out.println("Ingrese los nombres de los alumnos");
        String[] alumnos = new String [5];
        cargarAlumnos(alumnos);
        return new Curso(nom, ch, cd, tur, ph, alumnos);
    }
    
    public float gananciaSemanal(Curso c){      
      float ganancia;
      ganancia = c.getCantidadDiasPorSemana() * c.getCantidadHorasPorDia() * c.getPrecioPorHora() * 5;
      
      return ganancia;
    }
    
}
