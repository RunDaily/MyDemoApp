package legong.sophist.com.app.recycler_cell;

import android.util.Log;

import legong.sophist.com.app.entity.CellData;
import legong.sophist.com.app.entity.HeadData;
import legong.sophist.com.app.recycler_holder.CellHolder;
import legong.sophist.com.app.recycler_holder.HeadHolder;

/**
 * holder和Data绑定的逻辑
 */
public class HeadCell implements ItemCell<HeadHolder,HeadData> {
    @Override
    public void onBindViewHolder(HeadHolder holder, HeadData data) {
//        Log.d("TAG", "onBindViewHolder: --->"+data.getType());

    }
}
