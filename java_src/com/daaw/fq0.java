package com.daaw;
/* loaded from: classes2.dex */
public class fq0 implements ef1 {

    /* renamed from: a */
    public final int f9771a;

    public fq0(int i) {
        this.f9771a = i;
    }

    @Override // com.daaw.ef1
    /* renamed from: a */
    public StackTraceElement[] mo9614a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f9771a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
