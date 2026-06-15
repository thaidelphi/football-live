package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import com.ironsource.b9;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzob {
    static final zzfvy zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzob zza = new zzob(zzfvv.zzo(zzoa.zza));
    @SuppressLint({"InlinedApi"})
    private static final zzfvv zzc = zzfvv.zzq(2, 5, 6);

    static {
        zzfvx zzfvxVar = new zzfvx();
        zzfvxVar.zza(5, 6);
        zzfvxVar.zza(17, 6);
        zzfvxVar.zza(7, 6);
        zzfvxVar.zza(30, 10);
        zzfvxVar.zza(18, 6);
        zzfvxVar.zza(6, 8);
        zzfvxVar.zza(8, 8);
        zzfvxVar.zza(14, 8);
        zzb = zzfvxVar.zzc();
    }

    private zzob(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzoa zzoaVar = (zzoa) list.get(i10);
            this.zzd.put(zzoaVar.zzb, zzoaVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzd.size(); i12++) {
            i11 = Math.max(i11, ((zzoa) this.zzd.valueAt(i12)).zzc);
        }
        this.zze = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"UnprotectedReceiver"})
    public static zzob zzc(Context context, zze zzeVar, zzoh zzohVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzeVar, zzohVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"InlinedApi"})
    public static zzob zzd(Context context, Intent intent, zze zzeVar, zzoh zzohVar) {
        Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        Objects.requireNonNull(systemService);
        AudioManager audioManager = (AudioManager) systemService;
        zzoh zzohVar2 = null;
        if (zzohVar == null) {
            if (zzeh.zza >= 33) {
                try {
                    List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzeVar.zza().zza);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        zzohVar2 = new zzoh((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
            zzohVar = zzohVar2;
        }
        int i10 = zzeh.zza;
        if (i10 >= 33 && (zzeh.zzM(context) || zzeh.zzI(context))) {
            List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzeVar.zza().zza);
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(zzfyy.zzg(12)));
            for (int i11 = 0; i11 < directProfilesForAttributes.size(); i11++) {
                AudioProfile audioProfile = (AudioProfile) directProfilesForAttributes.get(i11);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (zzeh.zzJ(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            Objects.requireNonNull(set);
                            set.addAll(zzfyy.zzg(audioProfile.getChannelMasks()));
                        } else {
                            hashMap.put(valueOf, new HashSet(zzfyy.zzg(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            int i12 = zzfvv.zzd;
            zzfvs zzfvsVar = new zzfvs();
            for (Map.Entry entry : hashMap.entrySet()) {
                zzfvsVar.zzf(new zzoa(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzob(zzfvsVar.zzi());
        }
        AudioDeviceInfo[] devices = zzohVar == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{zzohVar.zza};
        zzfvz zzfvzVar = new zzfvz();
        zzfvzVar.zzg(8, 7);
        if (i10 >= 31) {
            zzfvzVar.zzg(26, 27);
        }
        if (i10 >= 33) {
            zzfvzVar.zzf((Object) 30);
        }
        zzfwa zzi = zzfvzVar.zzi();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (zzi.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return zza;
            }
        }
        zzfvz zzfvzVar2 = new zzfvz();
        zzfvzVar2.zzf((Object) 2);
        if (zzeh.zza >= 29 && (zzeh.zzM(context) || zzeh.zzI(context))) {
            int i13 = zzfvv.zzd;
            zzfvs zzfvsVar2 = new zzfvs();
            zzfyb it = zzb.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (zzeh.zza >= zzeh.zzh(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzeVar.zza().zza)) {
                    zzfvsVar2.zzf(Integer.valueOf(intValue));
                }
            }
            zzfvsVar2.zzf((Object) 2);
            zzfvzVar2.zzh(zzfvsVar2.zzi());
            return new zzob(zze(zzfyy.zzh(zzfvzVar2.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z10 || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzfvzVar2.zzh(zzc);
        }
        if (intent != null && !z10 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                zzfvzVar2.zzh(zzfyy.zzg(intArrayExtra));
            }
            return new zzob(zze(zzfyy.zzh(zzfvzVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new zzob(zze(zzfyy.zzh(zzfvzVar2.zzi()), 10));
    }

    private static zzfvv zze(int[] iArr, int i10) {
        int i11 = zzfvv.zzd;
        zzfvs zzfvsVar = new zzfvs();
        for (int i12 : iArr) {
            zzfvsVar.zzf(new zzoa(i12, i10));
        }
        return zzfvsVar.zzi();
    }

    private static boolean zzf() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r1.contentEquals(r3) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.zzob
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzob r9 = (com.google.android.gms.internal.ads.zzob) r9
            android.util.SparseArray r1 = r8.zzd
            android.util.SparseArray r3 = r9.zzd
            int r4 = com.google.android.gms.internal.ads.zzeh.zza
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = r1.contentEquals(r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = r2
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.zze
            int r9 = r9.zze
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzob.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        int i11 = zzeh.zza;
        SparseArray sparseArray = this.zzd;
        if (i11 >= 31) {
            i10 = sparseArray.contentHashCode();
        } else {
            int i12 = 17;
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                i12 = (((i12 * 31) + sparseArray.keyAt(i13)) * 31) + Objects.hashCode(sparseArray.valueAt(i13));
            }
            i10 = i12;
        }
        return this.zze + (i10 * 31);
    }

    public final String toString() {
        String obj = this.zzd.toString();
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + obj + b9.i.f16698e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (com.google.android.gms.internal.ads.zzeh.zzG(r8.zzd, 30) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
        if (r6 != 5) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzz r9, com.google.android.gms.internal.ads.zze r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.zzo
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = r9.zzk
            int r0 = com.google.android.gms.internal.ads.zzay.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfvy r1 = com.google.android.gms.internal.ads.zzob.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L19
            goto Lc3
        L19:
            r1 = 7
            r2 = 6
            r3 = 8
            r4 = 18
            if (r0 != r4) goto L2c
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzeh.zzG(r0, r4)
            if (r0 != 0) goto L2b
            r0 = r2
            goto L47
        L2b:
            r0 = r4
        L2c:
            if (r0 != r3) goto L3a
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzeh.zzG(r0, r3)
            if (r0 == 0) goto L38
            r0 = r3
            goto L3a
        L38:
            r0 = r1
            goto L47
        L3a:
            r5 = 30
            if (r0 != r5) goto L47
            android.util.SparseArray r6 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzeh.zzG(r6, r5)
            if (r5 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r5 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzeh.zzG(r5, r0)
            if (r5 == 0) goto Lc3
            android.util.SparseArray r5 = r8.zzd
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzoa r5 = (com.google.android.gms.internal.ads.zzoa) r5
            java.util.Objects.requireNonNull(r5)
            int r6 = r9.zzE
            r7 = -1
            if (r6 == r7) goto L7e
            if (r0 != r4) goto L62
            goto L7e
        L62:
            java.lang.String r9 = r9.zzo
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L77
            int r9 = com.google.android.gms.internal.ads.zzeh.zza
            r10 = 33
            if (r9 >= r10) goto L77
            r9 = 10
            if (r6 <= r9) goto L89
            goto Lc3
        L77:
            boolean r9 = r5.zzb(r6)
            if (r9 != 0) goto L89
            goto Lc3
        L7e:
            int r9 = r9.zzF
            if (r9 != r7) goto L85
            r9 = 48000(0xbb80, float:6.7262E-41)
        L85:
            int r6 = r5.zza(r9, r10)
        L89:
            int r9 = com.google.android.gms.internal.ads.zzeh.zza
            r10 = 28
            if (r9 > r10) goto L9d
            if (r6 != r1) goto L93
            r2 = r3
            goto L9e
        L93:
            r10 = 3
            if (r6 == r10) goto L9e
            r10 = 4
            if (r6 == r10) goto L9e
            r10 = 5
            if (r6 != r10) goto L9d
            goto L9e
        L9d:
            r2 = r6
        L9e:
            r10 = 26
            if (r9 > r10) goto Lb0
            java.lang.String r9 = com.google.android.gms.internal.ads.zzeh.zzb
            java.lang.String r10 = "fugu"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto Lb0
            r9 = 1
            if (r2 != r9) goto Lb0
            r2 = 2
        Lb0:
            int r9 = com.google.android.gms.internal.ads.zzeh.zzi(r2)
            if (r9 == 0) goto Lc3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        Lc3:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzob.zzb(com.google.android.gms.internal.ads.zzz, com.google.android.gms.internal.ads.zze):android.util.Pair");
    }
}
