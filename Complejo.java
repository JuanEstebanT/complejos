import java.util.Scanner; 
public class Complejo{

float real;
float imag;

Complejo suma(Complejo c){
  Complejo res=new Complejo();
  res.real=this.real+c.real;
  res.imag=this.imag+c.imag;
  return res;
}

/*Complejo modulo(Complejo c){
  Complejo res=new Complejo();
  res.real=Math.pow(this.real,2);
  res.imag=Math.pow(this.imag,2);
  res.mod=Math.sqrt(res.real+res.imag);
  return res;
}*/

Complejo resta(Complejo c){
  Complejo res=new Complejo();
  res.real=this.real-c.real;
  res.imag=this.imag-c.imag;
  return res; 
}

Complejo mult(Complejo c){
  Complejo res=new Complejo();
  res.real=(this.real*c.real)-(this.imag*c.imag);
  res.imag=(this.real*c.imag)+(this.imag*c.real);
  return res;
}

Complejo conjugado(Complejo c){
  Complejo res=new Complejo();
  res.real = this.real;
  res.imag = this.imag *-1;
  return res;
}

/*Complejo division(Complejo c){
  Complejo den=new Complejo();
  Complejo num=new Complejo();
  Complejo res=new Complejo();
  num=mult(c,conjugado(c1));
  den=mult(c1,conjugado(c1));
  res.real=num.real/den.real;
  res.imag=num.imag/den.real;
  return res;
}*/

Complejo leer(){
  Scanner s=new Scanner(System.in);
  Complejo c=new Complejo();
  this.real=s.nextFloat();
  this.imag=s.nextFloat();
  return c;
}

void imprimir(Complejo c){
  if(this.real==0){
    if(this.imag==0){
      System.out.println("0");
    }else{
      System.out.println(this.imag+"i");
    }
  }else if(this.imag==0){
    System.out.println(this.real);
  }else if(this.imag<0){
    System.out.println(this.real+""+this.imag+"i");
  }else{
    System.out.println(this.real+"+"+this.imag+"i");
  }
}


}