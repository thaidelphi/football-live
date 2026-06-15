package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.b;
import androidx.core.app.m;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeaf extends zzbrv {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdqf zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzdzu zze;
    private String zzf;
    private String zzg;

    public zzeaf(Context context, zzdzu zzdzuVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdqf zzdqfVar) {
        this.zzb = context;
        this.zzc = zzdqfVar;
        this.zzd = zzuVar;
        this.zze = zzdzuVar;
    }

    public static /* synthetic */ void zzc(zzeaf zzeafVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        zzeafVar.zze.zzc(zzeafVar.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeafVar.zzw(zzeafVar.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public static /* synthetic */ void zzd(zzeaf zzeafVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        zzeafVar.zze.zzc(zzeafVar.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeafVar.zzw(zzeafVar.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public static /* synthetic */ void zzk(zzeaf zzeafVar, Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzeafVar.zzw(zzeafVar.zzf, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzv.zzr().zzf(activity));
        zzeafVar.zzx();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public static /* synthetic */ void zzl(zzeaf zzeafVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        zzeafVar.zze.zzc(zzeafVar.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeafVar.zzw(zzeafVar.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public static /* synthetic */ void zzm(zzeaf zzeafVar, Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzeafVar.zzw(zzeafVar.zzf, "dialog_click", hashMap);
        zzeafVar.zzy(activity, zzmVar);
    }

    public static /* synthetic */ void zzn(zzeaf zzeafVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        zzeafVar.zze.zzc(zzeafVar.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeafVar.zzw(zzeafVar.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public static void zzo(Context context, zzdqf zzdqfVar, zzdzu zzdzuVar, String str, String str2) {
        zzp(context, zzdqfVar, zzdzuVar, str, str2, new HashMap());
    }

    public static void zzp(Context context, zzdqf zzdqfVar, zzdzu zzdzuVar, String str, String str2, Map map) {
        String str3;
        String str4 = true != com.google.android.gms.ads.internal.zzv.zzp().zzA(context) ? "offline" : b.ONLINE_EXTRAS_KEY;
        if (zzdqfVar != null) {
            zzdqe zza = zzdqfVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", str4);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza.zze();
        } else {
            str3 = "";
        }
        zzdzuVar.zzd(new zzdzw(com.google.android.gms.ads.internal.zzv.zzC().a(), str, str3, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT >= 29 && str.equals("offline_notification_clicked")) {
            intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
            return zzfps.zza(context, 0, intent, 201326592);
        }
        intent.setClassName(context, AdService.CLASS_NAME);
        ClipData clipData = zzfps.zza;
        return zzfps.zzb(context, 0, intent, 1140850688, 0);
    }

    private final AlertDialog zzs(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzL(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzdzx
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        XmlResourceParser zzt = zzt(R.layout.offline_ads_dialog);
        if (zzt == null) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View inflate = activity.getLayoutInflater().inflate(zzt, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzu = zzu();
            if (!TextUtils.isEmpty(zzu)) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzu);
            }
            zzdzm zzdzmVar = (zzdzm) this.zza.get(this.zzf);
            Drawable zza = zzdzmVar != null ? zzdzmVar.zza() : null;
            if (zza != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(zza);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static XmlResourceParser zzt(int i10) {
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (zze == null) {
            return null;
        }
        try {
            return zze.getLayout(i10);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzu() {
        zzdzm zzdzmVar = (zzdzm) this.zza.get(this.zzf);
        return zzdzmVar == null ? "" : zzdzmVar.zzb();
    }

    private static String zzv(int i10, String str) {
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (zze == null) {
            return str;
        }
        try {
            return zze.getString(i10);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzp(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzx() {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch: android.os.RemoteException -> L40
            android.content.Context r0 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.ads.internal.util.zzbr r0 = com.google.android.gms.ads.internal.util.zzs.zzA(r0)     // Catch: android.os.RemoteException -> L40
            android.content.Context r1 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.u0(r1)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.ads.internal.offline.buffering.zza r2 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L40
            java.util.Map r5 = r6.zza     // Catch: android.os.RemoteException -> L40
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.internal.ads.zzdzm r5 = (com.google.android.gms.internal.ads.zzdzm) r5     // Catch: android.os.RemoteException -> L40
            if (r5 != 0) goto L22
            java.lang.String r5 = ""
            goto L26
        L22:
            java.lang.String r5 = r5.zzc()     // Catch: android.os.RemoteException -> L40
        L26:
            r2.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzg(r1, r2)     // Catch: android.os.RemoteException -> L40
            if (r1 != 0) goto L49
            android.content.Context r2 = r6.zzb     // Catch: android.os.RemoteException -> L3e
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.u0(r2)     // Catch: android.os.RemoteException -> L3e
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L3e
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L3e
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L3e
            goto L49
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r0 = move-exception
            r1 = 0
        L42:
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r0)
        L49:
            if (r1 != 0) goto L5d
            com.google.android.gms.internal.ads.zzdzu r0 = r6.zze
            java.lang.String r1 = r6.zzf
            r0.zzc(r1)
            java.lang.String r0 = r6.zzf
            com.google.android.gms.internal.ads.zzfvy r1 = com.google.android.gms.internal.ads.zzfvy.zzd()
            java.lang.String r2 = "offline_notification_worker_not_scheduled"
            r6.zzw(r0, r2, r1)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeaf.zzx():void");
    }

    private final void zzy(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (m.b(activity).a()) {
            zzx();
            zzz(activity, zzmVar);
        } else if (Build.VERSION.SDK_INT < 33) {
            com.google.android.gms.ads.internal.zzv.zzq();
            AlertDialog.Builder zzL = com.google.android.gms.ads.internal.util.zzs.zzL(activity);
            zzL.setTitle(zzv(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzv(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdzy
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzeaf.zzk(zzeaf.this, activity, zzmVar, dialogInterface, i10);
                }
            }).setNegativeButton(zzv(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdzz
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzeaf.zzc(zzeaf.this, zzmVar, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeaa
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzeaf.zzd(zzeaf.this, zzmVar, dialogInterface);
                }
            });
            zzL.create().show();
            zzw(this.zzf, "rtsdi", zzfvy.zzd());
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            zzw(this.zzf, "asnpdi", zzfvy.zzd());
        }
    }

    private final void zzz(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog zzs = zzs(activity, zzmVar);
        zzs.show();
        Timer timer = new Timer();
        timer.schedule(new zzeae(this, zzs, timer, zzmVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                boolean zzA = com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zzb);
                HashMap hashMap = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    r8 = true == zzA ? (char) 1 : (char) 2;
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        this.zzb.startActivity(launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (r8 == 1) {
                        this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzdzu.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e8) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e8.toString());
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(concat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                zzeah zzeahVar = (zzeah) ObjectWrapper.t0(iObjectWrapper);
                Activity zza = zzeahVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzeahVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i10] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzx();
                    zzz(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzeah zzeahVar = (zzeah) ObjectWrapper.t0(iObjectWrapper);
        final Activity zza = zzeahVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzeahVar.zzb();
        this.zzf = zzeahVar.zzc();
        this.zzg = zzeahVar.zzd();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzis)).booleanValue()) {
            zzw(this.zzf, "dialog_impression", zzfvy.zzd());
            com.google.android.gms.ads.internal.zzv.zzq();
            AlertDialog.Builder zzL = com.google.android.gms.ads.internal.util.zzs.zzL(zza);
            zzL.setTitle(zzv(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzv(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzv(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeab
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzeaf.zzm(zzeaf.this, zza, zzb, dialogInterface, i10);
                }
            }).setNegativeButton(zzv(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeac
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzeaf.zzl(zzeaf.this, zzb, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzead
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzeaf.zzn(zzeaf.this, zzb, dialogInterface);
                }
            });
            zzL.create().show();
            return;
        }
        zzy(zza, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zze(new zzfdx() { // from class: com.google.android.gms.internal.ads.zzdzn
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final Object zza(Object obj) {
                zzdzu.zzb(com.google.android.gms.ads.internal.util.client.zzu.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(1:28)|4|(9:8|9|(2:21|22)|11|12|13|14|15|16)|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d8, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d9, code lost:
        r11.put("notification_not_shown_reason", r10.getMessage());
        r10 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbrw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r10, com.google.android.gms.ads.internal.offline.buffering.zza r11) {
        /*
            r9 = this;
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.t0(r10)
            android.content.Context r10 = (android.content.Context) r10
            java.lang.String r0 = r11.zza
            java.lang.String r1 = r11.zzb
            java.lang.String r11 = r11.zzc
            java.lang.String r2 = r9.zzu()
            com.google.android.gms.ads.internal.util.zzaa r3 = com.google.android.gms.ads.internal.zzv.zzr()
            java.lang.String r4 = "offline_notification_channel"
            java.lang.String r5 = "AdMob Offline Notifications"
            r3.zzh(r10, r4, r5)
            java.lang.String r3 = "offline_notification_clicked"
            android.app.PendingIntent r3 = zzr(r10, r3, r1, r0)
            java.lang.String r5 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = zzr(r10, r5, r1, r0)
            androidx.core.app.j$e r5 = new androidx.core.app.j$e
            r5.<init>(r10, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            r6 = 1
            if (r4 != 0) goto L48
            int r4 = com.google.android.gms.ads.impl.R.string.offline_notification_title_with_advertiser
            java.lang.String r7 = "You are back online! Continue learning about %s"
            java.lang.String r4 = zzv(r4, r7)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r2
            java.lang.String r2 = java.lang.String.format(r4, r7)
            r5.k(r2)
            goto L53
        L48:
            int r2 = com.google.android.gms.ads.impl.R.string.offline_notification_title
            java.lang.String r4 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = zzv(r2, r4)
            r5.k(r2)
        L53:
            androidx.core.app.j$e r2 = r5.f(r6)
            androidx.core.app.j$e r0 = r2.m(r0)
            androidx.core.app.j$e r0 = r0.i(r3)
            android.content.pm.ApplicationInfo r2 = r10.getApplicationInfo()
            int r2 = r2.icon
            androidx.core.app.j$e r0 = r0.v(r2)
            com.google.android.gms.internal.ads.zzbbd r2 = com.google.android.gms.internal.ads.zzbbm.zzit
            com.google.android.gms.internal.ads.zzbbk r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.t(r2)
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zziv
            com.google.android.gms.internal.ads.zzbbk r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto La7
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto La7
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> La7
            r0.<init>(r11)     // Catch: java.io.IOException -> La7
            java.net.URLConnection r11 = r0.openConnection()     // Catch: java.io.IOException -> La7
            java.io.InputStream r11 = r11.getInputStream()     // Catch: java.io.IOException -> La7
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r11)     // Catch: java.io.IOException -> La7
            goto La8
        La7:
            r11 = r2
        La8:
            if (r11 == 0) goto Lbe
            androidx.core.app.j$e r0 = r5.o(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            androidx.core.app.j$b r3 = new androidx.core.app.j$b     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            r3.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            androidx.core.app.j$b r11 = r3.i(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            androidx.core.app.j$b r11 = r11.h(r2)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            r0.x(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
        Lbe:
            java.lang.String r11 = "notification"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.app.NotificationManager r10 = (android.app.NotificationManager) r10
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r0 = 54321(0xd431, float:7.612E-41)
            android.app.Notification r2 = r5.b()     // Catch: java.lang.IllegalArgumentException -> Ld8
            r10.notify(r1, r0, r2)     // Catch: java.lang.IllegalArgumentException -> Ld8
            java.lang.String r10 = "offline_notification_impression"
            goto Le4
        Ld8:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "notification_not_shown_reason"
            r11.put(r0, r10)
            java.lang.String r10 = "offline_notification_failed"
        Le4:
            r9.zzw(r1, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeaf.zzj(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza):void");
    }

    public final void zzq(String str, zzdgr zzdgrVar) {
        String zzx = zzdgrVar.zzx();
        String zzB = zzdgrVar.zzB();
        String str2 = "";
        if (TextUtils.isEmpty(zzx)) {
            zzx = zzB != null ? zzB : "";
        }
        zzbey zzm = zzdgrVar.zzm();
        if (zzm != null) {
            try {
                str2 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbey zzn = zzdgrVar.zzn();
        Drawable drawable = null;
        if (zzn != null) {
            try {
                IObjectWrapper zzf = zzn.zzf();
                if (zzf != null) {
                    drawable = (Drawable) ObjectWrapper.t0(zzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzdzi(zzx, str2, drawable));
    }
}
