package legong.sophist.com.app.entity;

import legong.sophist.com.app.data.DataType;

/**
 * 仪表板类型的数据
 */
public class PanelData implements CellData {

    //当前holder处于哪个panel
    public int panelPos;

    //各种数据变量。。。
    private String ss;
    private int ii;

    @Override
    public DataType getType() {
        return DataType.Panel;
    }
}
