package view;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
import model.aluno;
import service.Tmb;

//classe para chamar no main
public class Cadastro {

    private Object pesoIdealValido;

    //public void = saida para as informações que pedi com scanner
    public void loginCadastro() {
        Scanner scan = new Scanner(System.in);


//classe do aluno novo criada
        aluno novoAluno = new aluno();
        //laço para validar o sett do usuario
        boolean nomeValido = false;
        //String temporária para validar o laço no do
        String nomeDigitado = "";


        do {
            System.out.println("Primeiro nome");
            nomeDigitado = scan.nextLine();
            if (nomeDigitado.matches("[a-zA-ZÀ-ÿ ]+")) {
                novoAluno.setNome(nomeDigitado);
                nomeValido = true;

            } else {
                System.out.println("Erro: O nome não pode conter números ou caracteres inválidos ");
                nomeValido = false;
            }

        } while (!nomeValido);

        boolean sobrenomeValido = false;
        String sobrenomeDigitado = "";
// laço do sobrenome
        do {
            System.out.println("Sobrenome");
            sobrenomeDigitado = scan.nextLine();

            if (sobrenomeDigitado.matches("[a-zA-ZÀ-ÿ ]+")) {
                novoAluno.setSobrenome(sobrenomeDigitado);
                sobrenomeValido = true;

            } else {
                System.out.println("Erro: O sobrenome não pode conter números ou caracteres inválidos ");
                sobrenomeValido = false;
            }

        } while (!sobrenomeValido);

        System.out.println("Bem-vindo! " + novoAluno.getNome() + " " + novoAluno.getSobrenome());


//laço da altura
        boolean alturaValida = false;
        double alturaDigitada;

        do {
            System.out.println("Altura em cm");

            if (scan.hasNextDouble()) {
                alturaDigitada = scan.nextDouble();
                alturaValida = true;
                if (alturaDigitada > 100) {

                    novoAluno.setAltura(alturaDigitada);
                    alturaValida = true;

                } else {
                    System.out.println("Erro: Altura só pode conter números válidos superior a 100 ");
                    alturaValida = false;
                }

            } else {
                System.out.println("Erro: Altura só pode conter números válidos superior a 100 ");
                alturaValida = false;
                scan.next();
            }

        } while (!alturaValida);
        //laço do peso

        boolean pesoValido = false;
        double pesoDigitado;

        do {
            System.out.println("Peso em Kg");

            if (scan.hasNextDouble()) {
                pesoDigitado = scan.nextDouble();
                pesoValido = true;
                if (pesoDigitado > 10) {

                    novoAluno.setPeso(pesoDigitado);
                    pesoValido = true;

                } else {
                    System.out.println("Erro: Peso só pode conter números válidos superior a 10 ");
                    pesoValido = false;
                }

            } else {
                System.out.println("Erro: Peso só pode conter números válidos superior a 10 ");
                pesoValido = false;
                scan.next();
            }

        } while (!pesoValido);

        //laço da idade
        boolean idadeValida = false;
        int idadeDigitada;

        do {
            System.out.println("Idade");

            if (scan.hasNextInt()) {
                idadeDigitada = scan.nextInt();
                idadeValida = true;
                if (idadeDigitada > 10 && idadeDigitada < 120) {

                    novoAluno.setIdade(idadeDigitada);
                    idadeValida = true;

                } else {
                    System.out.println("Erro: Idade só pode conter números válidos superior a 10 e menor que 120 ");
                    idadeValida = false;
                }

            } else {
                System.out.println("Erro: Idade só pode conter números válidos superior a 10 e menor que 120 ");
                idadeValida = false;
                scan.next();
            }

        } while (!idadeValida);

        scan.nextLine(); //limpando scanner (vi essa dica na internet)
//laço do gênero
        boolean generoValido = false;
        String generoDigitado;

        do {

            System.out.println("Insira seu gênero, sendo M - masculino F - feminino");
            generoDigitado = scan.nextLine();

            if (generoDigitado.matches("[a-zA-Z]")) {


                if (generoDigitado.equalsIgnoreCase("M")) {
                    novoAluno.setGenero("Masculino");
                    generoValido = true;
                } else if (generoDigitado.equalsIgnoreCase("F")) {
                    novoAluno.setGenero("Feminino");
                    generoValido = true;
                } else {
                    System.out.println("Erro: A letra precisa ser estritamente M ou F.");
                    generoValido = false;
                }

            } else {
                // Se cair aqui, significa que digitaram números, símbolos ou deixaram vazio
                System.out.println("Erro: Entrada inválida. Não digite números, insira apenas a letra M ou F.");
                generoValido = false;
            }

        } while (!generoValido);
        Tmb serviceTmb = new Tmb();
        double tmb = serviceTmb.calculoTMB(novoAluno);

        System.out.println("Cadastro concluído com sucesso");
        System.out.println("Aluno: " + novoAluno.getNome() + " " + novoAluno.getSobrenome());
        System.out.println("Altura: " + novoAluno.getIdade() + "cm");
        System.out.println("Peso: " + novoAluno.getPeso() + "Kg");
        System.out.println("Gênero: " + novoAluno.getGenero());
        System.out.printf("Taxa Metabólica Basal (TMB): %.2f kcal\n", tmb);
        System.out.println("===============================================================");

        System.out.println("Defina seu objetivo");
        System.out.println("1 - Emagrecer 2- Ganhar massa (digite o número (1 || 2))");
        boolean objetivoValido = false;
        int objetivoDigitado;
        do {
            if (scan.hasNextInt()) {
                objetivoDigitado = scan.nextInt();
                objetivoValido = true;
                if (objetivoDigitado == 1) {
                    novoAluno.setObjetivo(objetivoDigitado);
                    novoAluno.setDieta("Emagrecer");
                    objetivoValido = true;
                } else if (objetivoDigitado == 2) {
                    novoAluno.setObjetivo(objetivoDigitado);
                    novoAluno.setDieta("Ganhar Massa");
                    objetivoValido = true;
                } else {
                    System.out.println("Digite apenas números, entre 1 e 2");
                    objetivoValido = false;
                }
            } else {
                System.out.println("Digite apenas números, entre 1 e 2");
                scan.nextLine();
                objetivoValido = false;
            }

        } while (!objetivoValido);

        System.out.println("Qual peso gostaria de alcançar?");
        double pesoIdealDigitado;
        boolean pesoIdealValido = false;

        do {
            if (scan.hasNextDouble()) {
                pesoIdealDigitado = scan.nextDouble();
                novoAluno.setPesoIdeal(pesoIdealDigitado);
                pesoIdealValido = true;
            } else {
                System.out.println("Por favor, digite um peso válido usando apenas números.");
                scan.next();
                pesoIdealValido = false;
            }
        } while (!pesoIdealValido);

        double dif = serviceTmb.diferença(novoAluno);

        System.out.printf("Para atingir seu objetivo de %s, faltam: %.2f Kg!\n", novoAluno.getDieta(), dif);


        System.out.println("Quantas refeições por dia fará na dieta?");
        System.out.println("Digite 1: 3 refeições\nDigite 2: 4 refeições\nDigite 3: 5 refeições");

        boolean refeicaoValida = false;
        int opcaoRefeicao;

        do {
            if (scan.hasNextInt()) {
                opcaoRefeicao = scan.nextInt();

                // O switch agora lê a OPÇÃO que o usuário acabou de digitar no teclado
                switch (opcaoRefeicao) {
                    case 1:
                        novoAluno.setQntRefeições(3); // Salva o número REAL de refeições (3) no objeto
                        refeicaoValida = true;
                        break;
                    case 2:
                        novoAluno.setQntRefeições(4); // Salva o número REAL de refeições (4) no objeto
                        refeicaoValida = true;
                        break;
                    case 3:
                        novoAluno.setQntRefeições(5); // Salva o número REAL de refeições (5) no objeto
                        refeicaoValida = true;
                        break;
                    default:
                        System.out.println(" Opção inválida. Digite 1, 2 ou 3.");
                        refeicaoValida = false;
                }
            } else {
                System.out.println(" Erro: Digite apenas os números inteiros 1, 2 ou 3.");
                scan.next(); // Limpa o Scanner se digitarem letras
                refeicaoValida = false;
            }

        } while (!refeicaoValida);
    }
}
