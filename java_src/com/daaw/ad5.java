package com.daaw;

import android.app.Activity;
/* loaded from: classes2.dex */
public final class ad5 extends l75 {

    /* renamed from: t */
    public final /* synthetic */ Activity f3100t;

    /* renamed from: u */
    public final /* synthetic */ dj5 f3101u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad5(dj5 dj5Var, Activity activity) {
        super(dj5Var.f7199p, true);
        this.f3101u = dj5Var;
        this.f3100t = activity;
    }

    @Override // com.daaw.l75
    /* renamed from: a */
    public final void mo2297a() {
        ju3 ju3Var;
        ju3Var = this.f3101u.f7199p.f11397i;
        ((ju3) ry0.m10830j(ju3Var)).onActivityResumed(nt0.m14830g3(this.f3100t), this.f17104q);
    }
}
