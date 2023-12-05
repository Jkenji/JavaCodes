public class Personagem {
    private String nome;
    private int vida;
    private int energia;
    private int dano;

    public Personagem(String nome) {
        setNome(nome);
        this.vida = 0;
        this.energia = 0;
    }

    public Personagem(String nome, int vida, int energia, int dano) {
        setNome(nome);
        setVida(vida);
        setEnergia(energia);
        setDano(dano);
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int getDano() {
        return dano;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public void setVida(int vida) {
        if (vida >= 0) {
            this.vida = vida;
        }
    }

    public void setEnergia(int energia) {
        if (energia >= 0) {
            this.energia = energia;
        }
    }

    public void setDano(int dano) {
        if (dano >= 0) {
            this.dano = dano;
        }
    }

    public void atacar(Personagem alvo) {
        int danoCausado = 0;
        int energia = this.energia;
        while (energia > 0 && alvo.getVida() > 0) {
            alvo.setVida(alvo.getVida() - this.dano);
            energia -= 1;
            danoCausado += this.dano;
        }
        System.out.printf("%s deu uma bicuda no %s e causou %d de\ndano\n\n", this.nome, alvo.getNome(),
                danoCausado);

    }
}
