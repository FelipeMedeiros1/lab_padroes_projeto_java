package subsystem_cep;

import com.medeiros.singleton.SingletonEager;

public class ApiCep {
    private static ApiCep instance = new ApiCep();

    private ApiCep() {
        super();
    }

    public static ApiCep getInstance() {
        return instance;
    }

    public String getCity(String cep){
        return "São Paulo";
    }

    public String getState(String cep){
        return "SP";
    }
}
