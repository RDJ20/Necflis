package com.example.necflis.Utils;
import com.example.necflis.model.Clientes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ClientesService {

    @GET("listar")
    Call<List<Clientes>> getPersonas();

    @POST("agregar")
    Call<Clientes>addPersona(@Body Clientes clientes);

    @POST("actualizar/{id}")
    Call<Clientes>updatePersona(@Body Clientes clientes,@Path("id") int id);

    @POST("eliminar/{id}")
    Call<Clientes>deletePersona(@Path("id")int id);

}
