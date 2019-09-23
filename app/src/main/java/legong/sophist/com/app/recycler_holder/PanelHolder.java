package legong.sophist.com.app.recycler_holder;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import legong.sophist.com.app.R;
import legong.sophist.com.app.entity.PanelData;
import legong.sophist.com.app.event_panel.PanelPagerAdapter;

public class PanelHolder extends CellHolder<PanelData> {
    @Override
    public int layoutRes() {
        return R.layout.panel_item;
    }

    public ViewPager panelVp;
    public PanelPagerAdapter adapter;
    public MyPageChangeListener pageChangeListener;

    public PanelHolder(@NonNull View itemView) {
        super(itemView);
        panelVp = itemView.findViewById(R.id.panel_vp);
        adapter = new PanelPagerAdapter(((AppCompatActivity) itemView.getContext()).getSupportFragmentManager());
        pageChangeListener=new MyPageChangeListener();
        panelVp.addOnPageChangeListener(pageChangeListener);
    }


    @Override
    public void setData(PanelData data) {
        if (pageChangeListener!=null)
            pageChangeListener.setPanelData(data);
    }

    class MyPageChangeListener implements ViewPager.OnPageChangeListener {

        private PanelData panelData;

        public void setPanelData(PanelData panelData) {
            this.panelData = panelData;
        }

        @Override
        public void onPageScrolled(int i, float v, int i1) {
        }

        @Override
        public void onPageSelected(int i) {
//            if (changeCallback != null)
//                changeCallback.onPageChange(i);
            panelData.panelPos=i;
            Log.d("TAG", "Changed了: ---> data:" + panelData.hashCode() + " panelPos:" + panelData.panelPos);

        }

        @Override
        public void onPageScrollStateChanged(int i) {
        }
    }
}
