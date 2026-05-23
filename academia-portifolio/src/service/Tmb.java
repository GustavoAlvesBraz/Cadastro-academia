package service;

import model.aluno;

public class Tmb {

    public double calculoTMB(aluno Aluno){
        double tmb = 0;


        if (Aluno.getGenero().equalsIgnoreCase("Masculino")){
            tmb = 66.47 + (13.75 * Aluno.getPeso()) + (5.0 * Aluno.getAltura()) - (6.75 * Aluno.getIdade());
        } else if (Aluno.getGenero().equalsIgnoreCase("Feminino")){
            tmb = 655.1 + (9.56 * Aluno.getPeso()) + (1.85 * Aluno.getAltura()) - (4.68 * Aluno.getIdade());
        }

        return tmb;
    }
        int objetivo = 0;
    public int objetivo(aluno Aluno){
        if (Aluno.getObjetivo() == 1){
            objetivo = 1;
        } else if (Aluno.getObjetivo() == 2){
            objetivo = 2;
        }
        return objetivo;
    }
    double diferencaCalculada = 0;
    public double diferença(aluno Aluno){
        if (Aluno.getDieta().equals("Emagrecer")){
            diferencaCalculada = Aluno.getPeso() - Aluno.getPesoIdeal();
        } else if (Aluno.getDieta().equals("Ganhar Massa")){
            diferencaCalculada = Aluno.getPesoIdeal() - Aluno.getPeso();
        }
        Aluno.setDiferença(diferencaCalculada);

        return diferencaCalculada;

    }




}
