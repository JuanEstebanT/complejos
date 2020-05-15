
class Main {
    public static void main(String[] args) {

    Complejo c=new Complejo();
    Complejo c1=new Complejo();
    Complejo res=new Complejo();
    c.real=5;
    c.leer();
    c1.leer();
    res=c.suma(c1);
    res.imprimir(res);
    res=c.resta(c1);
    res.imprimir(res);
    res=c.mult(c1);
    res.imprimir(res);
    /*res=c.divison(c1);
    Complejo.imprimir(res);


    /*res=Complejo.resta(c,c1);
    Complejo.imprimir(res);
    res=Complejo.mult(c,c1);
    Complejo.imprimir(res);
    /*mult=Complejo.imprimir(mult);
    Complejo.imprimir(mult);
    division=Complejo.imprimir(division);
    Complejo.imprimir(division);*/
  }
}