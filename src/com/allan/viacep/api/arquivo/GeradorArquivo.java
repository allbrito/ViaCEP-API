package com.allan.viacep.api.arquivo;

import com.allan.viacep.api.modelo.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {

    public void salvarJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter file = new FileWriter(endereco.cep() + ".json");
        file.write(gson.toJson(endereco));
        file.close();
    }
}
