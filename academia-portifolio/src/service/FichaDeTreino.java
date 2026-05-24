package service;

public class FichaDeTreino {

    public static void treino(){

        String[][] fichaTreino = {
                {"segunda", "Supino reto", "Supino inclinado", "voador", "Pullover", "Desenvolvimento barra",
                        "Elevação lateral", "Elevação frontal", "Triceps testa", "Triceps pulley", "triceps francês"},

                {"quarta", "Puxador Costas", "Puxador Frente", "Remada Unilateral", "Encolhimento Ombro", "Remada alta",
                        "Remada atrás das Costas", "Rosca Direta", "Rosca Concentrada", "Rosca Alternada", "Schott"},

                {"sexta","Cadeira extensora", "Agachamento Hack", "Stiff", "Cama flexora", "Leg 45", "Gêmeos plantar",
                        "Gêmeos sentado", "Abdutor", " ", " "}
        };

        System.out.println("\n=================================================================================");
        System.out.println("                              FICHA DE TREINOS                                   ");
        System.out.println("=================================================================================");

        //Imprime os cabeçalhos das colunas em letras maiúsculas e alinhados
        // %-26s reserva exatamente 26 caracteres de largura para cada coluna
        System.out.printf("%-26s %-26s %-26s\n", "SEGUNDA", "QUARTA", "SEXTA");
        System.out.println("---------------------------------------------------------------------------------");


        for (int i = 1; i <= 10; i++) {

            System.out.printf("%-26s %-26s %-26s\n", fichaTreino[0][i], fichaTreino[1][i], fichaTreino[2][i]);
        }

        System.out.println("=================================================================================");
        System.out.println("Plano de treino e dieta para os próximos seis meses");
    }

    }




