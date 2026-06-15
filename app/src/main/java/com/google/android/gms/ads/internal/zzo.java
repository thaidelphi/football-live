package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.internal.ads.zzfbq;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzo extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzu f11546a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(zzu zzuVar) {
        this.f11546a = zzuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzbk zzbkVar;
        zzbk zzbkVar2;
        zzbk zzbkVar3;
        zzbk zzbkVar4;
        zzu zzuVar = this.f11546a;
        zzbkVar = zzuVar.f11562g;
        if (zzbkVar != null) {
            try {
                zzbkVar2 = zzuVar.f11562g;
                zzbkVar2.zzf(zzfbq.zzd(1, null, null));
            } catch (RemoteException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            }
        }
        zzu zzuVar2 = this.f11546a;
        zzbkVar3 = zzuVar2.f11562g;
        if (zzbkVar3 != null) {
            try {
                zzbkVar4 = zzuVar2.f11562g;
                zzbkVar4.zze(0);
            } catch (RemoteException e10) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbk zzbkVar;
        zzbk zzbkVar2;
        zzbk zzbkVar3;
        zzbk zzbkVar4;
        zzbk zzbkVar5;
        zzbk zzbkVar6;
        zzbk zzbkVar7;
        zzbk zzbkVar8;
        zzbk zzbkVar9;
        zzbk zzbkVar10;
        zzbk zzbkVar11;
        zzbk zzbkVar12;
        zzbk zzbkVar13;
        if (str.startsWith(this.f11546a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzu zzuVar = this.f11546a;
            zzbkVar10 = zzuVar.f11562g;
            if (zzbkVar10 != null) {
                try {
                    zzbkVar11 = zzuVar.f11562g;
                    zzbkVar11.zzf(zzfbq.zzd(3, null, null));
                } catch (RemoteException e8) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                }
            }
            zzu zzuVar2 = this.f11546a;
            zzbkVar12 = zzuVar2.f11562g;
            if (zzbkVar12 != null) {
                try {
                    zzbkVar13 = zzuVar2.f11562g;
                    zzbkVar13.zze(3);
                } catch (RemoteException e10) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                }
            }
            this.f11546a.Z(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzu zzuVar3 = this.f11546a;
            zzbkVar6 = zzuVar3.f11562g;
            if (zzbkVar6 != null) {
                try {
                    zzbkVar7 = zzuVar3.f11562g;
                    zzbkVar7.zzf(zzfbq.zzd(1, null, null));
                } catch (RemoteException e11) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e11);
                }
            }
            zzu zzuVar4 = this.f11546a;
            zzbkVar8 = zzuVar4.f11562g;
            if (zzbkVar8 != null) {
                try {
                    zzbkVar9 = zzuVar4.f11562g;
                    zzbkVar9.zze(0);
                } catch (RemoteException e12) {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e12);
                }
            }
            this.f11546a.Z(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            zzu zzuVar5 = this.f11546a;
            zzbkVar4 = zzuVar5.f11562g;
            if (zzbkVar4 != null) {
                try {
                    zzbkVar5 = zzuVar5.f11562g;
                    zzbkVar5.zzi();
                } catch (RemoteException e13) {
                    int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e13);
                }
            }
            this.f11546a.Z(this.f11546a.zzb(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            zzu zzuVar6 = this.f11546a;
            zzbkVar = zzuVar6.f11562g;
            if (zzbkVar != null) {
                try {
                    zzbkVar2 = zzuVar6.f11562g;
                    zzbkVar2.zzc();
                    zzbkVar3 = this.f11546a.f11562g;
                    zzbkVar3.zzh();
                } catch (RemoteException e14) {
                    int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e14);
                }
            }
            zzu.B0(this.f11546a, zzu.y0(this.f11546a, str));
            return true;
        }
    }
}
