package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public class z22 implements IInterface {

    /* renamed from: p */
    public final IBinder f34361p;

    /* renamed from: q */
    public final String f34362q;

    public z22(IBinder iBinder, String str) {
        this.f34361p = iBinder;
        this.f34362q = str;
    }

    /* renamed from: D */
    public final Parcel m2966D(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f34361p.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: I */
    public final Parcel m2965I() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f34362q);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34361p;
    }
}
