package com.daaw;

import java.security.Provider;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class jp7 implements mp7 {
    @Override // com.daaw.mp7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15861a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
