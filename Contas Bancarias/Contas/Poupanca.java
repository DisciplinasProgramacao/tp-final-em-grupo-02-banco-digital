import java.util.Calendar;
import java.util.Date;


public abstract class ContaPoupanca extends Cliente {

    private double taxaRendimento = 1.60;
    private double taxaRendimentoF;
    private int diaRendimento = 1;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public Double calcRendimento(double taxaRendimento){      
        Calendar hoje = Calendar.getInstance();        
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            //saldo += saldo * taxaRendimento;
            taxaRendimentoF = this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
        }
        return taxaRendimento;
    }
}
