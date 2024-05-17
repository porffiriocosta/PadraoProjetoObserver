package Models;

public class TermometroCelsius implements Observer {

    public void update(Subject s) { // método chamado quando o valores de uma temperatura mudam
        double temp = ((Temperatura) s).getTemp();
        System.out.println("Temperatura Celsius: " + temp);
    }

}
