package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcao;
/* loaded from: classes.dex */
public final class at3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                iBinder = y71.m4040s(parcel, m4041r);
            } else if (m4047l != 2) {
                y71.m4035x(parcel, m4041r);
            } else {
                iBinder2 = y71.m4040s(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzcao(iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcao[i];
    }
}
