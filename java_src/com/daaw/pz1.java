package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class pz1 implements Parcelable.Creator<TelemetryData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TelemetryData createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                i = y71.m4039t(parcel, m4041r);
            } else if (m4047l != 2) {
                y71.m4035x(parcel, m4041r);
            } else {
                arrayList = y71.m4049j(parcel, m4041r, MethodInvocation.CREATOR);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new TelemetryData(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TelemetryData[] newArray(int i) {
        return new TelemetryData[i];
    }
}
