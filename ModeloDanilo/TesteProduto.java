package ModeloDanilo;

import ModeloDanilo.Produto;
import ModeloDanilo.Fornecedor;

public class TesteProduto {

    @Override
    public String toString() {
        return "TesteProduto []";
    }

    public static void main(final String[] args) {
        final Fornecedor forn1 = new Fornecedor("1234321", "978787887", "Zé Maria");

        final Produto produto1 = new Produto(1, "TV LCD", 3500, forn1);

        final Fornecedor forn2 = new Fornecedor("543212345", "8132314545", "Cláudio");

        final Produto produto2 = new Produto(2, "notebook", 2000, forn2);

        final Produto produto3 = new Produto(3, "impressora", 232, forn2);
    }
}