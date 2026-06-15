package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzej extends zzbc {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzek f11245c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzej(zzek zzekVar) {
        this.f11245c = zzekVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        VideoController videoController;
        zzek zzekVar = this.f11245c;
        videoController = zzekVar.f11249d;
        videoController.zzb(zzekVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        zzek zzekVar = this.f11245c;
        videoController = zzekVar.f11249d;
        videoController.zzb(zzekVar.zzi());
        super.onAdLoaded();
    }
}
