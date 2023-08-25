package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.daaw.C0972co;
import com.daaw.ia3;
import com.daaw.k04;
import com.daaw.vp3;
import com.daaw.wp3;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
/* loaded from: classes.dex */
public final class zzbyi implements MediationInterstitialAdapter {

    /* renamed from: a */
    public Activity f36879a;

    /* renamed from: b */
    public MediationInterstitialListener f36880b;

    /* renamed from: c */
    public Uri f36881c;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        k04.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        k04.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        k04.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f36880b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            k04.zzj("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            k04.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f36880b.onAdFailedToLoad(this, 0);
        } else if (!ia3.m20002g(context)) {
            k04.zzj("Default browser does not support custom tabs. Bailing out.");
            this.f36880b.onAdFailedToLoad(this, 0);
        } else {
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                k04.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f36880b.onAdFailedToLoad(this, 0);
                return;
            }
            this.f36879a = (Activity) context;
            this.f36881c = Uri.parse(string);
            this.f36880b.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        C0972co m25193a = new C0972co.C0973a().m25193a();
        m25193a.f5979a.setData(this.f36881c);
        zzs.zza.post(new wp3(this, new AdOverlayInfoParcel(new zzc(m25193a.f5979a, null), null, new vp3(this), null, new zzchu(0, 0, false, false, false), null, null)));
        zzt.zzo().m11907p();
    }
}
