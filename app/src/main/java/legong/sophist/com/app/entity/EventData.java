package legong.sophist.com.app.entity;

import legong.sophist.com.app.data.DataType;

/**
 * 事件流类型的数据
 */
public class EventData implements CellData {

    //各种数据变量。。。
    private String ss;
    private int ii;

    @Override
    public DataType getType() {
        return DataType.Event;
    }
}
