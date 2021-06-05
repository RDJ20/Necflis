package com.example.necflis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.necflis.Utils.ClientesService;
import com.example.necflis.model.Clientes;
import com.example.necflis.model.ClientesRespuesta;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainoActivity extends AppCompatActivity {

    private static final String TAG="POKEDEX";
    private Retrofit retrofit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maino);

        retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        obtenerDatos();

    }


        private void obtenerDatos(){
            ClientesService service = retrofit.create(ClientesService.class);

            Call<ClientesRespuesta> clientesRespuestaCall= service.obtenerListaClientes();
            clientesRespuestaCall.enqueue(new Callback<ClientesRespuesta>() {
                @Override
                public void onResponse(Call<ClientesRespuesta> call, Response<ClientesRespuesta> response) {
                    if(response.isSuccessful()){
                        ClientesRespuesta clientesRespuesta = response.body();
                        ArrayList<Clientes> listaClientes = clientesRespuesta.getResults();

                        for(int i =0; i< listaClientes.size();i++)
                        {
                            Clientes c= listaClientes.get(i);
                            Log.i(TAG,"pokemon: "+ c.getNombre());

                        }
                    }
                    else{
                        Log.e(TAG,"OnResponse: "+ response.errorBody());
                    }
                }

                @Override
                public void onFailure(Call<ClientesRespuesta> call, Throwable t) {
                    Log.i(TAG,"OnFailure: "+ t.getMessage());
                }
            });

    }
}