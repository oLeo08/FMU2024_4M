package br.fmu.aula;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class FuncionarioViewHolder extends RecyclerView.ViewHolder {
    final TextView re;
    final TextView nome;
    final TextView dataadmissao;
    final TextView salario;
    public FuncionarioViewHolder ( View itemView) {
        super(itemView);
        re = itemView.findViewById(R.id.item_re);
        nome = itemView.findViewById(R.id.item_nome);
        dataadmissao = itemView.findViewById(R.id.item_dataadmissao) ;
        salario = itemView.findViewById(R.id.item_salario);
    }
}
