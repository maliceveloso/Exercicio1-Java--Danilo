package ModeloDanilo;

public class Produto {
    private int codigo;
    private String nome;
    private float valor;
    private Fornecedor Fornecedor;

    public Produto() {
    }

    public Produto(int codigo, String nome, float valor, Fornecedor Fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.Fornecedor = Fornecedor;
    }

    public boolean atualizarPreco(float vpercentual, float aumento) {
        aumento = vpercentual / 100;
        if (vpercentual > 0) {
            vpercentual += (vpercentual * aumento);
            return true;
        } else {
            return false;
        }

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(Fornecedor Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

}
