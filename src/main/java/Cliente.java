public class Cliente {
    private String nome;
    private boolean presente;


    public Cliente(String nome, boolean presente){
        this.nome = nome;
        this.presente = presente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
}
