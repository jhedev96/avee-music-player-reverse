package com.daaw;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hh4 implements wz7 {

    /* renamed from: a */
    public final m08 f12546a;

    /* renamed from: b */
    public final m08 f12547b;

    /* renamed from: c */
    public final m08 f12548c;

    public hh4(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.f12546a = m08Var;
        this.f12547b = m08Var2;
        this.f12548c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        ah4 ah4Var = (ah4) this.f12546a.zzb();
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        Set emptySet = ((JSONObject) this.f12548c.zzb()) == null ? Collections.emptySet() : Collections.singleton(new ly4(ah4Var, g77Var));
        e08.m23801b(emptySet);
        return emptySet;
    }
}
