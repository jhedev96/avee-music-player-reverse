package com.daaw;
/* loaded from: classes.dex */
public final class ci2 extends ls7 implements yt7 {
    private static final ci2 zzb;
    private int zzd;
    private int zze = 2;

    static {
        ci2 ci2Var = new ci2();
        zzb = ci2Var;
        ls7.m16597C(ci2.class, ci2Var);
    }

    @Override // com.daaw.ls7
    /* renamed from: I */
    public final Object mo1768I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new bi2(null);
                }
                return new ci2();
            }
            return ls7.m16573z(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzd", "zze", di2.f7129a});
        }
        return (byte) 1;
    }
}
