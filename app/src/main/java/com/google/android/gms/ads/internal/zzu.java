package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzauc;
import com.google.android.gms.internal.ads.zzaud;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbuv;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.Map;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzu extends zzbw {

    /* renamed from: a */
    private final VersionInfoParcel f11556a;

    /* renamed from: b */
    private final com.google.android.gms.ads.internal.client.zzr f11557b;

    /* renamed from: c */
    private final Future f11558c = zzbyp.zza.zzb(new zzq(this));

    /* renamed from: d */
    private final Context f11559d;

    /* renamed from: e */
    private final zzs f11560e;

    /* renamed from: f */
    private WebView f11561f;

    /* renamed from: g */
    private zzbk f11562g;

    /* renamed from: h */
    private zzauc f11563h;

    /* renamed from: i */
    private AsyncTask f11564i;

    public zzu(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, VersionInfoParcel versionInfoParcel) {
        this.f11559d = context;
        this.f11556a = versionInfoParcel;
        this.f11557b = zzrVar;
        this.f11561f = new WebView(context);
        this.f11560e = new zzs(context, str);
        Z(0);
        this.f11561f.setVerticalScrollBarEnabled(false);
        this.f11561f.getSettings().setJavaScriptEnabled(true);
        this.f11561f.setWebViewClient(new zzo(this));
        this.f11561f.setOnTouchListener(new zzp(this));
    }

    public static /* bridge */ /* synthetic */ void B0(zzu zzuVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzuVar.f11559d.startActivity(intent);
    }

    public static /* bridge */ /* synthetic */ String y0(zzu zzuVar, String str) {
        if (zzuVar.f11563h != null) {
            Uri parse = Uri.parse(str);
            try {
                parse = zzuVar.f11563h.zza(parse, zzuVar.f11559d, null, null);
            } catch (zzaud e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to process ad data", e8);
            }
            return parse.toString();
        }
        return str;
    }

    public final void Z(int i10) {
        if (this.f11561f == null) {
            return;
        }
        this.f11561f.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzA() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzB() throws RemoteException {
        Preconditions.f("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzbh zzbhVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(zzbk zzbkVar) throws RemoteException {
        this.f11562g = zzbkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(zzcb zzcbVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzF(com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(zzcl zzclVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(zzazh zzazhVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(zzx zzxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(zzee zzeeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzL(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzM(zzbsm zzbsmVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzN(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzO(zzbch zzbchVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(zzbsp zzbspVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(zzbuv zzbuvVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzT(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzU(zzfx zzfxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzX() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzY() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzaa() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        Preconditions.n(this.f11561f, "This Search Ad has already been torn down");
        this.f11560e.zzf(zzmVar, this.f11556a);
        this.f11564i = new zzr(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzac(zzcp zzcpVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzbb.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzy(this.f11559d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzr zzg() throws RemoteException {
        return this.f11557b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzbk zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzcl zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzdx zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzea zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzn() throws RemoteException {
        Preconditions.f("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.u0(this.f11561f);
    }

    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbcy.zzd.zze());
        builder.appendQueryParameter(AppLovinEventParameters.SEARCH_QUERY, this.f11560e.zzd());
        builder.appendQueryParameter("pubId", this.f11560e.zzc());
        builder.appendQueryParameter("mappver", this.f11560e.zza());
        Map zze = this.f11560e.zze();
        for (String str : zze.keySet()) {
            builder.appendQueryParameter(str, (String) zze.get(str));
        }
        Uri build = builder.build();
        zzauc zzaucVar = this.f11563h;
        if (zzaucVar != null) {
            try {
                build = zzaucVar.zzb(build, this.f11559d);
            } catch (zzaud e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to process ad data", e8);
            }
        }
        String zzq = zzq();
        String encodedQuery = build.getEncodedQuery();
        return zzq + "#" + encodedQuery;
    }

    public final String zzq() {
        String zzb = this.f11560e.zzb();
        if (true == TextUtils.isEmpty(zzb)) {
            zzb = "www.google.com";
        }
        return "https://" + zzb + ((String) zzbcy.zzd.zze());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzt() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzx() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.f11564i.cancel(true);
        this.f11558c.cancel(false);
        this.f11561f.destroy();
        this.f11561f = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbn zzbnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzz() throws RemoteException {
        Preconditions.f("pause must be called on the main UI thread.");
    }
}
