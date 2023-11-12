package text;

public class regraFormat {

    public static String formatCPF(String cpf) {
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("cpf invalido");
        }
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
    }

    public static String FormatTelefone(String telefone) {
        if (telefone.length() == 11) {
            String telefoneFormatado = "(" + telefone.substring(0,2) + ") " + telefone.substring(2,7) + "-" + telefone.substring(7);
            return telefoneFormatado;
        } else {
            throw new IllegalArgumentException("Telefone invalido");
        }
    }
}

