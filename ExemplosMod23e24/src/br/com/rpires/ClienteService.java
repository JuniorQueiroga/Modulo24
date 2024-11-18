package br.com.rpires;

import br.com.rpires.dao.IClienteDao;

public class ClienteService {

    public  IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        return clienteDao.salvar();
    }

    public String buscar() {
        return clienteDao.buscar();
    }

    public String atualizar() {
        return clienteDao.atualizar();
    }

    public String excluir() {
        return clienteDao.excluir();
    }
}
