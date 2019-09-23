package legong.sophist.com.app.recycler_holder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import legong.sophist.com.app.R;
import legong.sophist.com.app.entity.EventData;

public class EventHolder extends CellHolder<EventData> {

    public TextView tvContent;

    public EventHolder(@NonNull View itemView) {
        super(itemView);
        tvContent = itemView.findViewById(R.id.tv_content);
    }

    @Override
    public void setData(EventData data) {

    }

    @Override
    public int layoutRes() {
        return R.layout.event_item;
    }
}
