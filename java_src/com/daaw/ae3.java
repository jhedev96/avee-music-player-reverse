package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ae3 extends bp2 implements ce3 {
    public ae3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.daaw.ce3
    /* renamed from: u0 */
    public final void mo11062u0(sd3 sd3Var, String str) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, sd3Var);
        m25952D.writeString(str);
        m25950M(1, m25952D);
    }
}
