package com.example.checkapartment;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.bumptech.glide.Glide;
import com.example.checkapartment.MVPCalculo.ICalculo;
import com.example.checkapartment.MVPCalculo.PresentadorCalculo;
import com.example.checkapartment.MVPLogin.Presentador;
import com.example.checkapartment.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment implements ICalculo {
    private FragmentSecondBinding binding;
    private String nombreEdificio;
    private String departamento;
    private String direccion;
    private String imagen;
    private PresentadorCalculo presentadorCalculo;
    private int terminaciones;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentSecondBinding.inflate(inflater,container,false);
        binding.tvNameEdificio.setText(nombreEdificio);
        Glide.with(getContext()).load(imagen).centerCrop().into(binding.imageView);
        binding.tvNumDepartamento.setText(departamento);
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!= null){
            nombreEdificio = getArguments().getString("Nombre Edificio");
            departamento = getArguments().getString("Departamento");
            direccion = getArguments().getString("Direccion");
            imagen = getArguments().getString("image");
        }
    presentadorCalculo = new PresentadorCalculo(this);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int radioGroup;
        binding.btEnviarAlerta.setEnabled(false);
        binding.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                View radioButton = binding.radioGroup.findViewById(checkedId);
                int index = binding.radioGroup.indexOfChild(radioButton);
                String texto = " ";
                int luces;
                int dormitorio;
                int banio;
                int cocina;
                switch (index){
                    case 0:
                        if (binding.cbLuces.isChecked()){
                            luces = 10;
                        }else {
                            luces = 0;
                        }
                        if (binding.cbBanio.isChecked()) {
                            banio = 40;
                        }else {
                            banio = 0;
                        }
                        if (binding.cbCocina.isChecked()){
                            cocina = 30;
                        }else {
                            cocina = 0;
                        }
                        if (binding.cbDormitorio.isChecked()) {
                            dormitorio = 20;
                        }else {
                            dormitorio = 0;
                        }
                        terminaciones = 3;
                        calculoRevision(luces, dormitorio, cocina, banio, terminaciones);
                        texto = getString(R.string.puntaje,String.valueOf(resultadoCalculo()));
                        binding.tvPuntajeObtenido.setText(texto);

                        break;
                    case 1:
                        if (binding.cbLuces.isChecked()){
                            luces = 10;
                        }else {
                            luces = 0;
                        }
                        if (binding.cbBanio.isChecked()) {
                            banio = 40;
                        }else {
                            banio = 0;
                        }
                        if (binding.cbCocina.isChecked()){
                            cocina = 30;
                        }else {
                            cocina = 0;
                        }
                        if (binding.cbDormitorio.isChecked()) {
                            dormitorio = 20;
                        }else {
                            dormitorio = 0;
                        }
                        terminaciones = 2;
                        calculoRevision(luces, dormitorio, cocina, banio, terminaciones);
                        texto = getString(R.string.puntaje,String.valueOf(resultadoCalculo()));
                        binding.tvPuntajeObtenido.setText(texto);
                        break;
                    case 2:
                        if (binding.cbLuces.isChecked()){
                            luces = 10;
                        }else {
                            luces = 0;
                        }
                        if (binding.cbBanio.isChecked()) {
                            banio = 40;
                        }else {
                            banio = 0;
                        }
                        if (binding.cbCocina.isChecked()){
                            cocina = 30;
                        }else {
                            cocina = 0;
                        }
                        if (binding.cbDormitorio.isChecked()) {
                            dormitorio = 20;
                        }else {
                            dormitorio = 0;
                        }
                        terminaciones = 1;
                        calculoRevision(luces, dormitorio, cocina, banio, terminaciones);
                        texto = getString(R.string.puntaje,String.valueOf(resultadoCalculo()));
                        binding.tvPuntajeObtenido.setText(texto);
                        break;
                    default:
                        terminaciones = 0;
                        break;
                }
                if (resultadoCalculo() < 130){
                    binding.tvPuntajeObtenido.setBackgroundColor(Color.RED);
                    binding.tvPuntajeObtenido.setTextColor(Color.WHITE);
                    binding.btEnviarAlerta.setEnabled(true);
                } else{
                    binding.tvPuntajeObtenido.setBackgroundColor(Color.WHITE);
                    binding.tvPuntajeObtenido.setTextColor(Color.BLACK);
                    binding.btEnviarAlerta.setEnabled(false);
                }
            }
        });
        binding.btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"El resultado es "
                        + String.valueOf(resultadoCalculo()),Toast.LENGTH_LONG).show();
            }
        });
        binding.btEnviarAlerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto: "));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ernesto.olavarria@gmail.com"});
                startActivity(intent);
            }
        });
    }

    @Override
    public void calculoRevision(int luces, int dormitorio, int cocina, int banio, int terminaciones) {
        presentadorCalculo.calculoRevision(luces, dormitorio, cocina, banio, terminaciones);

    }

    @Override
    public int resultadoCalculo() {
        return presentadorCalculo.resultadoCalculo();
    }


}