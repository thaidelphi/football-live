package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfkt {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final HashSet zzh = new HashSet();
    private final Map zzi = new WeakHashMap();
    private boolean zzj;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfks zzb(View view) {
        zzfks zzfksVar = (zzfks) this.zzb.get(view);
        if (zzfksVar != null) {
            this.zzb.remove(view);
        }
        return zzfksVar;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final void zzh() {
        this.zzj = true;
    }

    public final void zzi() {
        Boolean bool;
        Activity activity;
        zzfjq zza = zzfjq.zza();
        if (zza != null) {
            for (zzfiz zzfizVar : zza.zzb()) {
                View zzf = zzfizVar.zzf();
                if (zzfizVar.zzj()) {
                    String zzh = zzfizVar.zzh();
                    if (zzf != null) {
                        boolean z10 = false;
                        String str = null;
                        if (Build.VERSION.SDK_INT >= 24) {
                            Context context = zzf.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                    break;
                                } else if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (activity != null) {
                                z10 = activity.isInPictureInPictureMode();
                            }
                        }
                        if (z10) {
                            this.zzh.add(zzh);
                        }
                        if (zzf.isAttachedToWindow()) {
                            if (zzf.hasWindowFocus()) {
                                this.zzi.remove(zzf);
                                bool = Boolean.FALSE;
                            } else if (this.zzi.containsKey(zzf)) {
                                bool = (Boolean) this.zzi.get(zzf);
                            } else {
                                Map map = this.zzi;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(zzf, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || z10) {
                                HashSet hashSet = new HashSet();
                                View view = zzf;
                                while (true) {
                                    if (view != null) {
                                        String zza2 = zzfkr.zza(view);
                                        if (zza2 != null) {
                                            str = zza2;
                                            break;
                                        }
                                        hashSet.add(view);
                                        ViewParent parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    } else {
                                        this.zzd.addAll(hashSet);
                                        break;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.zze.add(zzh);
                            this.zza.put(zzf, zzh);
                            for (zzfjt zzfjtVar : zzfizVar.zzi()) {
                                View view2 = (View) zzfjtVar.zzb().get();
                                if (view2 != null) {
                                    zzfks zzfksVar = (zzfks) this.zzb.get(view2);
                                    if (zzfksVar != null) {
                                        zzfksVar.zzc(zzfizVar.zzh());
                                    } else {
                                        this.zzb.put(view2, new zzfks(zzfjtVar, zzfizVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(zzh);
                            this.zzc.put(zzh, zzf);
                            this.zzg.put(zzh, str);
                        }
                    } else {
                        this.zzf.add(zzh);
                        this.zzg.put(zzh, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(String str) {
        return this.zzh.contains(str);
    }

    public final boolean zzk(View view) {
        if (this.zzi.containsKey(view)) {
            this.zzi.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public final int zzl(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzj ? 2 : 3;
    }
}
