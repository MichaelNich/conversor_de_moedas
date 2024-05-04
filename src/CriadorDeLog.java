import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CriadorDeLog {
    public void salvarLog(String convertido) {
        try {
            FileWriter escrita = new FileWriter("historico.txt",true);
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            String dateTime = formatter.format(new Date());
            String logMessage = dateTime + " - " + convertido + "\n";
            escrita.write(logMessage);
            escrita.close();
        } catch (Exception e) {
            System.out.println("Houve um erro: " + e);
        }


    }
}
