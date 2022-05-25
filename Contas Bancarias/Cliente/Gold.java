    public abstract class Gold extends Cliente {
    protected final Double TaxaMensal = 10;
    protected int pontos;
    protected Double limite = 300;


    public void setTaxaMensal(Double valorMensal) {
        this.TaxaMensal = TaxaMensal;
    }

    public ClienteGold(String nome, String cpf, String senha, Double TaxaMensal, int pontos) {
        super(nome, cpf, senha);
        this.valorMensal = valorMensal;
        this.pontos = pontos;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Double calcPontos() {
        //return pontos;
    }

    public void calcPontosMensais(int pontos) {
       // this.pontos = pontos + 10;
    }

    public Double getTaxaMensal() {
        return valorMensal;
    }

    public boolean sacLimite(double valor){        
        double saldoComLimite = this.getSaldo() + limite;
        
        if ((saldoComLimite-valor) >=0){
            this.setSaldo(this.getSaldo()-valor);
            //super.sacar(valor);
            return true;
    }

}