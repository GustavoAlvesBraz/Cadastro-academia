package model;

public class aluno {

    //dados de cadastro
    private String nome = "";
    private String sobrenome = "";
    private double altura;
    private double peso;
    private int idade;
    private String genero = "";
    private int objetivo;
    private double pesoIdeal;
    private int qntRefeições;

    private String dieta;
    private double diferença;



    //dados da dieta
    private double proteina;
    private double consumoKcal;
    private double kcalTotal;
    private double fibra;

    //comandos para settar e gettar nome
    public String getNome() { return nome;} //aqui eu guardo permito guardar no nome
    public void setNome(String nome) {this.nome = nome;}
    //comandos para settar e gettar sobrenome = os de nome
    public String getSobrenome() {return sobrenome;} //gettei dnv a string, ok
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}
    //settar e gettar altura
    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}
    //settar peso
    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}
    //Settar idade
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
    //settar genero
    //Agora aprendi que o IDEA cria esses construtores sozinho
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    //refeições
    public int getQntRefeições() {
        return qntRefeições;
    }
    public void setQntRefeições(int qntRefeições) {
        this.qntRefeições = qntRefeições;
    }


    public int getObjetivo() {return objetivo;}
    public void setObjetivo(int objetivo) {this.objetivo = objetivo;}

    public double getPesoIdeal() {
        return pesoIdeal;
    }
    public void setPesoIdeal(double pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public String getDieta() {
        return dieta;
    }
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public double getDiferença() {
        return diferença;
    }
    public void setDiferença(double diferença) {
        this.diferença = diferença;
    }

    public double getProteina() {
        return proteina;
    }
    public void setProteina(double proteina) {
        this.proteina = proteina;
    }

    public double getConsumoKcal() {
        return consumoKcal;
    }
    public void setConsumoKcal(double consumoKcal) {
        this.consumoKcal = consumoKcal;
    }

    public double getKcalTotal() {
        return kcalTotal;
    }

    public void setKcalTotal(double kcalTotal) {
        this.kcalTotal = kcalTotal;
    }

    public double getFibra() {
        return fibra;
    }

    public void setFibra(double fibra) {
        this.fibra = fibra;
    }
}

