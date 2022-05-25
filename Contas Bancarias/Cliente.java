public class Cliente {
    
    private String nomeCliente;
    private String cpf;
    private String Senha;
    private double saldo;


    public Cliente(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    /**
     * @return nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente nomeCliente
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    /**
     * @return cpf
     */
    public String getcpf() {
        return cpf;
    }

    /**
     * @param cpf cpf
     */
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    /**
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String gerarExtrato() {
        String s = "Conta Bancaria[";
        s += " nomeCliente: " + nomeCliente;
        s += "; cpf: " + cpf; 
        s += "; saldo: " + saldo;
        s += "]" ;
        return s; 
    }

}
