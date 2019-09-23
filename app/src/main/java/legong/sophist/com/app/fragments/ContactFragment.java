package legong.sophist.com.app.fragments;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import legong.sophist.com.app.R;
import legong.sophist.com.app.base.BaseFragment;

/**
 * 通讯录页
 */
public class ContactFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_contact;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.contact_menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
