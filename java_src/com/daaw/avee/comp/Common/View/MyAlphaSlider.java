package com.daaw.avee.comp.Common.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.daaw.C2146m2;
/* loaded from: classes.dex */
public class MyAlphaSlider extends C2146m2 {
    public MyAlphaSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: h */
    public final void m26861h() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // com.daaw.AbstractC1031d, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if ((action == 0 || action == 2) && onTouchEvent) {
            m26861h();
        }
        return onTouchEvent;
    }
}
