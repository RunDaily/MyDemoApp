package legong.sophist.com.app.recycler_holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import legong.sophist.com.app.data.DataType;
import legong.sophist.com.app.entity.CellData;

public abstract class CellHolder<T extends CellData> extends RecyclerView.ViewHolder {

    abstract public void setData(T data);

    protected abstract int layoutRes();

    public CellHolder(@NonNull View itemView) {
        super(itemView);

    }
}
