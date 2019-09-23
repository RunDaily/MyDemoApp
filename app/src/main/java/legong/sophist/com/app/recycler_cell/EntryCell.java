package legong.sophist.com.app.recycler_cell;

import android.util.Log;

import legong.sophist.com.app.entity.EntryData;
import legong.sophist.com.app.recycler_holder.EntryHolder;

/**
 * holder和Data绑定的逻辑
 */
public class EntryCell implements ItemCell<EntryHolder,EntryData> {
    @Override
    public void onBindViewHolder(EntryHolder holder, EntryData data) {

//        Log.d("TAG", "onBindViewHolder: --->"+data.getType());
    }
}
