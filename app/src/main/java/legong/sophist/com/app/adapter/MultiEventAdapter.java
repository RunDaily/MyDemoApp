package legong.sophist.com.app.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import legong.sophist.com.app.R;
import legong.sophist.com.app.config.EventItemConfig;
import legong.sophist.com.app.data.DataType;
import legong.sophist.com.app.data.DummyData;
import legong.sophist.com.app.entity.CellData;
import legong.sophist.com.app.recycler_cell.CellFactory;
import legong.sophist.com.app.recycler_cell.ItemCell;
import legong.sophist.com.app.recycler_holder.CellHolder;
import legong.sophist.com.app.recycler_holder.EntryHolder;
import legong.sophist.com.app.recycler_holder.EventHolder;
import legong.sophist.com.app.recycler_holder.HeadHolder;
import legong.sophist.com.app.recycler_holder.PanelHolder;

/**
 * 复杂Item 多Type Adapter
 */
public class MultiEventAdapter extends RecyclerView.Adapter<CellHolder> {

    private Context context;
    private List<CellData> dummyData;

    public MultiEventAdapter(Context context) {
        this.context = context;
        //直接在Adapter里拿虚拟数据
        dummyData = DummyData.getDummyData();
    }

    @NonNull
    @Override
    public CellHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        /**
         * 根据不同的布局类型加载对应的ViewHolder
         */
        View view = LayoutInflater.from(context).inflate(viewType, viewGroup, false);
        CellHolder holder = null;
        switch (viewType) {
            case R.layout.head_item:
                holder = new HeadHolder(view);
                break;
            case R.layout.panel_item:
                holder = new PanelHolder(view);
                break;
            case R.layout.entry_item:
                holder = new EntryHolder(view);
                break;
            case R.layout.event_item:
                holder = new EventHolder(view);
                break;
        }
        assert holder != null;
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CellHolder viewHolder, int position) {
        CellData data = dummyData.get(position);    //拿到一个数据
        ItemCell< CellHolder,  CellData> cell = CellFactory.getInstance().
                getCellByType(data.getType());    //根据这个数据的Type拿到一个对应类型的Cell
        cell.onBindViewHolder(viewHolder, data); //将数据与holder绑定的逻辑交给这个cell处理
    }

    @Override
    public int getItemViewType(int position) {
        DataType type = dummyData.get(position).getType();
        return EventItemConfig.layoutRelative.get(type);
    }

    @Override
    public int getItemCount() {
        return dummyData == null ? 0 : dummyData.size();
    }
}
