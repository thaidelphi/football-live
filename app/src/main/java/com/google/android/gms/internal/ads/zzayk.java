package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import com.ironsource.b9;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzayk extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzayb zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzayk() {
        zzayb zzaybVar = new zzayb();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzaybVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbdd.zzd.zze()).intValue();
        this.zzg = ((Long) zzbdd.zza.zze()).intValue();
        this.zzh = ((Long) zzbdd.zze.zze()).intValue();
        this.zzi = ((Long) zzbdd.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzae)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaf)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzag)).intValue();
        this.zze = ((Long) zzbdd.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzai);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaj)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzak)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzal)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:3)(2:31|(2:36|(3:39|(3:41|42|(6:50|(1:52)(5:53|54|55|(1:59)|(1:61))|6|7|e5|20))|37)))|4|5|6|7|e5) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e6 A[EXC_TOP_SPLITTER, LOOP:1: B:63:0x00e6->B:68:0x00e6, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayk.run():void");
    }

    final zzayj zza(View view, zzaya zzayaVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzayaVar.zzh(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzayj(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof zzcdq)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.d()) {
                    zzayaVar.zzf();
                    webView.post(new zzayi(this, zzayaVar, webView, globalVisibleRect));
                    return new zzayj(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    zzayj zza = zza(viewGroup.getChildAt(i12), zzayaVar);
                    i10 += zza.zza;
                    i11 += zza.zzb;
                }
                return new zzayj(this, i10, i11);
            }
        }
        return new zzayj(this, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r11 == 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzaya r9 = new com.google.android.gms.internal.ads.zzaya     // Catch: java.lang.Exception -> L7e
            int r1 = r10.zzf     // Catch: java.lang.Exception -> L7e
            int r2 = r10.zzg     // Catch: java.lang.Exception -> L7e
            int r3 = r10.zzh     // Catch: java.lang.Exception -> L7e
            int r4 = r10.zzi     // Catch: java.lang.Exception -> L7e
            int r5 = r10.zzj     // Catch: java.lang.Exception -> L7e
            int r6 = r10.zzk     // Catch: java.lang.Exception -> L7e
            int r7 = r10.zzl     // Catch: java.lang.Exception -> L7e
            boolean r8 = r10.zzo     // Catch: java.lang.Exception -> L7e
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzayf r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch: java.lang.Exception -> L7e
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L52
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L7e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L7e
            if (r1 != 0) goto L52
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzbbd r2 = com.google.android.gms.internal.ads.zzbbm.zzah     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzbbk r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Exception -> L7e
            java.lang.Object r2 = r3.zzb(r2)     // Catch: java.lang.Exception -> L7e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L7e
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch: java.lang.Exception -> L7e
            java.lang.Object r0 = r11.getTag(r0)     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L52
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L7e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L7e
            if (r0 != 0) goto L77
        L52:
            com.google.android.gms.internal.ads.zzayj r11 = r10.zza(r11, r9)     // Catch: java.lang.Exception -> L7e
            r9.zzj()     // Catch: java.lang.Exception -> L7e
            int r0 = r11.zza     // Catch: java.lang.Exception -> L7e
            if (r0 != 0) goto L61
            int r0 = r11.zzb     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L77
        L61:
            int r11 = r11.zzb     // Catch: java.lang.Exception -> L7e
            if (r11 != 0) goto L6c
            int r11 = r9.zzb()     // Catch: java.lang.Exception -> L7e
            if (r11 == 0) goto L77
            goto L6e
        L6c:
            if (r11 != 0) goto L78
        L6e:
            com.google.android.gms.internal.ads.zzayb r11 = r10.zzd     // Catch: java.lang.Exception -> L7e
            boolean r11 = r11.zzc(r9)     // Catch: java.lang.Exception -> L7e
            if (r11 != 0) goto L77
            goto L78
        L77:
            return
        L78:
            com.google.android.gms.internal.ads.zzayb r11 = r10.zzd     // Catch: java.lang.Exception -> L7e
            r11.zza(r9)     // Catch: java.lang.Exception -> L7e
            return
        L7e:
            r11 = move-exception
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r11)
            com.google.android.gms.internal.ads.zzbyf r0 = com.google.android.gms.ads.internal.zzv.zzp()
            java.lang.String r1 = "ContentFetchTask.fetchContent"
            r0.zzw(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayk.zzb(android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(zzaya zzayaVar, WebView webView, String str, boolean z10) {
        zzayaVar.zze();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(b9.h.K0);
                if (!this.zzn && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    zzayaVar.zzi(title + "\n" + optString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzayaVar.zzi(optString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzayaVar.zzl()) {
                this.zzd.zzb(zzayaVar);
            }
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Json string may be malformed.");
        } catch (Throwable th) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzd() {
        synchronized (this.zzc) {
            if (this.zza) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Content hash thread already started, quitting...");
                return;
            }
            this.zza = true;
            start();
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: paused, pause = true");
        }
    }
}
