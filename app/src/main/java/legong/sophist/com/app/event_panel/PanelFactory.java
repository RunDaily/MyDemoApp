package legong.sophist.com.app.event_panel;

import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建3个仪表板
 */
public class PanelFactory {
    private List<Fragment> mPanels;

    public static PanelFactory getInstance() {
        return FactoryHolder.instance;
    }

    private PanelFactory() {
        mPanels = new ArrayList<>();
    }

    private static class FactoryHolder {
        public static PanelFactory instance = new PanelFactory();
    }

    public List<Fragment> getPanels() {
        if (mPanels.size() == 0) {
            mPanels.add(new PanelA());
            mPanels.add(new PanelB());
            mPanels.add(new PanelC());
        }
        return mPanels;
    }
}
