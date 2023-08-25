package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
/* loaded from: classes.dex */
public final class zzg extends zzbg {

    /* renamed from: p */
    public final AdListener f36189p;

    public zzg(AdListener adListener) {
        this.f36189p = adListener;
    }

    public final AdListener zzb() {
        return this.f36189p;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() {
        AdListener adListener = this.f36189p;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
        AdListener adListener = this.f36189p;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zzeVar) {
        AdListener adListener = this.f36189p;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        AdListener adListener = this.f36189p;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        AdListener adListener = this.f36189p;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        AdListener adListener = this.f36189p;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
        AdListener adListener = this.f36189p;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }
}
