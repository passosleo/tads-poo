class Paciente {
  // atributos
  String _nome;
  String _endereco;
  String _nascimento;
  String _cpf;
  String _prontuario;

  public void mostrarProntuario() {
    System.out.printf("Nome: %s \n", _nome);
    System.out.printf("Endereço: %s \n", _endereco);
    System.out.printf("Nascimento: %s \n", _nascimento);
    System.out.printf("CPF: %s \n", _cpf);
    System.out.printf("Prontuário: %s \n", _prontuario);
  }

  public boolean cadastrarPaciente(String nome, String endereco, String nascimento, String cpf) {
    if (nome == "") {
      return false;
    } else {
      _nome = nome;
    }

    _endereco = endereco;
    _nascimento = nascimento;
    _cpf = cpf;

    return true;
  }

  public static void main(String[] args) {
    Paciente paciente = new Paciente();

    boolean sucesso = paciente.cadastrarPaciente("José", "Rua X", "01/01/19", "123.456.789-00");

    if (sucesso) {
      System.out.println("Paciente cadastrado com sucesso!");
      paciente.mostrarProntuario();
    } else {
      System.out.println("Ocorreu um erro ao cadastrar o paciente");
    }
  }
}
