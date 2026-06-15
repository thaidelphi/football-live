package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcei extends FrameLayout implements zzcdq {
    private final zzcdq zza;
    private final zzcaa zzb;
    private final AtomicBoolean zzc;

    public zzcei(zzcdq zzcdqVar) {
        super(zzcdqVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcdqVar;
        this.zzb = new zzcaa(zzcdqVar.zzE(), this, this);
        addView((View) zzcdqVar);
    }

    public static /* synthetic */ void zzaI(zzcei zzceiVar, boolean z10) {
        zzcdq zzcdqVar = zzceiVar.zza;
        zzfpe zzfpeVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzcdqVar);
        zzfpeVar.post(new zzcee(zzcdqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void destroy() {
        final zzeaz zzP;
        final zzebb zzQ = zzQ();
        if (zzQ != null) {
            zzfpe zzfpeVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfpeVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzv.zzB().zzi(zzebb.this.zza());
                }
            });
            zzcdq zzcdqVar = this.zza;
            Objects.requireNonNull(zzcdqVar);
            zzfpeVar.postDelayed(new zzcee(zzcdqVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfh)).intValue());
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfj)).booleanValue() && (zzP = zzP()) != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceg
                @Override // java.lang.Runnable
                public final void run() {
                    zzP.zzf(new zzceh(zzcei.this));
                }
            });
        } else {
            this.zza.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcdq zzcdqVar = this.zza;
        if (zzcdqVar != null) {
            zzcdqVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcdq
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcdq
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzA(int i10) {
        this.zza.zzA(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzB(int i10) {
        this.zzb.zzg(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcal
    public final void zzC(zzces zzcesVar) {
        this.zza.zzC(zzcesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcdh
    public final zzezu zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcff
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcfd
    public final zzauc zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final zzayy zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final zzbem zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final zzcfi zzN() {
        return ((zzcep) this.zza).zzaO();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcfc
    public final zzcfk zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final zzeaz zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final zzebb zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcet
    public final zzezx zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final zzfat zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final b6.a zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final String zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final List zzV() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzW(zzezu zzezuVar, zzezx zzezxVar) {
        this.zza.zzW(zzezuVar, zzezxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzY() {
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzZ(int i10) {
        this.zza.zzZ(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zza(String str) {
        ((zzcep) this.zza).zzaW(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzaA(String str, Predicate predicate) {
        this.zza.zzaA(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final boolean zzaD(boolean z10, int i10) {
        if (this.zzc.compareAndSet(false, true)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaW)).booleanValue()) {
                return false;
            }
            if (this.zza.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
            }
            this.zza.zzaD(z10, i10);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final boolean zzaG() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) {
        this.zza.zzaJ(zzcVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzaK(String str, String str2, int i10) {
        this.zza.zzaK(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzaL(boolean z10, int i10, boolean z11) {
        this.zza.zzaL(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzaM(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zza.zzaM(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzaN(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zza.zzaN(z10, i10, str, z11, z12);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzab() {
        this.zza.zzab();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzac(boolean z10) {
        this.zza.zzac(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzad() {
        this.zza.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzae(String str, String str2, String str3) {
        this.zza.zzae(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzaf() {
        this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzag(String str, zzbio zzbioVar) {
        this.zza.zzag(str, zzbioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzah() {
        zzebb zzQ;
        zzeaz zzP;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzv.zzq();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzz());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfj)).booleanValue() && (zzP = zzP()) != null) {
            zzP.zza(textView);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfi)).booleanValue() && (zzQ = zzQ()) != null && zzQ.zzb()) {
            com.google.android.gms.ads.internal.zzv.zzB().zzg(zzQ.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzai(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzaj(zzcfk zzcfkVar) {
        this.zza.zzaj(zzcfkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzak(zzayy zzayyVar) {
        this.zza.zzak(zzayyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzal(boolean z10) {
        this.zza.zzal(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzam() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzan(Context context) {
        this.zza.zzan(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzao(boolean z10) {
        this.zza.zzao(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzap(zzbek zzbekVar) {
        this.zza.zzap(zzbekVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzaq(boolean z10) {
        this.zza.zzaq(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzar(zzbem zzbemVar) {
        this.zza.zzar(zzbemVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzas(zzeaz zzeazVar) {
        this.zza.zzas(zzeazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzat(zzebb zzebbVar) {
        this.zza.zzat(zzebbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzau(int i10) {
        this.zza.zzau(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzav(boolean z10) {
        this.zza.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzaw(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzax(boolean z10) {
        this.zza.zzax(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzay(boolean z10) {
        this.zza.zzay(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzaz(String str, zzbio zzbioVar) {
        this.zza.zzaz(str, zzbioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzdd() {
        zzcdq zzcdqVar = this.zza;
        if (zzcdqVar != null) {
            zzcdqVar.zzdd();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzde() {
        this.zza.zzde();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdf() {
        this.zza.zzdf();
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzdg() {
        this.zza.zzdg();
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zzdn(zzaxk zzaxkVar) {
        this.zza.zzdn(zzaxkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdX)).booleanValue()) {
            return this.zza.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final int zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdX)).booleanValue()) {
            return this.zza.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcal
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcal
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final zzbby zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcal
    public final zzbbz zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcal
    public final VersionInfoParcel zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final zzcaa zzn() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final zzcbx zzo(String str) {
        return this.zza.zzo(str);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzp(String str, JSONObject jSONObject) {
        ((zzcep) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcal
    public final zzces zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final String zzr() {
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final String zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcal
    public final void zzt(String str, zzcbx zzcbxVar) {
        this.zza.zzt(str, zzcbxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzu() {
        zzcdq zzcdqVar = this.zza;
        if (zzcdqVar != null) {
            zzcdqVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzv(boolean z10, long j10) {
        this.zza.zzv(z10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzx(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzy(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzz(boolean z10) {
        this.zza.zzz(false);
    }
}
