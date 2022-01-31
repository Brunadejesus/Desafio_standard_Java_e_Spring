package dio.project_java.Facade;


import dio.project_java.Sub_System1_crm.CrmService;
import dio.project_java.Sub_System2_Cep.CepApi;

public class Facade {



    public void Facade (String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }//testeta

}


