package herencia;

public class Alumno extends Persona{
    int legajo;

    public Alumno(){
    }

    public Alumno(int legajo) {
        edad = super.edad;
        this.legajo = legajo;


    }
}
