package legong.sophist.com.app.fragments;


import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import legong.sophist.com.app.R;
import legong.sophist.com.app.adapter.MultiEventAdapter;
import legong.sophist.com.app.base.BaseFragment;
import legong.sophist.com.app.dialog.EventDialog;
import legong.sophist.com.app.entity.EventData;

/**
 * 信息流页
 */
public class EventsFragment extends BaseFragment {

    RecyclerView recyclerView;
    TextView tvTitle;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_events;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvTitle=view.findViewById(R.id.title);
        tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popTitleDialog();
            }
        });

        recyclerView = view.findViewById(R.id.rv_multi_events);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.top = 12;
                outRect.bottom = 12;
            }
        });
        recyclerView.setAdapter(new MultiEventAdapter(getContext()));
    }

    /**
     * 弹出顶部的框
     */
    private void popTitleDialog() {
        EventDialog eventDialog=new EventDialog();
        eventDialog.setCancelable(true);
        eventDialog.show(getFragmentManager(),"event");
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.event_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
