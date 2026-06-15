package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzdta;
import com.google.android.gms.internal.ads.zzdte;
import com.google.android.gms.internal.ads.zzgba;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzau {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11401a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdte f11402b;

    /* renamed from: c  reason: collision with root package name */
    private String f11403c;

    /* renamed from: d  reason: collision with root package name */
    private String f11404d;

    /* renamed from: e  reason: collision with root package name */
    private String f11405e;

    /* renamed from: f  reason: collision with root package name */
    private String f11406f;

    /* renamed from: g  reason: collision with root package name */
    private int f11407g;

    /* renamed from: h  reason: collision with root package name */
    private int f11408h;

    /* renamed from: i  reason: collision with root package name */
    private PointF f11409i;

    /* renamed from: j  reason: collision with root package name */
    private PointF f11410j;

    /* renamed from: k  reason: collision with root package name */
    private Handler f11411k;

    /* renamed from: l  reason: collision with root package name */
    private Runnable f11412l;

    public zzau(Context context) {
        this.f11407g = 0;
        this.f11412l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
            @Override // java.lang.Runnable
            public final void run() {
                zzau.zzi(zzau.this);
            }
        };
        this.f11401a = context;
        this.f11408h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzv.zzu().zzb();
        this.f11411k = com.google.android.gms.ads.internal.zzv.zzu().zza();
        this.f11402b = com.google.android.gms.ads.internal.zzv.zzt().zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context) {
        ArrayList arrayList = new ArrayList();
        int c10 = c(arrayList, "None", true);
        final int c11 = c(arrayList, "Shake", true);
        final int c12 = c(arrayList, "Flick", true);
        int ordinal = this.f11402b.zza().ordinal();
        final int i10 = ordinal != 1 ? ordinal != 2 ? c10 : c12 : c11;
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder zzL = zzs.zzL(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        zzL.setTitle("Setup gesture");
        zzL.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        zzL.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                zzau.this.zzr();
            }
        });
        zzL.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                zzau.zzf(zzau.this, atomicInteger, i10, c11, c12, dialogInterface, i11);
            }
        });
        zzL.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzau.this.zzr();
            }
        });
        zzL.create().show();
    }

    private final boolean b(float f10, float f11, float f12, float f13) {
        return Math.abs(this.f11409i.x - f10) < ((float) this.f11408h) && Math.abs(this.f11409i.y - f11) < ((float) this.f11408h) && Math.abs(this.f11410j.x - f12) < ((float) this.f11408h) && Math.abs(this.f11410j.y - f13) < ((float) this.f11408h);
    }

    private static final int c(List list, String str, boolean z10) {
        if (z10) {
            list.add(str);
            return list.size() - 1;
        }
        return -1;
    }

    public static /* synthetic */ void zza(zzau zzauVar) {
        zzay zzt = com.google.android.gms.ads.internal.zzv.zzt();
        String str = zzauVar.f11404d;
        String str2 = zzauVar.f11405e;
        String str3 = zzauVar.f11406f;
        boolean zzm = zzt.zzm();
        Context context = zzauVar.f11401a;
        zzt.zzh(zzt.zzj(context, str, str2));
        if (zzt.zzm()) {
            if (!zzm && !TextUtils.isEmpty(str3)) {
                zzt.zze(context, str2, str3, str);
            }
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Device is linked for debug signals.");
            zzt.a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzt.zzd(context, str, str2);
    }

    public static /* synthetic */ void zzc(final zzau zzauVar, int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 != i10) {
            if (i15 == i11) {
                int i16 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Debug mode [Creative Preview] selected.");
                zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.zzj(zzau.this);
                    }
                });
            } else if (i15 == i12) {
                int i17 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Debug mode [Troubleshooting] selected.");
                zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzat
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.zza(zzau.this);
                    }
                });
            } else if (i15 == i13) {
                zzdte zzdteVar = zzauVar.f11402b;
                final zzgba zzgbaVar = zzbyp.zzf;
                zzgba zzgbaVar2 = zzbyp.zza;
                if (zzdteVar.zzq()) {
                    zzgbaVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.gms.ads.internal.zzv.zzt().zzc(zzau.this.f11401a);
                        }
                    });
                } else {
                    zzgbaVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzau.zzl(zzau.this, zzgbaVar);
                        }
                    });
                }
            } else if (i15 == i14) {
                zzdte zzdteVar2 = zzauVar.f11402b;
                final zzgba zzgbaVar3 = zzbyp.zzf;
                zzgba zzgbaVar4 = zzbyp.zza;
                if (zzdteVar2.zzq()) {
                    zzgbaVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                        @Override // java.lang.Runnable
                        public final void run() {
                            r0.a(zzau.this.f11401a);
                        }
                    });
                } else {
                    zzgbaVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzal
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzau.zzd(zzau.this, zzgbaVar3);
                        }
                    });
                }
            }
        } else if (!(zzauVar.f11401a instanceof Activity)) {
            int i18 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
        } else {
            String str = zzauVar.f11403c;
            final String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                com.google.android.gms.ads.internal.zzv.zzq();
                Map zzP = zzs.zzP(build);
                for (String str3 : zzP.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append((String) zzP.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            AlertDialog.Builder zzL = zzs.zzL(zzauVar.f11401a);
            zzL.setMessage(str2);
            zzL.setTitle("Ad Information");
            zzL.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzah
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i19) {
                    zzau.zzg(zzau.this, str2, dialogInterface2, i19);
                }
            });
            zzL.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzai
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i19) {
                }
            });
            zzL.create().show();
        }
    }

    public static /* synthetic */ void zzd(final zzau zzauVar, zzgba zzgbaVar) {
        if (!com.google.android.gms.ads.internal.zzv.zzt().zzj(zzauVar.f11401a, zzauVar.f11404d, zzauVar.f11405e)) {
            com.google.android.gms.ads.internal.zzv.zzt().zzd(zzauVar.f11401a, zzauVar.f11404d, zzauVar.f11405e);
            return;
        }
        zzgbaVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // java.lang.Runnable
            public final void run() {
                r0.a(zzau.this.f11401a);
            }
        });
    }

    public static /* synthetic */ void zzf(zzau zzauVar, AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                zzauVar.f11402b.zzm(zzdta.SHAKE);
            } else if (atomicInteger.get() == i12) {
                zzauVar.f11402b.zzm(zzdta.FLICK);
            } else {
                zzauVar.f11402b.zzm(zzdta.NONE);
            }
        }
        zzauVar.zzr();
    }

    public static /* synthetic */ void zzg(zzau zzauVar, String str, DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzT(zzauVar.f11401a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public static /* synthetic */ void zzi(zzau zzauVar) {
        zzauVar.f11407g = 4;
        zzauVar.zzr();
    }

    public static /* synthetic */ void zzj(zzau zzauVar) {
        zzay zzt = com.google.android.gms.ads.internal.zzv.zzt();
        Context context = zzauVar.f11401a;
        String str = zzauVar.f11404d;
        String str2 = zzauVar.f11405e;
        if (!zzt.b(context, str, str2)) {
            zzt.a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if (CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(zzt.f11425f)) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Creative is not pushed for this device.");
            zzt.a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzt.f11425f)) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("The app is not linked for creative preview.");
            zzt.zzd(context, str, str2);
        } else if ("0".equals(zzt.f11425f)) {
            int i12 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Device is linked for in app preview.");
            zzt.a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public static /* synthetic */ void zzl(final zzau zzauVar, zzgba zzgbaVar) {
        if (!com.google.android.gms.ads.internal.zzv.zzt().zzj(zzauVar.f11401a, zzauVar.f11404d, zzauVar.f11405e)) {
            com.google.android.gms.ads.internal.zzv.zzt().zzd(zzauVar.f11401a, zzauVar.f11404d, zzauVar.f11405e);
            return;
        }
        zzgbaVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.ads.internal.zzv.zzt().zzc(zzau.this.f11401a);
            }
        });
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f11403c);
        sb.append(",DebugSignal: ");
        sb.append(this.f11406f);
        sb.append(",AFMA Version: ");
        sb.append(this.f11405e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f11404d);
        sb.append("}");
        return sb.toString();
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f11407g = 0;
            this.f11409i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f11407g;
        if (i10 == -1) {
            return;
        }
        if (i10 == 0) {
            if (actionMasked == 5) {
                this.f11407g = 5;
                this.f11410j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f11411k.postDelayed(this.f11412l, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeN)).longValue());
            }
        } else if (i10 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < historySize; i11++) {
                    z10 |= !b(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (b(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                    return;
                }
            }
            this.f11407g = -1;
            this.f11411k.removeCallbacks(this.f11412l);
        }
    }

    public final void zzn(String str) {
        this.f11404d = str;
    }

    public final void zzo(String str) {
        this.f11405e = str;
    }

    public final void zzp(String str) {
        this.f11403c = str;
    }

    public final void zzq(String str) {
        this.f11406f = str;
    }

    public final void zzr() {
        try {
            if (!(this.f11401a instanceof Activity)) {
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzt().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzv.zzt().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int c10 = c(arrayList, "Ad information", true);
            final int c11 = c(arrayList, str, true);
            final int c12 = c(arrayList, str2, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjf)).booleanValue();
            final int c13 = c(arrayList, "Open ad inspector", booleanValue);
            final int c14 = c(arrayList, "Ad inspector settings", booleanValue);
            com.google.android.gms.ads.internal.zzv.zzq();
            AlertDialog.Builder zzL = zzs.zzL(this.f11401a);
            zzL.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzam
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    zzau.zzc(zzau.this, c10, c11, c12, c13, c14, dialogInterface, i11);
                }
            });
            zzL.create().show();
        } catch (WindowManager.BadTokenException e8) {
            zze.zzb("", e8);
        }
    }

    public zzau(Context context, String str) {
        this(context);
        this.f11403c = str;
    }
}
