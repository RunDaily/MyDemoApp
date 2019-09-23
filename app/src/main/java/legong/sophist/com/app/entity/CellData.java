package legong.sophist.com.app.entity;

import legong.sophist.com.app.data.DataType;

/**
 * 实体数据必须要实现一个方法 返回一个type,用来标识是哪种数据类型
 */
public interface CellData {
    DataType getType();
}
