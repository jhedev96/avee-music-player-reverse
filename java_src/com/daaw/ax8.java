package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public final class ax8 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ax8(Throwable th) {
        super("Unexpected " + r0 + ": " + r1, th);
        String simpleName = th.getClass().getSimpleName();
        String message = th.getMessage();
    }
}
