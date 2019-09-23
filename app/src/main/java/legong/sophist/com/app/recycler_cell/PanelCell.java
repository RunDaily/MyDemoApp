package legong.sophist.com.app.recycler_cell;
import android.util.Log;

import legong.sophist.com.app.entity.PanelData;
import legong.sophist.com.app.recycler_holder.PanelHolder;

/**
 * holder和Data绑定的逻辑
 */
public class PanelCell implements ItemCell<PanelHolder, PanelData> {

    @Override
    public void onBindViewHolder(PanelHolder holder, PanelData data) {
        Log.d("TAG", "onBind了Panel: ---> data:" + data.hashCode() + " panelPos:" + data.panelPos);
        if (holder.panelVp.getAdapter() == null)
            holder.panelVp.setAdapter(holder.adapter);

        holder.setData(data);
        holder.panelVp.setCurrentItem(data.panelPos);
    }

}
