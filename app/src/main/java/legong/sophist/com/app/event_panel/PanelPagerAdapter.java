package legong.sophist.com.app.event_panel;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 仪表板的Adapter
 */
public class PanelPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;

    public PanelPagerAdapter(FragmentManager fm) {
        super(fm);
        this.fragmentList = PanelFactory.getInstance().getPanels();
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList == null ? 0 : fragmentList.size();
    }
}
