package com.example.necflis.Utils;


import com.example.necflis.model.Clientes;
import com.example.necflis.model.ClientesRespuesta;
import com.example.necflis.model.Personas;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface ClientesService {
    @GET("clientes")
    Call<List<Clientes>> obtenerListaClientes();



}
