import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Controller {

    private Calc calculator;

    public Controller(Calc calculator) {
        this.calculator = calculator;
        ReadFile();
    }

    public void ReadFile() {
        String filePath = "datos.txt";   

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) { 
                double outcome = calculator.operate(line);
                System.out.println(outcome);
            } 
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
        catch(IOException e) {
            System.out.println("algo salio mal");
        }
    }
}
