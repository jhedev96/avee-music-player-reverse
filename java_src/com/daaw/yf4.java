package com.daaw;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class yf4 implements lf4 {

    /* renamed from: a */
    public final ix3 f33629a;

    public yf4(ix3 ix3Var) {
        this.f33629a = ix3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.daaw.ix3] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.daaw.lf4
    /* renamed from: b */
    public final void mo3778b(JSONObject jSONObject) {
        this.f33629a.m19297b(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
