package com.daaw;
/* loaded from: classes.dex */
public final class n47 extends p47 {
    public n47(f77 f77Var, Class cls, w57 w57Var) {
        super(f77Var, cls, w57Var);
    }

    @Override // com.daaw.p47
    /* renamed from: E */
    public final /* bridge */ /* synthetic */ Object mo13633E(Object obj, Throwable th) {
        w57 w57Var = (w57) obj;
        f77 zza = w57Var.zza(th);
        sy6.m9705d(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", w57Var);
        return zza;
    }

    @Override // com.daaw.p47
    /* renamed from: F */
    public final /* synthetic */ void mo13632F(Object obj) {
        m25600w((f77) obj);
    }
}
