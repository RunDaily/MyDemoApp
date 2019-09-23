package legong.sophist.com.app.recycler_holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import legong.sophist.com.app.R;
import legong.sophist.com.app.entity.CellData;
import legong.sophist.com.app.entity.HeadData;

public class HeadHolder extends CellHolder<HeadData> {


    @Override
    public void setData(HeadData data) {

    }

    @Override
    public int layoutRes() {
        return R.layout.head_item;
    }

    public HeadHolder(@NonNull View itemView) {
        super(itemView);
    }
}
