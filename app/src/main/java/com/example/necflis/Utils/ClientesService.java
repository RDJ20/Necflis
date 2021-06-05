package com.example.necflis.Utils;


import com.example.necflis.model.ClientesRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ClientesService {
    @GET("cliente")
    Call<ClientesRespuesta> obtenerListaClientes();


}
