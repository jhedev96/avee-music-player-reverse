package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class bi3 extends cp2 implements ci3 {
    public bi3() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    /* renamed from: g3 */
    public static ci3 m26146g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        return queryLocalInterface instanceof ci3 ? (ci3) queryLocalInterface : new ai3(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            dp2.m24105c(parcel);
            mo18491f(readString);
        } else if (i != 2) {
            return false;
        } else {
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
