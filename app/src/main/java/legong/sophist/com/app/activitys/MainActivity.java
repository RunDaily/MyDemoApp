package legong.sophist.com.app.activitys;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import legong.sophist.com.app.R;
import legong.sophist.com.app.fragments.ContactFragment;
import legong.sophist.com.app.fragments.EventsFragment;
import legong.sophist.com.app.fragments.ExploreFragment;
import legong.sophist.com.app.fragments.MessageFragment;
import legong.sophist.com.app.utils.FragmentKit;

public class MainActivity extends AppCompatActivity {

    /**
     * Activity里的全部Tab
     */
    private enum Tab {
        Event,   //信息流
        Message, //悦信
        Contact, //通讯录
        Explore  //应用
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //默认选择第一个Tab
        navigation.setSelectedItemId(R.id.navigation_event);
    }

    //每个Tab的点击事件
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_event:
                    //显示【信息流Tab】
                    showTab(Tab.Event);
                    return true;
                case R.id.navigation_message:

                    showTab(Tab.Message);
                    return true;
                case R.id.navigation_contact:

                    showTab(Tab.Contact);
                    return true;
                case R.id.navigation_explore:

                    showTab(Tab.Explore);
                    return true;
            }
            return false;
        }
    };

    /**
     * 根据不同的Tab展示对应的Fragment
     * @param tab
     */
    private void showTab(Tab tab) {
        switch (tab){
            case Event:
                FragmentKit.showFragment(EventsFragment.class, getSupportFragmentManager(), R.id.frag_container);
                break;
            case Message:
                FragmentKit.showFragment(MessageFragment.class, getSupportFragmentManager(), R.id.frag_container);
                break;
            case Contact:
                FragmentKit.showFragment(ContactFragment.class, getSupportFragmentManager(), R.id.frag_container);
                break;
            case Explore:
                FragmentKit.showFragment(ExploreFragment.class, getSupportFragmentManager(), R.id.frag_container);
                break;
        }
    }

}
