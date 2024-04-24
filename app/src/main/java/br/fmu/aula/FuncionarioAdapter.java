package br.fmu.aula;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.junit.runner.manipulation.Ordering;

import java.text.SimpleDateFormat;
import java.util.List;

public class FuncionarioAdapter extends RecyclerView.Adapter {
    private List<Funcionario> Funcionario;
    private Context context;



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_funcionario,parent,false);
        return new FuncionarioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        FuncionarioViewHolder funcionarioViewHolder = (FuncionarioViewHolder) holder;
        Funcionario f = funcionarios.get(position);
        FuncionarioViewHolder.re.setText(Integer.toString(f.getRE));
        FuncionarioViewHolder.nome.setText(f.getNome());
        FuncionarioViewHolder.dataadmissao.setText((dataformat));

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
