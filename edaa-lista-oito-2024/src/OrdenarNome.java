import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenarNome {
    public static void main(String[] args) {
        InputStream inputStream = OrdenarNome.class.getResourceAsStream("estudantes_una_2024.csv");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            ArrayList<String> nomes = new ArrayList<>();
           
            reader.readLine();

            String linha;
            while ((linha = reader.readLine()) != null) {
                nomes.add(linha);
            }

            reader.close();
            Collections.sort(nomes);
            System.out.println("Ordenando Estudantes por Nome:");
            for (String nome : nomes) {
                System.out.println("nome: " + nome);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
