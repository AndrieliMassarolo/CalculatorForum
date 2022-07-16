package me.ads.calculatorforum.operacoesrealizadas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import me.ads.calculatorforum.R;

public class MainFragment extends Fragment {

    public MainFragment() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.operacoesrealizadas, container, false);

        if (savedInstanceState == null) {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_medicamentos, new ListarFragment()).commit();
        }


        Button btnListar = v.findViewById(R.id.button_listar_medicamentos);
        // handler do botão listar
        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_medicamentos, new ListarFragment()).commit();
            }
        });
        return v;
    }
}