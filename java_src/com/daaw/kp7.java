package com.daaw;

import java.security.MessageDigest;
import java.security.Provider;
/* loaded from: classes.dex */
public final class kp7 implements mp7 {
    @Override // com.daaw.mp7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15861a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
