import java.util.Arrays;

public class Calculator {
    String name = "";
    float myGrades [] = {0,0,0,0,0};

    public Calculator(String name, float[] myGrades) {
        this.name = name;
        this.myGrades = myGrades;
    }

    public Calculator() {
    }

    public float getAverage(){
        float result = 0;
        for(int i = 0 ; i< myGrades.length; i++){
            result = myGrades[i] + result;
        }
        result = result / 5;
        return result;
    }

    public String giveGrade(){
        String result = "";
        if(getAverage()<= 50){
            result = "F";
        }
        else if (getAverage()>=51 && getAverage()<= 60){
            result = "E";
        }
        else if (getAverage()>= 61 && getAverage()<=70) {
            result = "D";
        }
        else if(getAverage()>= 71 && getAverage()<=80){
            result= "C";
        }
        else if(getAverage()>= 81 && getAverage()<=90){
            return "B";
        }
        else if(getAverage()>= 91 && getAverage()>=100){
            return  "A";
        }

        return result;
    }

    public void printGrades(){
        System.out.println("Nombre del estudiante: " + name);

        for(int i = 0; i>5; i++){
            System.out.println("Calificacion "+ i + "{"+ myGrades[i]+"}")
        }
        System.out.println("Promedio: {" + getAverage()+ "}");
        System.out.println("Calificación: {" + giveGrade()+ "}");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float[] getMyGrades() {
        return myGrades;
    }

    public void setMyGrades(float[] myGrades) {
        this.myGrades = myGrades;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "name='" + name + '\'' +
                ", myGrades=" + Arrays.toString(myGrades) +
                '}';
    }
}
