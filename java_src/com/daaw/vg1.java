package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
/* loaded from: classes.dex */
public class vg1 extends hq1<InputStream> {

    /* renamed from: com.daaw.vg1$a */
    /* loaded from: classes.dex */
    public static class C3329a implements nq0<Uri, InputStream> {
        @Override // com.daaw.nq0
        /* renamed from: a */
        public mq0<Uri, InputStream> mo3945a(Context context, d60 d60Var) {
            return new vg1(context, d60Var.m24637a(o70.class, InputStream.class));
        }

        @Override // com.daaw.nq0
        /* renamed from: b */
        public void mo3944b() {
        }
    }

    public vg1(Context context, mq0<o70, InputStream> mq0Var) {
        super(context, mq0Var);
    }

    @Override // com.daaw.hq1
    /* renamed from: b */
    public InterfaceC1744ip<InputStream> mo7190b(Context context, String str) {
        return new ig1(context.getApplicationContext().getAssets(), str);
    }

    @Override // com.daaw.hq1
    /* renamed from: c */
    public InterfaceC1744ip<InputStream> mo7189c(Context context, Uri uri) {
        return new qg1(context, uri);
    }
}
