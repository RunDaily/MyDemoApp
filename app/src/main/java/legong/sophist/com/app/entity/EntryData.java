package legong.sophist.com.app.entity;

import legong.sophist.com.app.data.DataType;

/**
 * '告诉同事们在做什么'类型的数据
 */
public class EntryData implements CellData {

    //各种数据变量。。。
    private String ss;
    private int ii;

    @Override
    public DataType getType() {
        return DataType.Entry;
    }
}
