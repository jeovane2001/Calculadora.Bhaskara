import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Escreva uma descrição da classe BhaskaraController aqui.
 * 
 * @author jeovane2001 
 * @version 02/05/2024
 */
public class BhaskaraController
{
   Bhaskaraview bhaskaraview;
   Stage stage;
   Bhaskara bhaskara;
   public TextField a;
   public TextField b;
   public TextField c;
   public Label Resultado;
    
    /**
     * Construtor para objetos da classe BhaskaraContoller
     */
    public BhaskaraController()
    {
        this.stage = new Stage();
        this.bhaskaraview = new Bhaskaraview();
        this.bhaskaraview.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.bhaskaraview.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double a1 = Double.parseDouble(a.getText());
            double b1 = Double.parseDouble(b.getText());
            double c1 = Double.parseDouble(c.getText());
            Bhaskara bhaskara = new Bhaskara( a1, b1 ,c1);
            this.Resultado.setText(bhaskara.CalcularBhaskara());
        } catch (NumberFormatException exception) {
            Resultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        a.setText("");
        b.setText("");
        c.setText("");
        Resultado.setText("");
    }    
}