

public class LinhaEncomenda
{
    // instance variables - replace the example below with your own
    private String referencia;
    private String descricao;
    private double preco;
    private double quantidade;
    private double imposto;
    private double desconto;

    public LinhaEncomenda() {
        this.referencia = "";
        this.descricao = "";
        this.preco = 0;
        this.quantidade = 0;
        this.imposto = 0;
        this.desconto = 0;
    }

    public LinhaEncomenda(String referencia, String descricao, double preco, double quantidade, double imposto, double desconto) {
        this.referencia = referencia;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.imposto = imposto;
        this.desconto = desconto;
    }

    public LinhaEncomenda(LinhaEncomenda l) {
        this.referencia = l.getReferencia();
        this.descricao = l.getDescricao();
        this.preco = l.getPreco();
        this.quantidade = l.getQuantidade();
        this.imposto = l.getImposto();
        this.desconto = l.getDesconto();
    }

    public String toString() {
            //StringBuilder sb = new StringBuilder("LinhaEncomenda[x: ");
            //sb.append(this.getX());
            //sb.append(",y: ");
            //sb.append(this.getY());
            //sb.append(",raio: ");
            //sb.append(this.getRaio());
            //sb.append("]");
    
            //return sb.toString();
    }

    public LinhaEncomenda clone() {
        return new LinhaEncomenda(this);
    }

    public void setReferencia(String ref) {
        this.referencia = ref;
    }
    public String getReferencia() {
        return this.referencia;
    }

    public void setDescricao(String dis) {
        this.descricao = dis;
    }
    public String getDescricao() {
        return this.descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return this.preco;
    }

    public void setQuantidade(double qt) {
        this.quantidade = qt;
    }
    public double getQuantidade() {
        return this.quantidade;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto/100;
    }
    public double getImposto() {
        return this.imposto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto/100;
    }
    public double getDesconto() {
        return this.desconto;
    }

    public double calculaValorLinhaEnc() {
        return this.getPreco() + (this.getPreco() * this.getImposto()) - (this.getPreco() * this.getDesconto());
    }

    public double calculaValorDesconto() {
        return this.getPreco() * (1 - this.getDesconto()); 
    }
   
}
