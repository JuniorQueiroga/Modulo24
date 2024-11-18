package br.com.rpires.dao;

/**
 * @author queiroga
 */
public class ClienteDaoMock implements IClienteDao {

    @Override
    public String salvar() {
        return null;
    }

    @Override
    public String buscar() {
        return "Cliente encontrado";
    }

    @Override
    public String atualizar() {
        return "Cliente atualizado com sucesso";
    }

    @Override
    public String excluir() {
        return "Cliente excluído com sucesso";
    }
}
