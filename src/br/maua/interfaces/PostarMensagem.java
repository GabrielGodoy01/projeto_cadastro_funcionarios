package br.maua.interfaces;

import br.maua.models.Funcionarios;

import java.util.ArrayList;

/**
 * Interface que tem por objetivo printar mensagens de todos os funcionários da empresa.
 * @author Gabriel de Godoy Braz e Matheus Vivas - 17.00163-3/17.04401-4
 */

public interface PostarMensagem {
    void mensagem(ArrayList<Funcionarios> funcionarios);
}
