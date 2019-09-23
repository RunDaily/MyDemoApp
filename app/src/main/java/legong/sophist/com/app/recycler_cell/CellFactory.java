package legong.sophist.com.app.recycler_cell;


import java.util.HashMap;
import java.util.Map;

import legong.sophist.com.app.config.EventItemConfig;
import legong.sophist.com.app.data.DataType;
import legong.sophist.com.app.entity.CellData;
import legong.sophist.com.app.recycler_holder.CellHolder;

public class CellFactory {

    //Cell的缓存：每种类型的Cell都只缓存一个
    private Map<DataType, ItemCell< CellHolder,  CellData>> mCellsCache = new HashMap<>();

    public static CellFactory getInstance() {
        return CellFactoryHolder.instance;
    }

    private CellFactory() {
    }

    //静态内部类单例模式
    private static class CellFactoryHolder {
        public static CellFactory instance = new CellFactory();
    }

    /**
     * 根据数据类型Type，获取一个对应的Cell
     *
     * @param type
     * @return
     */
    public ItemCell< CellHolder,  CellData> getCellByType(DataType type) {
        ItemCell< CellHolder,  CellData> retCell = mCellsCache.get(type);

        //没有拿到就创建一个对应的ItemCell
        if (retCell == null) {
            Class clazz = EventItemConfig.cellRelative.get(type);
            if (clazz == null)
                throw new RuntimeException("未知Type");
            else {
                if (!ItemCell.class.isAssignableFrom(clazz))
                    throw new RuntimeException("不是ItemCell类型");
                try {
                    retCell = (ItemCell< CellHolder,  CellData>)
                            clazz.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            assert retCell != null;
            mCellsCache.put(type, retCell);
        }
        return retCell;
    }
}
