package br.com.heiderlopes.propagandafragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PropagandaFragment extends Fragment {

    private static final String URL = "http://www.heiderlopes.com.br/blog";

    public PropagandaFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_propaganda, container);
        Button buttonCliqueAqui = (Button) view.findViewById(R.id.btCliqueAqui);
        buttonCliqueAqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSite();
            }
        });

        return view;
    }

    private void abrirSite() {
        Uri uriVideo = Uri.parse(URL);
        Intent intent = new Intent(Intent.ACTION_VIEW, uriVideo);
        startActivity(intent);
    }
}
