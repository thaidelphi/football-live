package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzqf implements zzpf {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private boolean zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private long zzI;
    private float zzJ;
    private ByteBuffer zzK;
    private int zzL;
    private ByteBuffer zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private zzf zzS;
    private zzoh zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;
    private Looper zzX;
    private long zzY;
    private long zzZ;
    private Handler zzaa;
    private final zzpv zzab;
    private final zzpl zzac;
    private final Context zzd;
    private final zzpk zze;
    private final zzqp zzf;
    private final zzfvv zzg;
    private final zzfvv zzh;
    private final zzpj zzi;
    private final ArrayDeque zzj;
    private zzqd zzk;
    private final zzpz zzl;
    private final zzpz zzm;
    private zznz zzn;
    private zzpc zzo;
    private zzpu zzp;
    private zzpu zzq;
    private zzcd zzr;
    private AudioTrack zzs;
    private zzob zzt;
    private zzog zzu;
    private zzpy zzv;
    private zze zzw;
    private zzpw zzx;
    private zzpw zzy;
    private zzbb zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzqf(zzpt zzptVar, zzqe zzqeVar) {
        Context zza2 = zzpt.zza(zzptVar);
        this.zzd = zza2;
        this.zzw = zze.zza;
        this.zzt = zza2 != null ? null : zzpt.zzb(zzptVar);
        this.zzab = zzpt.zzd(zzptVar);
        int i10 = zzeh.zza;
        zzpl zze = zzpt.zze(zzptVar);
        Objects.requireNonNull(zze);
        this.zzac = zze;
        this.zzi = new zzpj(new zzqa(this, null));
        zzpk zzpkVar = new zzpk();
        this.zze = zzpkVar;
        zzqp zzqpVar = new zzqp();
        this.zzf = zzqpVar;
        this.zzg = zzfvv.zzq(new zzck(), zzpkVar, zzqpVar);
        this.zzh = zzfvv.zzo(new zzqo());
        this.zzJ = 1.0f;
        this.zzR = 0;
        this.zzS = new zzf(0, 0.0f);
        zzbb zzbbVar = zzbb.zza;
        this.zzy = new zzpw(zzbbVar, 0L, 0L, null);
        this.zzz = zzbbVar;
        this.zzA = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzpz();
        this.zzm = new zzpz();
    }

    public static /* synthetic */ void zzG(zzqf zzqfVar) {
        if (zzqfVar.zzZ >= 300000) {
            zzql.zzah(((zzqj) zzqfVar.zzo).zza, true);
            zzqfVar.zzZ = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzI(AudioTrack audioTrack, final zzpc zzpcVar, Handler handler, final zzoz zzozVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpcVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzox zzoxVar;
                        zzoxVar = ((zzqj) zzpc.this).zza.zzc;
                        zzoxVar.zzp(zzozVar);
                    }
                });
            }
            synchronized (zza) {
                int i10 = zzc - 1;
                zzc = i10;
                if (i10 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (zzpcVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzox zzoxVar;
                        zzoxVar = ((zzqj) zzpc.this).zza.zzc;
                        zzoxVar.zzp(zzozVar);
                    }
                });
            }
            synchronized (zza) {
                int i11 = zzc - 1;
                zzc = i11;
                if (i11 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzK() {
        boolean z10;
        synchronized (zza) {
            z10 = zzc > 0;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzL() {
        zzpu zzpuVar = this.zzq;
        return zzpuVar.zzc == 0 ? this.zzB / zzpuVar.zzb : this.zzC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzM() {
        zzpu zzpuVar = this.zzq;
        if (zzpuVar.zzc == 0) {
            long j10 = this.zzD;
            long j11 = zzpuVar.zzd;
            int i10 = zzeh.zza;
            return ((j10 + j11) - 1) / j11;
        }
        return this.zzE;
    }

    private final AudioTrack zzN(zzpu zzpuVar) throws zzpb {
        try {
            return zzac(zzpuVar.zza(), this.zzw, this.zzR, zzpuVar.zza);
        } catch (zzpb e8) {
            zzpc zzpcVar = this.zzo;
            if (zzpcVar != null) {
                zzpcVar.zza(e8);
            }
            throw e8;
        }
    }

    private final void zzO(long j10) {
        zzbb zzbbVar;
        boolean z10;
        if (zzab()) {
            zzpv zzpvVar = this.zzab;
            zzbbVar = this.zzz;
            zzpvVar.zzc(zzbbVar);
        } else {
            zzbbVar = zzbb.zza;
        }
        zzbb zzbbVar2 = zzbbVar;
        this.zzz = zzbbVar2;
        if (zzab()) {
            zzpv zzpvVar2 = this.zzab;
            z10 = this.zzA;
            zzpvVar2.zzd(z10);
        } else {
            z10 = false;
        }
        this.zzA = z10;
        this.zzj.add(new zzpw(zzbbVar2, Math.max(0L, j10), zzeh.zzt(zzM(), this.zzq.zze), null));
        zzX();
        zzpc zzpcVar = this.zzo;
        if (zzpcVar != null) {
            zzql.zzae(((zzqj) zzpcVar).zza).zzw(this.zzA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzP(long r8) throws com.google.android.gms.internal.ads.zzpe {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = r7.zzM
            if (r8 != 0) goto L6
            goto Lb5
        L6:
            com.google.android.gms.internal.ads.zzpz r8 = r7.zzm
            boolean r8 = r8.zzc()
            if (r8 != 0) goto Lb5
            java.nio.ByteBuffer r8 = r7.zzM
            int r8 = r8.remaining()
            android.media.AudioTrack r9 = r7.zzs
            java.nio.ByteBuffer r0 = r7.zzM
            r1 = 1
            int r9 = r9.write(r0, r8, r1)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.zzU = r2
            r2 = 0
            r0 = 0
            if (r9 >= 0) goto L6a
            int r8 = com.google.android.gms.internal.ads.zzeh.zza
            r4 = 24
            if (r8 < r4) goto L31
            r8 = -6
            if (r9 == r8) goto L35
        L31:
            r8 = -32
            if (r9 != r8) goto L4a
        L35:
            long r4 = r7.zzM()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L3e
            goto L4b
        L3e:
            android.media.AudioTrack r8 = r7.zzs
            boolean r8 = zzaa(r8)
            if (r8 == 0) goto L4a
            r7.zzQ()
            goto L4b
        L4a:
            r1 = r0
        L4b:
            com.google.android.gms.internal.ads.zzpe r8 = new com.google.android.gms.internal.ads.zzpe
            com.google.android.gms.internal.ads.zzpu r0 = r7.zzq
            com.google.android.gms.internal.ads.zzz r0 = r0.zza
            r8.<init>(r9, r0, r1)
            com.google.android.gms.internal.ads.zzpc r9 = r7.zzo
            if (r9 == 0) goto L5b
            r9.zza(r8)
        L5b:
            boolean r9 = r8.zzb
            if (r9 != 0) goto L65
            com.google.android.gms.internal.ads.zzpz r9 = r7.zzm
            r9.zzb(r8)
            return
        L65:
            com.google.android.gms.internal.ads.zzob r9 = com.google.android.gms.internal.ads.zzob.zza
            r7.zzt = r9
            throw r8
        L6a:
            com.google.android.gms.internal.ads.zzpz r4 = r7.zzm
            r4.zza()
            android.media.AudioTrack r4 = r7.zzs
            boolean r4 = zzaa(r4)
            if (r4 == 0) goto L8b
            long r4 = r7.zzE
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L7f
            r7.zzW = r0
        L7f:
            boolean r2 = r7.zzQ
            if (r2 == 0) goto L8b
            com.google.android.gms.internal.ads.zzpc r2 = r7.zzo
            if (r2 == 0) goto L8b
            if (r9 >= r8) goto L8b
            com.google.android.gms.internal.ads.zzqj r2 = (com.google.android.gms.internal.ads.zzqj) r2
        L8b:
            com.google.android.gms.internal.ads.zzpu r2 = r7.zzq
            int r2 = r2.zzc
            if (r2 != 0) goto L97
            long r3 = r7.zzD
            long r5 = (long) r9
            long r3 = r3 + r5
            r7.zzD = r3
        L97:
            if (r9 != r8) goto Lb5
            if (r2 == 0) goto Lb2
            java.nio.ByteBuffer r8 = r7.zzM
            java.nio.ByteBuffer r9 = r7.zzK
            if (r8 != r9) goto La2
            goto La3
        La2:
            r1 = r0
        La3:
            com.google.android.gms.internal.ads.zzcv.zzf(r1)
            long r8 = r7.zzE
            int r0 = r7.zzF
            long r0 = (long) r0
            int r2 = r7.zzL
            long r2 = (long) r2
            long r0 = r0 * r2
            long r8 = r8 + r0
            r7.zzE = r8
        Lb2:
            r8 = 0
            r7.zzM = r8
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqf.zzP(long):void");
    }

    private final void zzQ() {
        if (this.zzq.zzc == 1) {
            this.zzV = true;
        }
    }

    private final void zzR() {
        if (this.zzu == null && this.zzd != null) {
            this.zzX = Looper.myLooper();
            zzog zzogVar = new zzog(this.zzd, new zzpp(this), this.zzw, this.zzT);
            this.zzu = zzogVar;
            this.zzt = zzogVar.zzc();
        }
        Objects.requireNonNull(this.zzt);
    }

    private final void zzS() {
        if (this.zzO) {
            return;
        }
        this.zzO = true;
        this.zzi.zzb(zzM());
        if (zzaa(this.zzs)) {
            this.zzP = false;
        }
        this.zzs.stop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        r0 = r2.zzK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r0.hasRemaining() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        r2.zzr.zze(r2.zzK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzT(long r3) throws com.google.android.gms.internal.ads.zzpe {
        /*
            r2 = this;
            r2.zzP(r3)
            java.nio.ByteBuffer r0 = r2.zzM
            if (r0 == 0) goto L8
            goto L4b
        L8:
            com.google.android.gms.internal.ads.zzcd r0 = r2.zzr
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L41
        L10:
            com.google.android.gms.internal.ads.zzcd r0 = r2.zzr
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L4b
        L18:
            com.google.android.gms.internal.ads.zzcd r0 = r2.zzr
            java.nio.ByteBuffer r0 = r0.zzb()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L2f
            r2.zzV(r0)
            r2.zzP(r3)
            java.nio.ByteBuffer r0 = r2.zzM
            if (r0 == 0) goto L18
            goto L4b
        L2f:
            java.nio.ByteBuffer r0 = r2.zzK
            if (r0 == 0) goto L4b
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L4b
            com.google.android.gms.internal.ads.zzcd r0 = r2.zzr
            java.nio.ByteBuffer r1 = r2.zzK
            r0.zze(r1)
            goto L10
        L41:
            java.nio.ByteBuffer r0 = r2.zzK
            if (r0 == 0) goto L4b
            r2.zzV(r0)
            r2.zzP(r3)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqf.zzT(long):void");
    }

    private final void zzU(zzbb zzbbVar) {
        zzpw zzpwVar = new zzpw(zzbbVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzZ()) {
            this.zzx = zzpwVar;
        } else {
            this.zzy = zzpwVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzV(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqf.zzV(java.nio.ByteBuffer):void");
    }

    private final void zzW() {
        if (zzZ()) {
            this.zzs.setVolume(this.zzJ);
        }
    }

    private final void zzX() {
        zzcd zzcdVar = this.zzq.zzi;
        this.zzr = zzcdVar;
        zzcdVar.zzc();
    }

    private final boolean zzY() throws zzpe {
        ByteBuffer byteBuffer;
        if (!this.zzr.zzh()) {
            zzP(Long.MIN_VALUE);
            return this.zzM == null;
        }
        this.zzr.zzd();
        zzT(Long.MIN_VALUE);
        return this.zzr.zzg() && ((byteBuffer = this.zzM) == null || !byteBuffer.hasRemaining());
    }

    private final boolean zzZ() {
        return this.zzs != null;
    }

    private static boolean zzaa(AudioTrack audioTrack) {
        return zzeh.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzab() {
        zzpu zzpuVar = this.zzq;
        if (zzpuVar.zzc == 0) {
            int i10 = zzpuVar.zza.zzG;
            return true;
        }
        return false;
    }

    private static final AudioTrack zzac(zzoz zzozVar, zze zzeVar, int i10, zzz zzzVar) throws zzpb {
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzeVar.zza().zza).setAudioFormat(zzeh.zzx(zzozVar.zzb, zzozVar.zzc, zzozVar.zza)).setTransferMode(1).setBufferSizeInBytes(zzozVar.zze).setSessionId(i10);
            if (zzeh.zza >= 29) {
                sessionId.setOffloadedPlayback(zzozVar.zzd);
            }
            AudioTrack build = sessionId.build();
            int state = build.getState();
            if (state == 1) {
                return build;
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new zzpb(state, zzozVar.zzb, zzozVar.zzc, zzozVar.zza, zzzVar, zzozVar.zzd, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e8) {
            throw new zzpb(0, zzozVar.zzb, zzozVar.zzc, zzozVar.zza, zzzVar, zzozVar.zzd, e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final boolean zzA(zzz zzzVar) {
        return zza(zzzVar) != 0;
    }

    public final void zzJ(zzob zzobVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzX;
        if (looper != myLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
            throw new IllegalStateException("Current looper (" + name2 + ") is not the playback looper (" + name + ")");
        }
        zzob zzobVar2 = this.zzt;
        if (zzobVar2 == null || zzobVar.equals(zzobVar2)) {
            return;
        }
        this.zzt = zzobVar;
        zzpc zzpcVar = this.zzo;
        if (zzpcVar != null) {
            zzql.zzai(((zzqj) zzpcVar).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final int zza(zzz zzzVar) {
        zzR();
        if (!"audio/raw".equals(zzzVar.zzo)) {
            return this.zzt.zzb(zzzVar, this.zzw) != null ? 2 : 0;
        } else if (zzeh.zzJ(zzzVar.zzG)) {
            return zzzVar.zzG != 2 ? 1 : 2;
        } else {
            int i10 = zzzVar.zzG;
            zzdn.zzf("DefaultAudioSink", "Invalid PCM encoding: " + i10);
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final long zzb(boolean z10) {
        long j10;
        if (!zzZ() || this.zzH) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzi.zza(z10), zzeh.zzt(zzM(), this.zzq.zze));
        while (!this.zzj.isEmpty() && min >= ((zzpw) this.zzj.getFirst()).zzc) {
            this.zzy = (zzpw) this.zzj.remove();
        }
        zzpw zzpwVar = this.zzy;
        long j11 = min - zzpwVar.zzc;
        long zzq = zzeh.zzq(j11, zzpwVar.zza.zzb);
        if (this.zzj.isEmpty()) {
            long zza2 = this.zzab.zza(j11);
            zzpw zzpwVar2 = this.zzy;
            j10 = zzpwVar2.zzb + zza2;
            zzpwVar2.zzd = zza2 - zzq;
        } else {
            zzpw zzpwVar3 = this.zzy;
            j10 = zzpwVar3.zzb + zzq + zzpwVar3.zzd;
        }
        long zzb2 = this.zzab.zzb();
        long zzt = j10 + zzeh.zzt(zzb2, this.zzq.zze);
        long j12 = this.zzY;
        if (zzb2 > j12) {
            long zzt2 = zzeh.zzt(zzb2 - j12, this.zzq.zze);
            this.zzY = zzb2;
            this.zzZ += zzt2;
            if (this.zzaa == null) {
                this.zzaa = new Handler(Looper.myLooper());
            }
            this.zzaa.removeCallbacksAndMessages(null);
            this.zzaa.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpn
                @Override // java.lang.Runnable
                public final void run() {
                    zzqf.zzG(zzqf.this);
                }
            }, 100L);
        }
        return zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final zzbb zzc() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final zzok zzd(zzz zzzVar) {
        return this.zzV ? zzok.zza : this.zzac.zza(zzzVar, this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zze(zzz zzzVar, int i10, int[] iArr) throws zzpa {
        int intValue;
        zzcd zzcdVar;
        int i11;
        int intValue2;
        int i12;
        int i13;
        int i14;
        int i15;
        int max;
        int zzb2;
        zzR();
        if ("audio/raw".equals(zzzVar.zzo)) {
            zzcv.zzd(zzeh.zzJ(zzzVar.zzG));
            i11 = zzeh.zzk(zzzVar.zzG) * zzzVar.zzE;
            zzfvs zzfvsVar = new zzfvs();
            zzfvsVar.zzh(this.zzg);
            zzfvsVar.zzg(this.zzab.zze());
            zzcd zzcdVar2 = new zzcd(zzfvsVar.zzi());
            if (zzcdVar2.equals(this.zzr)) {
                zzcdVar2 = this.zzr;
            }
            this.zzf.zzq(zzzVar.zzH, zzzVar.zzI);
            this.zze.zzo(iArr);
            try {
                zzce zza2 = zzcdVar2.zza(new zzce(zzzVar.zzF, zzzVar.zzE, zzzVar.zzG));
                intValue = zza2.zzd;
                i13 = zza2.zzb;
                int i16 = zza2.zzc;
                intValue2 = zzeh.zzi(i16);
                zzcdVar = zzcdVar2;
                i12 = zzeh.zzk(intValue) * i16;
                i14 = 0;
            } catch (zzcf e8) {
                throw new zzpa(e8, zzzVar);
            }
        } else {
            zzcd zzcdVar3 = new zzcd(zzfvv.zzn());
            int i17 = zzzVar.zzF;
            zzok zzokVar = zzok.zza;
            Pair zzb3 = this.zzt.zzb(zzzVar, this.zzw);
            if (zzb3 != null) {
                intValue = ((Integer) zzb3.first).intValue();
                zzcdVar = zzcdVar3;
                i11 = -1;
                intValue2 = ((Integer) zzb3.second).intValue();
                i12 = -1;
                i13 = i17;
                i14 = 2;
            } else {
                throw new zzpa("Unable to configure passthrough for: ".concat(String.valueOf(zzzVar)), zzzVar);
            }
        }
        if (intValue == 0) {
            throw new zzpa("Invalid output encoding (mode=" + i14 + ") for: " + String.valueOf(zzzVar), zzzVar);
        } else if (intValue2 != 0) {
            int i18 = zzzVar.zzj;
            if ("audio/vnd.dts.hd;profile=lbr".equals(zzzVar.zzo) && i18 == -1) {
                i18 = 768000;
            }
            int minBufferSize = AudioTrack.getMinBufferSize(i13, intValue2, intValue);
            zzcv.zzf(minBufferSize != -2);
            int i19 = i12 != -1 ? i12 : 1;
            int i20 = 250000;
            if (i14 == 0) {
                i15 = i14;
                int zza3 = zzqh.zza(250000, i13, i19);
                int zza4 = zzqh.zza(750000, i13, i19);
                int i21 = zzeh.zza;
                max = Math.max(zza3, Math.min(minBufferSize * 4, zza4));
            } else if (i14 != 1) {
                if (intValue == 5) {
                    i20 = 500000;
                } else if (intValue == 8) {
                    i20 = 1000000;
                    intValue = 8;
                }
                if (i18 != -1) {
                    zzb2 = zzfyr.zzb(i18, 8, RoundingMode.CEILING);
                } else {
                    zzb2 = zzqh.zzb(intValue);
                }
                i15 = i14;
                max = zzfyy.zzb((i20 * zzb2) / 1000000);
            } else {
                i15 = i14;
                max = zzfyy.zzb((zzqh.zzb(intValue) * 50000000) / 1000000);
            }
            this.zzV = false;
            zzpu zzpuVar = new zzpu(zzzVar, i11, i15, i12, i13, intValue2, intValue, (((Math.max(minBufferSize, max) + i19) - 1) / i19) * i19, zzcdVar, false, false, false);
            if (zzZ()) {
                this.zzp = zzpuVar;
            } else {
                this.zzq = zzpuVar;
            }
        } else {
            throw new zzpa("Invalid output channel config (mode=" + i14 + ") for: " + String.valueOf(zzzVar), zzzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzf() {
        zzpy zzpyVar;
        if (zzZ()) {
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzW = false;
            this.zzF = 0;
            this.zzy = new zzpw(this.zzz, 0L, 0L, null);
            this.zzI = 0L;
            this.zzx = null;
            this.zzj.clear();
            this.zzK = null;
            this.zzL = 0;
            this.zzM = null;
            this.zzO = false;
            this.zzN = false;
            this.zzP = false;
            this.zzf.zzp();
            zzX();
            if (this.zzi.zzh()) {
                this.zzs.pause();
            }
            if (zzaa(this.zzs)) {
                zzqd zzqdVar = this.zzk;
                Objects.requireNonNull(zzqdVar);
                zzqdVar.zzb(this.zzs);
            }
            final zzoz zza2 = this.zzq.zza();
            zzpu zzpuVar = this.zzp;
            if (zzpuVar != null) {
                this.zzq = zzpuVar;
                this.zzp = null;
            }
            this.zzi.zzc();
            if (zzeh.zza >= 24 && (zzpyVar = this.zzv) != null) {
                zzpyVar.zzb();
                this.zzv = null;
            }
            final AudioTrack audioTrack = this.zzs;
            final zzpc zzpcVar = this.zzo;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    zzb = Executors.newSingleThreadScheduledExecutor(new ThreadFactory("ExoPlayer:AudioTrackReleaseThread") { // from class: com.google.android.gms.internal.ads.zzeg
                        public final /* synthetic */ String zza = "ExoPlayer:AudioTrackReleaseThread";

                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            int i10 = zzeh.zza;
                            return new Thread(runnable, this.zza);
                        }
                    });
                }
                zzc++;
                zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqf.zzI(audioTrack, zzpcVar, handler, zza2);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.zzs = null;
        }
        this.zzm.zza();
        this.zzl.zza();
        this.zzY = 0L;
        this.zzZ = 0L;
        Handler handler2 = this.zzaa;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzg() {
        this.zzG = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzh() {
        this.zzQ = false;
        if (zzZ()) {
            if (this.zzi.zzk() || zzaa(this.zzs)) {
                this.zzs.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzi() {
        this.zzQ = true;
        if (zzZ()) {
            this.zzi.zzf();
            this.zzs.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzj() throws zzpe {
        if (!this.zzN && zzZ() && zzY()) {
            zzS();
            this.zzN = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzk() {
        zzog zzogVar = this.zzu;
        if (zzogVar != null) {
            zzogVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzl() {
        zzf();
        zzfvv zzfvvVar = this.zzg;
        int size = zzfvvVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzcg) zzfvvVar.get(i10)).zzf();
        }
        zzfvv zzfvvVar2 = this.zzh;
        int size2 = zzfvvVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((zzcg) zzfvvVar2.get(i11)).zzf();
        }
        zzcd zzcdVar = this.zzr;
        if (zzcdVar != null) {
            zzcdVar.zzf();
        }
        this.zzQ = false;
        this.zzV = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzm(zze zzeVar) {
        if (this.zzw.equals(zzeVar)) {
            return;
        }
        this.zzw = zzeVar;
        zzog zzogVar = this.zzu;
        if (zzogVar != null) {
            zzogVar.zzg(zzeVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzn(int i10) {
        if (this.zzR != i10) {
            this.zzR = i10;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzo(zzf zzfVar) {
        if (this.zzS.equals(zzfVar)) {
            return;
        }
        if (this.zzs != null) {
            int i10 = this.zzS.zza;
        }
        this.zzS = zzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzp(zzcw zzcwVar) {
        this.zzi.zze(zzcwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzq(zzpc zzpcVar) {
        this.zzo = zzpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzr(int i10, int i11) {
        AudioTrack audioTrack = this.zzs;
        if (audioTrack != null) {
            zzaa(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzs(zzbb zzbbVar) {
        float f10 = zzbbVar.zzb;
        int i10 = zzeh.zza;
        this.zzz = new zzbb(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(zzbbVar.zzc, 8.0f)));
        zzU(zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzt(zznz zznzVar) {
        this.zzn = zznzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzT = audioDeviceInfo == null ? null : new zzoh(audioDeviceInfo);
        zzog zzogVar = this.zzu;
        if (zzogVar != null) {
            zzogVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzs;
        if (audioTrack != null) {
            zzpq.zza(audioTrack, this.zzT);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzv(boolean z10) {
        this.zzA = z10;
        zzU(this.zzz);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzw(float f10) {
        if (this.zzJ != f10) {
            this.zzJ = f10;
            zzW();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025e  */
    @Override // com.google.android.gms.internal.ads.zzpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzx(java.nio.ByteBuffer r28, long r29, int r31) throws com.google.android.gms.internal.ads.zzpb, com.google.android.gms.internal.ads.zzpe {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqf.zzx(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final boolean zzy() {
        if (zzZ()) {
            return !(zzeh.zza >= 29 && this.zzs.isOffloadedPlayback() && this.zzP) && this.zzi.zzg(zzM());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final boolean zzz() {
        return !zzZ() || (this.zzN && !zzy());
    }
}
