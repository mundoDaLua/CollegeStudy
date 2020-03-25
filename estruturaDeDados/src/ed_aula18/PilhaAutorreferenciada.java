package ed_aula18;

import ed_aula11.Item;

public class PilhaAutorreferenciada {

    private Celula topoPilha;
    private int tamanhoPilha;

    // Construtor padrão de uma PilhaAutorreferenciada, inicializada com tamanhoPilha zero e topoPilha vazio.
    public PilhaAutorreferenciada() {
        this.topoPilha = null;
        this.tamanhoPilha = 0;
    }

    // Verifica se a PilhaAutorreferenciada está vazia
    public boolean isEmpty() {
        return this.topoPilha == null;
    }

    // Retorna o tamanhoPilha
    public int getTamanhoPilha() {
        return this.tamanhoPilha;
    }

    /*
     * Atribui o Item que antes estava no topo à proximaCelula
     * Adiciona um novo Item ao topoPilha da PilhaAutorreferenciada
     * Aumenta em uma unidade o tamanhoPilha
     */
    public void push(Item novo) {
        Celula proximaCelula = this.topoPilha;
        this.topoPilha = new Celula();
        this.topoPilha.item = novo;
        this.topoPilha.proximo = proximaCelula;
        this.tamanhoPilha++;
    }

    /*
     * Método auxiliar privado que é usado para remover um Item
     * Se a PilhaAutorreferenciada estiver vazia, devolve um erro
     * Atribui ao itemAntigo (Aquele que será desempilhado) o Item que estava no topoPilha
     * Atribui ao topoPilha o proximo Item referenciado na Celula topoPilha (removendo o itemAntigo)
     * Reduz o tamanhoPuilha em uma unidade
     * Retorna o itemAntigo
     */
    private Item popItem() throws Exception {
        if (isEmpty()) {
            throw new Exception("    Erro: A pilha está vazia.");
        }
        Item itemAntigo = this.topoPilha.item;
        this.topoPilha = this.topoPilha.proximo;
        this.tamanhoPilha--;
        return itemAntigo;
    }

    // Retorna uma String do conteúdo do itemAntigo removido
    public String pop() {
        try {
            Item itemAntigo = popItem();
            return "    Nome: " + itemAntigo.getDescricao() +
                    "\n    Quantidade: " + itemAntigo.getQuantidade() +
                    "\n    Prioridade: " + itemAntigo.getPrioridade();
        } catch (Exception e) {
            return "    Erro: A pilha está vazia.";
        }
    }

}
