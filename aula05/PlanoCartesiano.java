class PlanoCartesiano {
  float _x;
  float _y;
  String quadrante = "Nenhum quadrante";

  public PlanoCartesiano(float x, float y) {
    _x = x;
    _y = y;
  }

  public void verificarQuadrante() {
    if(_x > 0 && _y > 0) {
      quadrante = "1° Quadrante";
    } else if (_x < 0 && _y > 0) {
      quadrante = "2° Quadrante";
    } else if (_x < 0 && _y < 0 ) {
      quadrante = "3° Quadrante";
    } else if (_x > 0 && _y < 0) {
      quadrante = "4° Quadrante";
    }
  }

  public void mostrarQuadrante() {
    System.out.println(quadrante);
  }
  

  public static void main(String[] args) {
     PlanoCartesiano plano = new PlanoCartesiano(1, 2);

    plano.verificarQuadrante();
    plano.mostrarQuadrante();
  }
}
