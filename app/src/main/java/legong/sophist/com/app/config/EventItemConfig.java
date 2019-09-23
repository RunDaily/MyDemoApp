package legong.sophist.com.app.config;

import java.util.EnumMap;
import legong.sophist.com.app.R;
import legong.sophist.com.app.data.DataType;
import legong.sophist.com.app.recycler_cell.EntryCell;
import legong.sophist.com.app.recycler_cell.EventCell;
import legong.sophist.com.app.recycler_cell.HeadCell;
import legong.sophist.com.app.recycler_cell.ItemCell;
import legong.sophist.com.app.recycler_cell.PanelCell;

public class EventItemConfig {

    /**
     * 保存数据类型DataType和Item布局的对应关系
     */
    public static EnumMap<DataType, Integer> layoutRelative = new EnumMap<>(DataType.class);

    /**
     * 保存数据类型DataType和Cell的对应关系
     */
    public static EnumMap<DataType, Class<? extends ItemCell>> cellRelative = new EnumMap<>(DataType.class);


    /**
     * 加载阶段就设置他们的关系
     */
    static {

        //设置布局关系
        layoutRelative.put(DataType.Head, R.layout.head_item);
        layoutRelative.put(DataType.Panel, R.layout.panel_item);
        layoutRelative.put(DataType.Entry, R.layout.entry_item);
        layoutRelative.put(DataType.Event, R.layout.event_item);


        //设置cell关系
        cellRelative.put(DataType.Head, HeadCell.class);
        cellRelative.put(DataType.Panel, PanelCell.class);
        cellRelative.put(DataType.Entry, EntryCell.class);
        cellRelative.put(DataType.Event, EventCell.class);

    }

}
