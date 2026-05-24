package service;

import model.aluno;

public class Tmb {

    public double calculoTMB(aluno Aluno) {
        double tmb = 0;


        if (Aluno.getGenero().equalsIgnoreCase("Masculino")) {
            tmb = 66.47 + (13.75 * Aluno.getPeso()) + (5.0 * Aluno.getAltura()) - (6.75 * Aluno.getIdade());
        } else if (Aluno.getGenero().equalsIgnoreCase("Feminino")) {
            tmb = 655.1 + (9.56 * Aluno.getPeso()) + (1.85 * Aluno.getAltura()) - (4.68 * Aluno.getIdade());
        }

        return tmb;
    }


    int objetivo = 0;

    public int objetivo(aluno Aluno) {
        double tmb = calculoTMB(Aluno);
        if (Aluno.getObjetivo() == 1) {
            objetivo = 1;
            Aluno.setConsumoKcal(-1000);
            Aluno.setKcalTotal(Aluno.getConsumoKcal() + tmb);
        } else if (Aluno.getObjetivo() == 2) {
            objetivo = 2;
            Aluno.setConsumoKcal(1000);
            Aluno.setKcalTotal(Aluno.getConsumoKcal() + tmb);
        }
        return objetivo;
    }


    double diferencaCalculada = 0;

    public double diferença(aluno Aluno) {
        if (Aluno.getDieta().equals("Emagrecer")) {
            diferencaCalculada = Aluno.getPeso() - Aluno.getPesoIdeal();
        } else if (Aluno.getDieta().equals("Ganhar Massa")) {
            diferencaCalculada = Aluno.getPesoIdeal() - Aluno.getPeso();
        }
        Aluno.setDiferença(diferencaCalculada);

        return diferencaCalculada;

    }

    double kcalRefeiçoes;

    public double kcalRefeiçoes(aluno Aluno) {
        objetivo(Aluno);
        double tmb = calculoTMB(Aluno);
        if (Aluno.getQntRefeições() == 3/*3 refeições*/) {
            kcalRefeiçoes = Aluno.getKcalTotal() / 3;
        } else if (Aluno.getQntRefeições() == 4/*4 refeições*/) {
            kcalRefeiçoes = Aluno.getKcalTotal() / 4;
        } else {
            kcalRefeiçoes = Aluno.getKcalTotal() / 5;
        }
        return kcalRefeiçoes;
    }

    double carbo;

    public double carbo(aluno Aluno) {
        double tmb = calculoTMB(Aluno);
        if (Aluno.getDieta().equals("Emagrecer")) {
            carbo = (Aluno.getKcalTotal()) * 0.4 / 4;
        } else if (Aluno.getDieta().equals("Ganhar Massa")) {
            carbo = (Aluno.getKcalTotal() + tmb) * 0.6 / 4;
        }
        return carbo;
    }

    double gorduraBoa;
    public double gorduraBoa(aluno Aluno){
        double tmb = calculoTMB(Aluno);
        double kcalRefeições = kcalRefeiçoes(Aluno);
        gorduraBoa = ((tmb + Aluno.getConsumoKcal()) * 30 / 9) / 100;

        return gorduraBoa;
    }

    public double calcularProteina(aluno Aluno) {

        double totalProteina = Aluno.getPeso() * 2;


        Aluno.setProteina(totalProteina);

        return totalProteina;
    }

    public double calcularFibra(aluno Aluno) {

        Aluno.setFibra((Aluno.getKcalTotal() / 1000.0) *14);
     return Aluno.getFibra();
    }








}
