package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class gn6 implements wz7 {

    /* renamed from: a */
    public final m08 f11478a;

    /* renamed from: b */
    public final m08 f11479b;

    /* renamed from: c */
    public final m08 f11480c;

    public gn6(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.f11478a = m08Var;
        this.f11479b = m08Var2;
        this.f11480c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new en6(g77Var, (ScheduledExecutorService) this.f11479b.zzb(), ((hn6) this.f11480c).zzb());
    }
}
