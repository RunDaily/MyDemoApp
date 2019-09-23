package legong.sophist.com.app.recycler_cell;

import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import legong.sophist.com.app.App;
import legong.sophist.com.app.R;
import legong.sophist.com.app.entity.EventData;
import legong.sophist.com.app.recycler_holder.EventHolder;

/**
 * holder和Data绑定的逻辑
 */
public class EventCell implements ItemCell<EventHolder, EventData> {
    @Override
    public void onBindViewHolder(EventHolder holder, EventData data) {
//        Log.d("TAG", "onBindViewHolder: --->" + data.getType());

        SpannableString spannableString = new SpannableString(holder.tvContent.getText());
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(ContextCompat.getColor(holder.tvContent.getContext()
                , android.R.color.holo_blue_bright));
        spannableString.setSpan(colorSpan, 7, 23, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(App.app, "Span Click", Toast.LENGTH_SHORT).show();
            }
        }, 7, 23, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        holder.tvContent.setMovementMethod( LinkMovementMethod.getInstance());
        holder.tvContent.setText(spannableString);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(App.app, "Item Click", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
