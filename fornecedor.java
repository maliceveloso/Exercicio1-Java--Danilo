public
package fornecedor;

public class Fornecedor {

    public String CNPJ;
    public String telefone;
public String nome

    public Fornecedor() {
    }

public Fornecedor(String CNPJ, String tel, String nome {
    CNPJ = CNPJ;
    telefone = telefone;
    nome= nome;
  
}

    public String getCNPJ() {
        return CNPJ;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}