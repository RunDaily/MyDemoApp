package legong.sophist.com.app.recycler_holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import legong.sophist.com.app.R;
import legong.sophist.com.app.entity.EntryData;

public class EntryHolder extends CellHolder<EntryData> {

    @Override
    public void setData(EntryData data) {

    }

    @Override
    public int layoutRes() {
        return R.layout.entry_item;
    }

    public EntryHolder(@NonNull View itemView) {
        super(itemView);
    }
}
