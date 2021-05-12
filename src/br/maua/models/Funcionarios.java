package br.maua.models;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.enumeracoes.TiposMembros;
import br.maua.interfaces.PostarMensagem;

import java.util.ArrayList;

/**
 * Classe concreta para implementar um array de usuários do sistema que implementa PostarMensagem para os usuarios se comunicarem.
 * @author Gabriel de Godoy Braz e Matheus Vivas - 17.00163-3/17.04401-4
 */

public class Funcionarios implements PostarMensagem{
    private String usuario;
    private String email;
    private TiposMembros tiposMembros;
    private HorarioSistema horarioSistema;

    /**
     * @param usuario Identificação do usuário.
     * @param email Meio de contato com o usuário.
     * @param tiposMembros Cargo dentro da empresa do usuário.
     */
    public Funcionarios(String usuario, String email, TiposMembros tiposMembros) {
        this.usuario = usuario;
        this.email = email;
        this.tiposMembros = tiposMembros;
        this.horarioSistema = HorarioSistema.NORMAL;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }

    public TiposMembros getTiposMembros() {
        return tiposMembros;
    }

    public void setHorarioSistema(HorarioSistema horarioSistema) {
        this.horarioSistema = horarioSistema;
    }

    public HorarioSistema getHorarioSistema() {
        return horarioSistema;
    }

    @Override
    public String toString() {
        return "\nNome de Usuario: " + usuario +
                "\nE-mail: " + email +
                "\nCargo: " + tiposMembros;
    }

    /**
     * @param funcionarios Override para o arraylist de funcionários
     */
    @Override
    public void mensagem(ArrayList<Funcionarios> funcionarios) {
        for(int i = 0; i < funcionarios.size(); i++) {
            TiposMembros tiposMembros = funcionarios.get(i).getTiposMembros();
            //Por favor não nos julgue pelos atos contra a humanidade a seguir:
            if(tiposMembros == TiposMembros.MOBILEMEMBERS && horarioSistema == HorarioSistema.NORMAL){
                System.out.println(funcionarios.get(i).getUsuario() + " - HAPPY CODING!\n");
            }else if(tiposMembros == TiposMembros.MOBILEMEMBERS && horarioSistema == HorarioSistema.EXTRA){
                System.out.println(funcionarios.get(i).getUsuario() + " - Happy_C0d1ng. Maskers\n");
            }else if(tiposMembros == TiposMembros.HEAVYLIFTERS && horarioSistema == HorarioSistema.NORMAL){
                System.out.println(funcionarios.get(i).getUsuario() + " - Podem contar conosco!\n");
            }else if(tiposMembros == TiposMembros.HEAVYLIFTERS && horarioSistema == HorarioSistema.EXTRA){
                System.out.println(funcionarios.get(i).getUsuario() + " - N00b_qu3_n_Se_r3pita.bat\n");
            }else if(tiposMembros == TiposMembros.SCRIPTGUYS && horarioSistema == HorarioSistema.NORMAL){
                System.out.println(funcionarios.get(i).getUsuario() + " - Prazer em ajudar novos amigos de código!\n");
            }else if(tiposMembros == TiposMembros.SCRIPTGUYS && horarioSistema == HorarioSistema.EXTRA){
                System.out.println(funcionarios.get(i).getUsuario() + " - QU3Ro_S3us_r3curs0s.py\n");
            }else if(tiposMembros == TiposMembros.BIGBROTHERS && horarioSistema == HorarioSistema.NORMAL){
                System.out.println(funcionarios.get(i).getUsuario() + " - Sempre ajudando as pessoas membros ou não S2!\n");
            }else if(tiposMembros == TiposMembros.BIGBROTHERS && horarioSistema == HorarioSistema.EXTRA){
                System.out.println(funcionarios.get(i).getUsuario() + " - ...\n");
            }
        }
    }
}
