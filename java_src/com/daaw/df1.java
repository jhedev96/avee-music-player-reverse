package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class df1 implements th1 {

    /* renamed from: p */
    public final C2099ln[] f7028p;

    /* renamed from: q */
    public final long[] f7029q;

    public df1(C2099ln[] c2099lnArr, long[] jArr) {
        this.f7028p = c2099lnArr;
        this.f7029q = jArr;
    }

    @Override // com.daaw.th1
    /* renamed from: a */
    public int mo3753a(long j) {
        int m10014c = sq1.m10014c(this.f7029q, j, false, false);
        if (m10014c < this.f7029q.length) {
            return m10014c;
        }
        return -1;
    }

    @Override // com.daaw.th1
    /* renamed from: b */
    public long mo3752b(int i) {
        C2914s6.m10690a(i >= 0);
        C2914s6.m10690a(i < this.f7029q.length);
        return this.f7029q[i];
    }

    @Override // com.daaw.th1
    /* renamed from: c */
    public List<C2099ln> mo3751c(long j) {
        int m10011e = sq1.m10011e(this.f7029q, j, true, false);
        if (m10011e != -1) {
            C2099ln[] c2099lnArr = this.f7028p;
            if (c2099lnArr[m10011e] != null) {
                return Collections.singletonList(c2099lnArr[m10011e]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.daaw.th1
    /* renamed from: d */
    public int mo3750d() {
        return this.f7029q.length;
    }
}
