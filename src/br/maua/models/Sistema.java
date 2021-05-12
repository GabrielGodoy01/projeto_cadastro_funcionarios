package br.maua.models;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.enumeracoes.TiposMembros;
import br.maua.interfaces.PostarMensagem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe responsável pelo sistema principal do programa.
 *      Trabalha com um sistema de looping switch case no método run para intefaciar com o usuário até onde ele quiser.
 * @author Gabriel de Godoy Braz e Matheus Vivas - 17.00163-3/17.04401-4
 */

public class Sistema{
    public static void run(){

        ArrayList<Funcionarios> funcionarios = new ArrayList<>();

        int principal = 1;

        do{
            System.out.println("1 - CADASTRAR UM NOVO MEMBRO");
            System.out.println("2 - APRESENTAÇÃO DOS MEMBROS CADASTRADOS");
            System.out.println("3 - DEIXAR UM COLABORADOR IR");
            System.out.println("4 - TROCAR A JORNADA DE TRABALHO");
            System.out.println("5 - POSTAR MENSAGENS");
            System.out.println("0 - SAIR DO SISTEMA");

            Scanner scanner = new Scanner(System.in);
            principal = scanner.nextInt();

            switch (principal) {
                case 0:
                    break;
                    
                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.next();
                    System.out.println("E-mail: ");
                    String email = scanner.next();
                    System.out.println("Cargo: ");
                    System.out.println("1 - MOBILE MEMBERS");
                    System.out.println("2 - HEAVY LIFTERS");
                    System.out.println("3 - SCRIPT GUYS");
                    System.out.println("4 - BIG BROTHERS");
                    int cargo = scanner.nextInt();
                    if(cargo == 1){
                        funcionarios.add(new Funcionarios(nome,email,TiposMembros.MOBILEMEMBERS));
                    }else if (cargo == 2){
                        funcionarios.add(new Funcionarios(nome,email,TiposMembros.HEAVYLIFTERS));
                    }else if (cargo == 3){
                        funcionarios.add(new Funcionarios(nome,email,TiposMembros.SCRIPTGUYS));
                    }else if (cargo == 4){
                        funcionarios.add(new Funcionarios(nome,email,TiposMembros.BIGBROTHERS));
                    }
                    break;
                    
                case 2:
                    for(int i = 0; i < funcionarios.size(); i++) {
                        System.out.println(funcionarios.get(i).toString());
                    }
                    break;

                case 3:
                    for(int i = 0; i < funcionarios.size(); i++) {
                        System.out.println(i + " - " + funcionarios.get(i).getUsuario());
                    }
                    int remove = scanner.nextInt();
                    funcionarios.remove(remove);
                    break;

                case 4:
                    System.out.println("0 - Horário Normal");
                    System.out.println("1 - Horário EXTRA");
                    int alterar = scanner.nextInt();
                    if(alterar == 0) {
                        for(int i = 0; i < funcionarios.size(); i++) {
                            funcionarios.get(i).setHorarioSistema(HorarioSistema.NORMAL);
                        }
                        System.out.println("A jornada esta setada em NORMAL");
                    }else if(alterar == 1) {
                        for(int i = 0; i < funcionarios.size(); i++) {
                            funcionarios.get(i).setHorarioSistema(HorarioSistema.EXTRA);
                        }
                        System.out.println("A jornada esta setada em EXTRA");
                    }
                    break;

                case 5:
                    int i = 0;
                    funcionarios.get(i).mensagem(funcionarios);
                    break;
            }
        } while(principal != 0);
    }
}

