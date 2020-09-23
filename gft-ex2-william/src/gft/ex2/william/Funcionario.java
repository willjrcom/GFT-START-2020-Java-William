
package gft.ex2.william;

public class Funcionario {
    double salario_inicial;
    double percentual;
    double salario_total;
    
    public Funcionario(double salario_inicial, double percentual, double salario_total) {
            super();
            this.salario_inicial = salario_inicial;
            this.percentual = percentual;
            this.salario_total = salario_total;
    }
    
    public double getSalarioInicial() {
            return salario_inicial;
    }

    public void setSalarioInicial(double salario_inicial) {
            this.salario_inicial = salario_inicial;
    }
    
    public double getPercentual() {
            return salario_inicial;
    }

    public void setPercentual(double percentual) {
            this.percentual = percentual;
    }
    
    public double getSalarioTotal() {
            return salario_total;
    }

    public void setSalarioTotal(double salario_total) {
            this.salario_total = salario_total;
    }
}
