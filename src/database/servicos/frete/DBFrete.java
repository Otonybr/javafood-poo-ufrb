package database.servicos.frete;

import java.util.ArrayList;

import controllers.servicos.frete.Frete;

public class DBFrete {

    ArrayList<Frete> listaDeFretes = new ArrayList<Frete>();

    // Fretes cadastrados inicialmente
    Frete fretes = new Frete(1, "Ubereats", 14, 25);
    Frete fretes1 = new Frete(2, "ifoodwalk", 10, 40);
    Frete fretes2 = new Frete(3, "motoboy", 12, 20);

    public DBFrete() {
        // adiciona os fretes pré cadastrados na array
        listaDeFretes.add(fretes);
        listaDeFretes.add(fretes1);
        listaDeFretes.add(fretes2);
    }

    // Método recebe um frete e adiciona no array de fretes do sistema
    public void adicionarFrete(Frete frete) {
        listaDeFretes.add(frete);
    }

    public void editarFrete( DBFrete fretes){
        
           
        }

    // Método listar fretes, retorna todos os fretes cadastrados no sistema
    public ArrayList<Frete> returnFretes() {
        return listaDeFretes;
    }
}
