package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.browser.customtabs.c;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbja implements zzbio {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdqf zzb;
    private final zzbrb zzd;
    private final zzdzu zze;
    private final zzclc zzf;
    private com.google.android.gms.ads.internal.overlay.zzaa zzg = null;
    private final zzgba zzh = zzbyp.zzg;
    private final com.google.android.gms.ads.internal.util.client.zzu zzc = new com.google.android.gms.ads.internal.util.client.zzu(null);

    public zzbja(com.google.android.gms.ads.internal.zzb zzbVar, zzbrb zzbrbVar, zzdzu zzdzuVar, zzdqf zzdqfVar, zzclc zzclcVar) {
        this.zza = zzbVar;
        this.zzd = zzbrbVar;
        this.zze = zzdzuVar;
        this.zzb = zzdqfVar;
        this.zzf = zzclcVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            return "c".equalsIgnoreCase(str) ? 14 : -1;
        }
        return -1;
    }

    static Uri zzc(Context context, zzauc zzaucVar, Uri uri, View view, Activity activity, zzfat zzfatVar) {
        if (zzaucVar == null) {
            return uri;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlT)).booleanValue() && zzfatVar != null) {
                if (zzaucVar.zze(uri)) {
                    uri = zzfatVar.zza(uri, context, view, activity);
                }
            } else if (zzaucVar.zze(uri)) {
                uri = zzaucVar.zza(uri, context, view, activity);
            }
        } catch (zzaud unused) {
        } catch (Exception e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e8) {
            String valueOf = String.valueOf(uri.toString());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error adding click uptime parameter to url: ".concat(valueOf), e8);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z10;
        boolean z11;
        Object obj;
        HashMap hashMap;
        Object obj2;
        boolean z12;
        zzcdq zzcdqVar = (zzcdq) zzaVar;
        zzezu zzD = zzcdqVar.zzD();
        zzezx zzR = zzcdqVar.zzR();
        boolean z13 = false;
        if (zzD == null || zzR == null) {
            str3 = "";
            z10 = false;
        } else {
            String str4 = zzR.zzb;
            z10 = zzD.zzb();
            str3 = str4;
        }
        boolean z14 = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkF)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z15 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmE)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals(com.ironsource.mediationsdk.metadata.a.f18924g);
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcdqVar.zzaF()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            zzk(false);
            ((zzcfa) zzaVar).zzaL(zzf(map), zzb(map), z14);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            boolean z16 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlP)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzcfa) zzaVar).zzaN(zzf(map), zzb(map), str, z14, z16);
            } else {
                ((zzcfa) zzaVar).zzaM(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z14);
            }
        } else {
            Intent intent = null;
            if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
                Context context = zzcdqVar.getContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeM)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                    zzm(10);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeH)).booleanValue()) {
                        if (c.c(context, null) != null) {
                            z13 = true;
                        }
                    } else {
                        z13 = zzbcn.zzg(context);
                    }
                    if (!z13) {
                        zzm(4);
                    } else {
                        zzk(true);
                        if (TextUtils.isEmpty(str)) {
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot open browser with null or empty url");
                            zzm(7);
                            return;
                        }
                        Uri zzd = zzd(zzc(zzcdqVar.getContext(), zzcdqVar.zzI(), Uri.parse(str), zzcdqVar.zzF(), zzcdqVar.zzi(), zzcdqVar.zzS()));
                        if (z10 && this.zze != null && zzl(zzaVar, zzcdqVar.getContext(), zzd.toString(), str3)) {
                            return;
                        }
                        this.zzg = new zzbix(this);
                        ((zzcfa) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.u0(this.zzg).asBinder(), true), z14, z15, str3);
                        return;
                    }
                }
                map.put("use_first_package", com.ironsource.mediationsdk.metadata.a.f18924g);
                map.put("use_running_process", com.ironsource.mediationsdk.metadata.a.f18924g);
                zzj(zzaVar, map, z10, str3, z14, z15);
            } else if ("app".equalsIgnoreCase(str2) && com.ironsource.mediationsdk.metadata.a.f18924g.equalsIgnoreCase((String) map.get("system_browser"))) {
                zzj(zzaVar, map, z10, str3, z14, z15);
            } else if ("open_app".equalsIgnoreCase(str2)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzig)).booleanValue()) {
                    zzk(true);
                    String str5 = (String) map.get("p");
                    if (str5 == null) {
                        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Package name missing from open app action.");
                    } else if (z10 && this.zze != null && zzl(zzaVar, zzcdqVar.getContext(), str5, str3)) {
                    } else {
                        PackageManager packageManager = zzcdqVar.getContext().getPackageManager();
                        if (packageManager == null) {
                            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot get package manager from open app action.");
                            return;
                        }
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                        if (launchIntentForPackage != null) {
                            ((zzcfa) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z14, z15, str3);
                        }
                    }
                }
            } else {
                zzk(true);
                String str6 = (String) map.get("intent_url");
                if (!TextUtils.isEmpty(str6)) {
                    try {
                        intent = Intent.parseUri(str6, 0);
                    } catch (URISyntaxException e8) {
                        String valueOf = String.valueOf(str6);
                        int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error parsing the url: ".concat(valueOf), e8);
                    }
                }
                Intent intent2 = intent;
                if (intent2 != null && intent2.getData() != null) {
                    Uri data = intent2.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri zzd2 = zzd(zzc(zzcdqVar.getContext(), zzcdqVar.zzI(), data, zzcdqVar.zzF(), zzcdqVar.zzi(), zzcdqVar.zzS()));
                        if (!TextUtils.isEmpty(intent2.getType())) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzih)).booleanValue()) {
                                intent2.setDataAndType(zzd2, intent2.getType());
                            }
                        }
                        intent2.setData(zzd2);
                    }
                }
                boolean z17 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziC)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
                HashMap hashMap2 = new HashMap();
                if (z17) {
                    obj = "p";
                    obj2 = "event_id";
                    z11 = z15;
                    hashMap = hashMap2;
                    this.zzg = new zzbiy(this, z14, zzaVar, hashMap2, map);
                    z12 = false;
                } else {
                    z11 = z15;
                    obj = "p";
                    hashMap = hashMap2;
                    obj2 = "event_id";
                    z12 = z14;
                }
                if (intent2 != null) {
                    if (!z10 || this.zze == null || !zzl(zzaVar, zzcdqVar.getContext(), intent2.getData().toString(), str3)) {
                        ((zzcfa) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z12, z11, str3);
                        return;
                    } else if (z17) {
                        hashMap.put((String) map.get(obj2), Boolean.TRUE);
                        ((zzblj) zzaVar).zzd("openIntentAsync", hashMap);
                        return;
                    } else {
                        return;
                    }
                }
                boolean z18 = z11;
                String uri = !TextUtils.isEmpty(str) ? zzd(zzc(zzcdqVar.getContext(), zzcdqVar.zzI(), Uri.parse(str), zzcdqVar.zzF(), zzcdqVar.zzi(), zzcdqVar.zzS())).toString() : str;
                if (!z10 || this.zze == null || !zzl(zzaVar, zzcdqVar.getContext(), uri, str3)) {
                    ((zzcfa) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), uri, (String) map.get("m"), (String) map.get(obj), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzg), z12, z18, str3);
                } else if (z17) {
                    hashMap.put((String) map.get(obj2), Boolean.TRUE);
                    ((zzblj) zzaVar).zzd("openIntentAsync", hashMap);
                }
            }
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdqf zzdqfVar = this.zzb;
        if (zzdqfVar != null) {
            zzeaf.zzp(context, zzdqfVar, this.zze, str, "dialog_not_shown", zzfvy.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
        if (com.google.android.gms.internal.ads.zzbiz.zzc(r2, r12, r13, r14, r15) == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0157, code lost:
        r22 = r7;
        r11 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzj(com.google.android.gms.ads.internal.client.zza r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbja.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzk(boolean z10) {
        zzbrb zzbrbVar = this.zzd;
        if (zzbrbVar != null) {
            zzbrbVar.zzb(z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zziw)).booleanValue() != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c8, code lost:
        if (r4 != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbja.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i10) {
        zzdqf zzdqfVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeG)).booleanValue() || (zzdqfVar = this.zzb) == null) {
            return;
        }
        zzdqe zza = zzdqfVar.zza();
        zza.zzb("action", "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zza.zzb("cct_open_status", str);
        zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        b6.a zzh;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzcdq zzcdqVar = (zzcdq) zzaVar;
        if (zzcdqVar.zzD() != null) {
            hashMap = zzcdqVar.zzD().zzaw;
        }
        String zzc = zzbxd.zzc(str, zzcdqVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            zzbVar.zzb(zzc);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjW)).booleanValue() && this.zzf != null && zzclc.zzj(zzc)) {
            zzh = this.zzf.zze(zzc, com.google.android.gms.ads.internal.client.zzbb.zze());
        } else {
            zzh = zzgap.zzh(zzc);
        }
        zzgap.zzr(zzh, new zzbiw(this, map, zzaVar, str2), this.zzh);
    }
}
