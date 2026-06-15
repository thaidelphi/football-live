package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.a0;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.ironsource.b9;
import com.ironsource.cc;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzcdy extends WebViewClient implements zzcfi {
    public static final /* synthetic */ int zzb = 0;
    private zzdqf zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final zzeaf zzG;
    private View.OnAttachStateChangeListener zzH;
    protected zzbwn zza;
    private final zzcdq zzc;
    private final zzbak zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzcfg zzi;
    private zzcfh zzj;
    private zzbhe zzk;
    private zzbhg zzl;
    private zzdce zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzac zzw;
    private zzbrg zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbrb zzz = null;
    private final HashSet zzF = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfD)).split(",")));

    public zzcdy(zzcdq zzcdqVar, zzbak zzbakVar, boolean z10, zzbrg zzbrgVar, zzbrb zzbrbVar, zzeaf zzeafVar) {
        this.zzd = zzbakVar;
        this.zzc = zzcdqVar;
        this.zzs = z10;
        this.zzx = zzbrgVar;
        this.zzG = zzeafVar;
    }

    private static WebResourceResponse zzW() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaU)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzX(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = 0;
            while (true) {
                i10++;
                if (i10 <= 20) {
                    int i11 = zzfoi.zzb;
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                    openConnection.setReadTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        com.google.android.gms.ads.internal.zzv.zzq().zzg(this.zzc.getContext(), this.zzc.zzm().afmaVersion, false, httpURLConnection, false, 60000);
                        webResourceResponse = null;
                        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                        zzlVar.zzc(httpURLConnection, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzlVar.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            if (headerField.startsWith("tel:")) {
                                break;
                            }
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Protocol is null");
                                webResourceResponse = zzW();
                                break;
                            } else if (!protocol.equals("http") && !protocol.equals(HttpRequest.DEFAULT_SCHEME)) {
                                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Unsupported scheme: " + protocol);
                                webResourceResponse = zzW();
                                break;
                            } else {
                                String str2 = "Redirecting to " + headerField;
                                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zze(str2);
                                httpURLConnection.disconnect();
                                url = url2;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.zzv.zzq();
            String contentType = httpURLConnection.getContentType();
            String str3 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            com.google.android.gms.ads.internal.zzv.zzq();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i15 = 1;
                    while (true) {
                        if (i15 >= split.length) {
                            break;
                        }
                        if (split[i15].trim().startsWith(cc.M)) {
                            String[] split2 = split[i15].trim().split(b9.i.f16692b);
                            if (split2.length > 1) {
                                str3 = split2[1].trim();
                                break;
                            }
                        }
                        i15++;
                    }
                }
            }
            String str4 = str3;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            webResourceResponse = com.google.android.gms.ads.internal.zzv.zzr().zzb(trim, str4, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzY(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbio) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzZ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(final View view, final zzbwn zzbwnVar, final int i10) {
        if (!zzbwnVar.zzi() || i10 <= 0) {
            return;
        }
        zzbwnVar.zzg(view);
        if (zzbwnVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdr
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdy.this.zzaa(view, zzbwnVar, i10 - 1);
                }
            }, 100L);
        }
    }

    private static final boolean zzab(zzcdq zzcdqVar) {
        return zzcdqVar.zzD() != null && zzcdqVar.zzD().zzb();
    }

    private static final boolean zzac(boolean z10, zzcdq zzcdqVar) {
        return (!z10 || zzcdqVar.zzO().zzi() || zzcdqVar.zzU().equals("interstitial_mb")) ? false : true;
    }

    public static /* synthetic */ void zzh(zzcdy zzcdyVar) {
        zzcdyVar.zzc.zzad();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzcdyVar.zzc.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzn(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaE()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzX();
                return;
            }
            this.zzB = true;
            zzcfh zzcfhVar = this.zzj;
            if (zzcfhVar != null) {
                zzcfhVar.zza();
                this.zzj = null;
            }
            zzk();
            if (this.zzc.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlP)).booleanValue()) {
                    this.zzc.zzL().zzG(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
        this.zzp = i10;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaD(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzn(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbwn zzbwnVar = this.zza;
                        if (zzbwnVar != null) {
                            zzbwnVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdce zzdceVar = this.zzm;
                    if (zzdceVar != null) {
                        zzdceVar.zzdd();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzG().willNotDraw()) {
                try {
                    zzauc zzI = this.zzc.zzI();
                    zzfat zzS = this.zzc.zzS();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlT)).booleanValue() && zzS != null) {
                        if (zzI != null && zzI.zzf(parse)) {
                            Context context = this.zzc.getContext();
                            zzcdq zzcdqVar = this.zzc;
                            parse = zzS.zza(parse, context, (View) zzcdqVar, zzcdqVar.zzi());
                        }
                    } else if (zzI != null && zzI.zzf(parse)) {
                        Context context2 = this.zzc.getContext();
                        zzcdq zzcdqVar2 = this.zzc;
                        parse = zzI.zza(parse, context2, (View) zzcdqVar2, zzcdqVar2.zzi());
                    }
                } catch (zzaud unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar != null && !zzbVar.zzc()) {
                    zzbVar.zzb(str);
                } else {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    zzcdq zzcdqVar3 = this.zzc;
                    zzv(zzcVar, true, false, zzcdqVar3 != null ? zzcdqVar3.zzr() : "");
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        }
        return true;
    }

    public final void zzA(boolean z10, int i10, String str, boolean z11, boolean z12) {
        zzcdq zzcdqVar = this.zzc;
        boolean zzaF = zzcdqVar.zzaF();
        boolean zzac = zzac(zzaF, zzcdqVar);
        boolean z13 = true;
        if (!zzac && z11) {
            z13 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzac ? null : this.zzg;
        zzcdx zzcdxVar = zzaF ? null : new zzcdx(this.zzc, this.zzh);
        zzbhe zzbheVar = this.zzk;
        zzbhg zzbhgVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcdq zzcdqVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(zzaVar, zzcdxVar, zzbheVar, zzbhgVar, zzacVar, zzcdqVar2, z10, i10, str, zzcdqVar2.zzm(), z13 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null, z12));
    }

    public final void zzB(String str, zzbio zzbioVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbioVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzC(zzcfg zzcfgVar) {
        this.zzi = zzcfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzD(int i10, int i11) {
        zzbrb zzbrbVar = this.zzz;
        if (zzbrbVar != null) {
            zzbrbVar.zze(i10, i11);
        }
    }

    public final void zzE(boolean z10) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzF(boolean z10) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzG(boolean z10) {
        synchronized (this.zzf) {
            this.zzv = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzH() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcds
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdy.zzh(zzcdy.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzI(boolean z10) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzJ(zzcfh zzcfhVar) {
        this.zzj = zzcfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzK(zzclc zzclcVar, zzdzu zzdzuVar, zzfhp zzfhpVar) {
        zzO("/click");
        if (zzdzuVar != null && zzfhpVar != null) {
            zzB("/click", new zzfax(this.zzm, zzclcVar, zzfhpVar, zzdzuVar));
            return;
        }
        zzdce zzdceVar = this.zzm;
        zzbio zzbioVar = zzbin.zza;
        zzB("/click", new zzbhm(zzdceVar, zzclcVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzL(zzclc zzclcVar) {
        zzO("/click");
        zzdce zzdceVar = this.zzm;
        zzbio zzbioVar = zzbin.zza;
        zzB("/click", new zzbhm(zzdceVar, zzclcVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzM(zzclc zzclcVar, zzdzu zzdzuVar, zzdqf zzdqfVar) {
        zzO("/open");
        zzB("/open", new zzbja(this.zzy, this.zzz, zzdzuVar, zzdqfVar, zzclcVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzN(zzezu zzezuVar) {
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zzc.getContext())) {
            zzO("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbiu(this.zzc.getContext(), zzezuVar.zzaw));
        }
    }

    public final void zzO(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzP(String str, zzbio zzbioVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbioVar);
        }
    }

    public final void zzQ(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbio> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbio zzbioVar : list) {
                if (predicate.apply(zzbioVar)) {
                    arrayList.add(zzbioVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzR() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzu;
        }
        return z10;
    }

    public final boolean zzS() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzv;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzT() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzs;
        }
        return z10;
    }

    public final boolean zzU() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzt;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzV(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhe zzbheVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbhg zzbhgVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, boolean z10, zzbir zzbirVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbri zzbriVar, zzbwn zzbwnVar, final zzdzu zzdzuVar, final zzfhp zzfhpVar, zzdqf zzdqfVar, zzbji zzbjiVar, zzdce zzdceVar, zzbjh zzbjhVar, zzbjb zzbjbVar, zzbip zzbipVar, zzclc zzclcVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbwnVar, null) : zzbVar;
        this.zzz = new zzbrb(this.zzc, zzbriVar);
        this.zza = zzbwnVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbb)).booleanValue()) {
            zzB("/adMetadata", new zzbhd(zzbheVar));
        }
        if (zzbhgVar != null) {
            zzB("/appEvent", new zzbhf(zzbhgVar));
        }
        zzB("/backButton", zzbin.zzj);
        zzB("/refresh", zzbin.zzk);
        zzB("/canOpenApp", zzbin.zzb);
        zzB("/canOpenURLs", zzbin.zza);
        zzB("/canOpenIntents", zzbin.zzc);
        zzB("/close", zzbin.zzd);
        zzB("/customClose", zzbin.zze);
        zzB("/instrument", zzbin.zzn);
        zzB("/delayPageLoaded", zzbin.zzp);
        zzB("/delayPageClosed", zzbin.zzq);
        zzB("/getLocationInfo", zzbin.zzr);
        zzB("/log", zzbin.zzg);
        zzB("/mraid", new zzbiv(zzbVar2, this.zzz, zzbriVar));
        zzbrg zzbrgVar = this.zzx;
        if (zzbrgVar != null) {
            zzB("/mraidLoaded", zzbrgVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbja(zzbVar2, this.zzz, zzdzuVar, zzdqfVar, zzclcVar));
        zzB("/precache", new zzcby());
        zzB("/touch", zzbin.zzi);
        zzB("/video", zzbin.zzl);
        zzB("/videoMeta", zzbin.zzm);
        if (zzdzuVar != null && zzfhpVar != null) {
            zzB("/click", new zzfax(zzdceVar, zzclcVar, zzfhpVar, zzdzuVar));
            zzB("/httpTrack", new zzbio() { // from class: com.google.android.gms.internal.ads.zzfay
                @Override // com.google.android.gms.internal.ads.zzbio
                public final void zza(Object obj, Map map) {
                    zzcdh zzcdhVar = (zzcdh) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from httpTrack GMSG.");
                        return;
                    }
                    zzezu zzD = zzcdhVar.zzD();
                    if (zzD != null && !zzD.zzai) {
                        zzfhp.this.zzd(str, zzD.zzax, null);
                        return;
                    }
                    zzezx zzR = ((zzcet) zzcdhVar).zzR();
                    if (zzR == null) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                        return;
                    }
                    zzdzuVar.zzd(new zzdzw(com.google.android.gms.ads.internal.zzv.zzC().a(), zzR.zzb, str, 2));
                }
            });
        } else {
            zzB("/click", new zzbhm(zzdceVar, zzclcVar));
            zzB("/httpTrack", zzbin.zzf);
        }
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zzc.getContext())) {
            Map hashMap = new HashMap();
            if (this.zzc.zzD() != null) {
                hashMap = this.zzc.zzD().zzaw;
            }
            zzB("/logScionEvent", new zzbiu(this.zzc.getContext(), hashMap));
        }
        if (zzbirVar != null) {
            zzB("/setInterstitialProperties", new zzbiq(zzbirVar));
        }
        if (zzbjiVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbjiVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjj)).booleanValue() && zzbjhVar != null) {
            zzB("/shareSheet", zzbjhVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjo)).booleanValue() && zzbjbVar != null) {
            zzB("/inspectorOutOfContextTest", zzbjbVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjs)).booleanValue() && zzbipVar != null) {
            zzB("/inspectorStorage", zzbipVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlu)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbin.zzu);
            zzB("/presentPlayStoreOverlay", zzbin.zzv);
            zzB("/expandPlayStoreOverlay", zzbin.zzw);
            zzB("/collapsePlayStoreOverlay", zzbin.zzx);
            zzB("/closePlayStoreOverlay", zzbin.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzds)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbin.zzA);
            zzB("/resetPAID", zzbin.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlO)).booleanValue()) {
            zzcdq zzcdqVar = this.zzc;
            if (zzcdqVar.zzD() != null && zzcdqVar.zzD().zzar) {
                zzB("/writeToLocalStorage", zzbin.zzB);
                zzB("/clearLocalStorageKeys", zzbin.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbheVar;
        this.zzl = zzbhgVar;
        this.zzw = zzacVar;
        this.zzy = zzbVar3;
        this.zzm = zzdceVar;
        this.zzA = zzdqfVar;
        this.zzn = z10;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4 A[Catch: Exception | NoClassDefFoundError -> 0x02c1, Exception -> 0x02c3, TRY_ENTER, TryCatch #14 {Exception | NoClassDefFoundError -> 0x02c1, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:10:0x003a, B:12:0x0048, B:14:0x0064, B:16:0x007d, B:18:0x0094, B:19:0x0097, B:21:0x009a, B:24:0x00b4, B:26:0x00cc, B:28:0x00e5, B:62:0x01a6, B:63:0x01cc, B:89:0x0297, B:77:0x021e, B:78:0x0247, B:75:0x01f4, B:42:0x0145, B:27:0x00d9, B:79:0x0248, B:81:0x0252, B:83:0x0258, B:85:0x028b, B:91:0x02a6, B:93:0x02ac, B:95:0x02ba), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e9 A[Catch: all -> 0x01d0, TryCatch #7 {all -> 0x01d0, blocks: (B:58:0x0182, B:60:0x0194, B:61:0x019b, B:71:0x01d7, B:73:0x01e9, B:74:0x01f0), top: B:106:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0248 A[Catch: Exception | NoClassDefFoundError -> 0x02c1, Exception -> 0x02c3, TryCatch #14 {Exception | NoClassDefFoundError -> 0x02c1, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:10:0x003a, B:12:0x0048, B:14:0x0064, B:16:0x007d, B:18:0x0094, B:19:0x0097, B:21:0x009a, B:24:0x00b4, B:26:0x00cc, B:28:0x00e5, B:62:0x01a6, B:63:0x01cc, B:89:0x0297, B:77:0x021e, B:78:0x0247, B:75:0x01f4, B:42:0x0145, B:27:0x00d9, B:79:0x0248, B:81:0x0252, B:83:0x0258, B:85:0x028b, B:91:0x02a6, B:93:0x02ac, B:95:0x02ba), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0297 A[Catch: Exception | NoClassDefFoundError -> 0x02c1, Exception -> 0x02c3, TryCatch #14 {Exception | NoClassDefFoundError -> 0x02c1, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:10:0x003a, B:12:0x0048, B:14:0x0064, B:16:0x007d, B:18:0x0094, B:19:0x0097, B:21:0x009a, B:24:0x00b4, B:26:0x00cc, B:28:0x00e5, B:62:0x01a6, B:63:0x01cc, B:89:0x0297, B:77:0x021e, B:78:0x0247, B:75:0x01f4, B:42:0x0145, B:27:0x00d9, B:79:0x0248, B:81:0x0252, B:83:0x0258, B:85:0x028b, B:91:0x02a6, B:93:0x02ac, B:95:0x02ba), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ac A[Catch: Exception | NoClassDefFoundError -> 0x02c1, Exception -> 0x02c3, TryCatch #14 {Exception | NoClassDefFoundError -> 0x02c1, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:10:0x003a, B:12:0x0048, B:14:0x0064, B:16:0x007d, B:18:0x0094, B:19:0x0097, B:21:0x009a, B:24:0x00b4, B:26:0x00cc, B:28:0x00e5, B:62:0x01a6, B:63:0x01cc, B:89:0x0297, B:77:0x021e, B:78:0x0247, B:75:0x01f4, B:42:0x0145, B:27:0x00d9, B:79:0x0248, B:81:0x0252, B:83:0x0258, B:85:0x028b, B:91:0x02a6, B:93:0x02ac, B:95:0x02ba), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02bf A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse zzc(java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdy.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzdd() {
        zzdce zzdceVar = this.zzm;
        if (zzdceVar != null) {
            zzdceVar.zzdd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final zzdqf zze() {
        return this.zzA;
    }

    public final void zzk() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbY)).booleanValue() && this.zzc.zzl() != null) {
                zzbbt.zza(this.zzc.zzl().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcfg zzcfgVar = this.zzi;
            boolean z10 = false;
            if (!this.zzC && !this.zzo) {
                z10 = true;
            }
            zzcfgVar.zza(z10, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzl() {
        zzbwn zzbwnVar = this.zza;
        if (zzbwnVar != null) {
            zzbwnVar.zzf();
            this.zza = null;
        }
        zzZ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbrb zzbrbVar = this.zzz;
            if (zzbrbVar != null) {
                zzbrbVar.zzb(true);
                this.zzz = null;
            }
        }
    }

    public final void zzm(boolean z10) {
        this.zzE = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzn(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfC)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfE)).intValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                    zzgap.zzr(com.google.android.gms.ads.internal.zzv.zzq().zzb(uri), new zzcdw(this, list, path, uri), zzbyp.zzf);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            zzY(com.google.android.gms.ads.internal.util.zzs.zzP(uri), list, path);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgC)).booleanValue() || com.google.android.gms.ads.internal.zzv.zzp().zzg() == null) {
            return;
        }
        final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
        zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdt
            @Override // java.lang.Runnable
            public final void run() {
                int i10 = zzcdy.zzb;
                com.google.android.gms.ads.internal.zzv.zzp().zzg().zze(substring);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzo() {
        zzbak zzbakVar = this.zzd;
        if (zzbakVar != null) {
            zzbakVar.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzk();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzp() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzq() {
        this.zzD--;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzr(int i10, int i11, boolean z10) {
        zzbrg zzbrgVar = this.zzx;
        if (zzbrgVar != null) {
            zzbrgVar.zzb(i10, i11);
        }
        zzbrb zzbrbVar = this.zzz;
        if (zzbrbVar != null) {
            zzbrbVar.zzd(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzs() {
        zzbwn zzbwnVar = this.zza;
        if (zzbwnVar != null) {
            WebView zzG = this.zzc.zzG();
            if (a0.T(zzG)) {
                zzaa(zzG, zzbwnVar, 10);
                return;
            }
            zzZ();
            zzcdv zzcdvVar = new zzcdv(this, zzbwnVar);
            this.zzH = zzcdvVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcdvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzu() {
        zzdce zzdceVar = this.zzm;
        if (zzdceVar != null) {
            zzdceVar.zzu();
        }
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) {
        zzcdq zzcdqVar = this.zzc;
        boolean zzaF = zzcdqVar.zzaF();
        boolean z12 = false;
        boolean z13 = zzac(zzaF, zzcdqVar) || z11;
        if (z13 || !z10) {
            z12 = true;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = z13 ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = zzaF ? null : this.zzh;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcdq zzcdqVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(zzcVar, zzaVar, zzrVar, zzacVar, zzcdqVar2.zzm(), zzcdqVar2, z12 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i10) {
        zzeaf zzeafVar = this.zzG;
        zzcdq zzcdqVar = this.zzc;
        zzy(new AdOverlayInfoParcel(zzcdqVar, zzcdqVar.zzm(), str, str2, 14, zzeafVar));
    }

    public final void zzx(boolean z10, int i10, boolean z11) {
        zzcdq zzcdqVar = this.zzc;
        boolean zzac = zzac(zzcdqVar.zzaF(), zzcdqVar);
        boolean z12 = true;
        if (!zzac && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzac ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcdq zzcdqVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(zzaVar, zzrVar, zzacVar, zzcdqVar2, z10, i10, zzcdqVar2.zzm(), z12 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null));
    }

    public final void zzy(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbrb zzbrbVar = this.zzz;
        boolean zzf = zzbrbVar != null ? zzbrbVar.zzf() : false;
        com.google.android.gms.ads.internal.zzv.zzj();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !zzf, this.zzA);
        zzbwn zzbwnVar = this.zza;
        if (zzbwnVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbwnVar.zzh(str);
        }
    }

    public final void zzz(boolean z10, int i10, String str, String str2, boolean z11) {
        zzcdq zzcdqVar = this.zzc;
        boolean zzaF = zzcdqVar.zzaF();
        boolean zzac = zzac(zzaF, zzcdqVar);
        boolean z12 = true;
        if (!zzac && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzac ? null : this.zzg;
        zzcdx zzcdxVar = zzaF ? null : new zzcdx(this.zzc, this.zzh);
        zzbhe zzbheVar = this.zzk;
        zzbhg zzbhgVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcdq zzcdqVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(zzaVar, zzcdxVar, zzbheVar, zzbhgVar, zzacVar, zzcdqVar2, z10, i10, str, str2, zzcdqVar2.zzm(), z12 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null));
    }
}
