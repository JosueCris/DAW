package Tablas;

public class Cursos {
    private int nrc;
    private int materia;
    private int profesor;
    private int semestre;
    private String horario;
    private int cupo;

    public Cursos(int nrc, int materia, int profesor, int semestre, String horario, int cupo) {
        this.nrc = nrc;
        this.materia = materia;
        this.profesor = profesor;
        this.semestre = semestre;
        this.horario = horario;
        this.cupo = cupo;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public int getMateria() {
        return materia;
    }

    public void setMateria(int materia) {
        this.materia = materia;
    }

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "nrc=" + nrc +
                ", materia=" + materia +
                ", profesor=" + profesor +
                ", semestre=" + semestre +
                ", horario='" + horario + '\'' +
                ", cupo=" + cupo +
                '}';
    }
}
