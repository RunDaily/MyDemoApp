package legong.sophist.com.app.data;

import java.util.ArrayList;
import java.util.List;
import legong.sophist.com.app.entity.CellData;
import legong.sophist.com.app.entity.EntryData;
import legong.sophist.com.app.entity.EventData;
import legong.sophist.com.app.entity.HeadData;
import legong.sophist.com.app.entity.PanelData;

/**
 * 虚拟数据类
 */
public class DummyData {

    /**
     * 拿虚拟数据
     * @return
     */
    public static List<CellData> getDummyData() {
        List<CellData> array = new ArrayList<>();

        array.add(new HeadData());
        array.add(new PanelData());
        array.add(new EntryData());
        array.add(new EventData());
        array.add(new EventData());
        array.add(new EventData());
        array.add(new EventData());
        array.add(new EventData());
        array.add(new EventData());
        array.add(new EventData());

        array.add(new EntryData());
        array.add(new EventData());
        array.add(new HeadData());
        array.add(new EventData());
        array.add(new PanelData());

        array.add(new EventData());
        array.add(new EventData());
        array.add(new EventData());
        array.add(new EventData());
        array.add(new EventData());
        array.add(new EventData());
        array.add(new PanelData());

        return array;
    }

}
