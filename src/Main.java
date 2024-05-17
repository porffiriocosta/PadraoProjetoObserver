
import Models.Temperatura;
import Models.TermometroFahrenheit;
import Models.TermometroCelsius;

public class Main {
    public static void main(String[] args) {

        Temperatura t = new Temperatura();

        t.addObserver(new TermometroCelsius());
        t.addObserver(new TermometroFahrenheit());

        t.setTemp(100.0); // muda temperatura; logo, observadores são notificados
    }
}