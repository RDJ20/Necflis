package com.example.necflis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.necflis.Utils.ClientesService;
import com.example.necflis.model.Clientes;
import com.example.necflis.model.ClientesRespuesta;

import java.util.ArrayList;
import java.util.List;

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
                .baseUrl("http://192.168.0.197:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        obtenerDatos();

    }
    private void obtenerDatos(){
        ClientesService service = retrofit.create(ClientesService.class);

    Call<List<Clientes>> clientesRespuestaCall= service.obtenerListaClientes();
            clientesRespuestaCall.enqueue(new Callback<List<Clientes>>() {
        @Override
        public void onResponse(Call<List<Clientes>> call, Response<List<Clientes>> response) {
            if(response.isSuccessful()){
                //ClientesRespuesta clientesRespuesta = response.body();
                Log.i(TAG,"pokemon: "+ response.body().get(0).getNombre());
                //ArrayList<Clientes> listaClientes = clientesRespuesta.getResults();

                        /*for(int i =0; i< listaClientes.size();i++)
                        {
                            Clientes c= listaClientes.get(i);
                            Log.i(TAG,"pokemon: "+ c.getNombre());
                        }*/
            }
            else{
                Log.e(TAG,"OnResponse: "+ response.errorBody());
            }
        }

        @Override
        public void onFailure(Call<List<Clientes>> call, Throwable t) {
            Log.i(TAG,"OnFailure: "+ t.getMessage());
        }
    });












}
































}