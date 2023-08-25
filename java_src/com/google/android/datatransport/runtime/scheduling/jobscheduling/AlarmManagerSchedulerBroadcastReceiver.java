package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.daaw.fz0;
import com.daaw.sn1;
import com.daaw.xn1;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: b */
    public static /* synthetic */ void m1748b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        xn1.m4946f(context);
        sn1.AbstractC2958a mo6330d = sn1.m10151a().mo6332b(queryParameter).mo6330d(fz0.m22131b(intValue));
        if (queryParameter2 != null) {
            mo6330d.mo6331c(Base64.decode(queryParameter2, 0));
        }
        xn1.m4949c().m4947e().m23281v(mo6330d.mo6333a(), i, new Runnable() { // from class: com.daaw.w1
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m1748b();
            }
        });
    }
}
