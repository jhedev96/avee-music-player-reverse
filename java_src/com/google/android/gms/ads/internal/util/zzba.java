package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
/* loaded from: classes.dex */
public final class zzba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                str = y71.m4053f(parcel, m4041r);
            } else if (m4047l != 2) {
                y71.m4035x(parcel, m4041r);
            } else {
                i = y71.m4039t(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzaz(str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaz[i];
    }
}
