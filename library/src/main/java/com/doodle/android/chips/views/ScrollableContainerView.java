package com.doodle.android.chips.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ScrollableContainerView extends ScrollView {

    public ScrollableContainerView(Context context) {
        super(context);
    }

    public ScrollableContainerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScrollableContainerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float density = getResources().getDisplayMetrics().density;
        heightMeasureSpec = MeasureSpec.makeMeasureSpec((int) (150*density), MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
