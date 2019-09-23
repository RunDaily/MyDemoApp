package legong.sophist.com.app.recycler_cell;

import legong.sophist.com.app.entity.CellData;
import legong.sophist.com.app.recycler_holder.CellHolder;

public interface ItemCell<VH extends CellHolder, T extends CellData> {

    void onBindViewHolder(VH holder, T data);

}
