package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface zzcdq extends com.google.android.gms.ads.internal.client.zza, zzdce, zzcdh, zzblj, zzcet, zzcex, zzblv, zzaxl, zzcfa, com.google.android.gms.ads.internal.zzn, zzcfd, zzcfe, zzcal, zzcff {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcal
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i10, int i11);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcal
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcal
    void zzC(zzces zzcesVar);

    @Override // com.google.android.gms.internal.ads.zzcdh
    zzezu zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcff
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcfd
    zzauc zzI();

    zzayy zzJ();

    zzbem zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    zzcfi zzN();

    @Override // com.google.android.gms.internal.ads.zzcfc
    zzcfk zzO();

    zzeaz zzP();

    zzebb zzQ();

    @Override // com.google.android.gms.internal.ads.zzcet
    zzezx zzR();

    zzfat zzS();

    b6.a zzT();

    String zzU();

    List zzV();

    void zzW(zzezu zzezuVar, zzezx zzezxVar);

    void zzX();

    void zzY();

    void zzZ(int i10);

    void zzaA(String str, Predicate predicate);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z10, int i10);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean z10);

    void zzad();

    void zzae(String str, String str2, String str3);

    void zzaf();

    void zzag(String str, zzbio zzbioVar);

    void zzah();

    void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaj(zzcfk zzcfkVar);

    void zzak(zzayy zzayyVar);

    void zzal(boolean z10);

    void zzam();

    void zzan(Context context);

    void zzao(boolean z10);

    void zzap(zzbek zzbekVar);

    void zzaq(boolean z10);

    void zzar(zzbem zzbemVar);

    void zzas(zzeaz zzeazVar);

    void zzat(zzebb zzebbVar);

    void zzau(int i10);

    void zzav(boolean z10);

    void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzax(boolean z10);

    void zzay(boolean z10);

    void zzaz(String str, zzbio zzbioVar);

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcal
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcal
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzcal
    zzbbz zzl();

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcal
    VersionInfoParcel zzm();

    @Override // com.google.android.gms.internal.ads.zzcal
    zzces zzq();

    @Override // com.google.android.gms.internal.ads.zzcal
    void zzt(String str, zzcbx zzcbxVar);
}
