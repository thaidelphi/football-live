package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import java.lang.reflect.Method;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzpj {
    private long zzA;
    private boolean zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private zzcw zzG;
    private final zzpi zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private zzph zze;
    private int zzf;
    private long zzg;
    private float zzh;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private Method zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private int zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzpj(zzpi zzpiVar) {
        this.zza = zzpiVar;
        try {
            this.zzl = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzG = zzcw.zza;
    }

    private final long zzl() {
        long zzb = this.zzG.zzb();
        if (this.zzv != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 2) {
                return this.zzx;
            }
            return Math.min(this.zzy, this.zzx + zzeh.zzp(zzeh.zzq(zzeh.zzs(zzb) - this.zzv, this.zzh), this.zzf));
        }
        if (zzb - this.zzq >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            Objects.requireNonNull(audioTrack2);
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                if (zzeh.zza <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.zzr <= 0 || playState != 3) {
                            playbackHeadPosition = 0;
                        } else if (this.zzw == -9223372036854775807L) {
                            this.zzw = zzb;
                        }
                    }
                    this.zzw = -9223372036854775807L;
                }
                if (this.zzr > playbackHeadPosition) {
                    this.zzs++;
                }
                this.zzr = playbackHeadPosition;
            }
            this.zzq = zzb;
        }
        return this.zzr + this.zzF + (this.zzs << 32);
    }

    private final long zzm() {
        return zzeh.zzt(zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzj = 0L;
        this.zzu = 0;
        this.zzt = 0;
        this.zzk = 0L;
        this.zzA = 0L;
        this.zzD = 0L;
        this.zzi = false;
    }

    public final long zza(boolean z10) {
        long zzq;
        int i10;
        Method method;
        AudioTrack audioTrack;
        AudioTrack audioTrack2 = this.zzc;
        Objects.requireNonNull(audioTrack2);
        if (audioTrack2.getPlayState() == 3) {
            long zzc = this.zzG.zzc() / 1000;
            if (zzc - this.zzk >= 30000) {
                long zzm = zzm();
                if (zzm != 0) {
                    this.zzb[this.zzt] = zzeh.zzr(zzm, this.zzh) - zzc;
                    this.zzt = (this.zzt + 1) % 10;
                    int i11 = this.zzu;
                    if (i11 < 10) {
                        this.zzu = i11 + 1;
                    }
                    this.zzk = zzc;
                    this.zzj = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.zzu;
                        if (i12 >= i13) {
                            break;
                        }
                        this.zzj += this.zzb[i12] / i13;
                        i12++;
                    }
                }
            }
            zzph zzphVar = this.zze;
            Objects.requireNonNull(zzphVar);
            if (zzphVar.zzg(zzc)) {
                long zzb = zzphVar.zzb();
                long zza = zzphVar.zza();
                long zzm2 = zzm();
                if (Math.abs(zzb - zzc) > 5000000) {
                    i10 = 0;
                    this.zza.zzd(zza, zzb, zzc, zzm2);
                    zzphVar.zzd();
                } else {
                    i10 = 0;
                    if (Math.abs(zzeh.zzt(zza, this.zzf) - zzm2) > 5000000) {
                        this.zza.zzc(zza, zzb, zzc, zzm2);
                        zzphVar.zzd();
                    } else {
                        zzphVar.zzc();
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.zzo && (method = this.zzl) != null && zzc - this.zzp >= 500000) {
                try {
                    Objects.requireNonNull(this.zzc);
                    int i14 = zzeh.zza;
                    long intValue = (((Integer) method.invoke(audioTrack, new Object[i10])).intValue() * 1000) - this.zzg;
                    this.zzm = intValue;
                    long max = Math.max(intValue, 0L);
                    this.zzm = max;
                    if (max > 5000000) {
                        this.zza.zza(max);
                        this.zzm = 0L;
                    }
                } catch (Exception unused) {
                    this.zzl = null;
                }
                this.zzp = zzc;
            }
        }
        long zzc2 = this.zzG.zzc() / 1000;
        zzph zzphVar2 = this.zze;
        Objects.requireNonNull(zzphVar2);
        boolean zzf = zzphVar2.zzf();
        if (zzf) {
            zzq = zzeh.zzt(zzphVar2.zza(), this.zzf) + zzeh.zzq(zzc2 - zzphVar2.zzb(), this.zzh);
        } else {
            if (this.zzu == 0) {
                zzq = zzm();
            } else {
                zzq = zzeh.zzq(this.zzj + zzc2, this.zzh);
            }
            if (!z10) {
                zzq = Math.max(0L, zzq - this.zzm);
            }
        }
        if (this.zzB != zzf) {
            this.zzD = this.zzA;
            this.zzC = this.zzz;
        }
        long j10 = zzc2 - this.zzD;
        if (j10 < 1000000) {
            long j11 = (j10 * 1000) / 1000000;
            zzq = ((zzq * j11) + ((1000 - j11) * (this.zzC + zzeh.zzq(j10, this.zzh)))) / 1000;
        }
        if (!this.zzi && zzq > this.zzz && audioTrack2.getPlayState() == 3) {
            this.zzi = true;
            int i15 = zzeh.zza;
            this.zza.zzb(this.zzG.zza() - zzeh.zzv(zzeh.zzr(zzeh.zzv(zzq - this.zzz), this.zzh)));
        }
        this.zzA = zzc2;
        this.zzz = zzq;
        this.zzB = zzf;
        return zzq;
    }

    public final void zzb(long j10) {
        this.zzx = zzl();
        this.zzv = zzeh.zzs(this.zzG.zzb());
        this.zzy = j10;
    }

    public final void zzc() {
        zzn();
        this.zzc = null;
        this.zze = null;
    }

    public final void zzd(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.zzc = audioTrack;
        this.zzd = i12;
        this.zze = new zzph(audioTrack);
        this.zzf = audioTrack.getSampleRate();
        if (z10) {
            int i13 = zzeh.zza;
        }
        boolean zzJ = zzeh.zzJ(i10);
        this.zzo = zzJ;
        this.zzg = zzJ ? zzeh.zzt(i12 / i11, this.zzf) : -9223372036854775807L;
        this.zzr = 0L;
        this.zzs = 0L;
        this.zzE = false;
        this.zzF = 0L;
        this.zzn = false;
        this.zzv = -9223372036854775807L;
        this.zzw = -9223372036854775807L;
        this.zzp = 0L;
        this.zzm = 0L;
        this.zzh = 1.0f;
    }

    public final void zze(zzcw zzcwVar) {
        this.zzG = zzcwVar;
    }

    public final void zzf() {
        if (this.zzv != -9223372036854775807L) {
            this.zzv = zzeh.zzs(this.zzG.zzb());
        }
        zzph zzphVar = this.zze;
        Objects.requireNonNull(zzphVar);
        zzphVar.zze();
    }

    public final boolean zzg(long j10) {
        return this.zzv != -9223372036854775807L ? j10 > zzl() : j10 > zzeh.zzp(zza(false), this.zzf);
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j10) {
        return this.zzw != -9223372036854775807L && j10 > 0 && this.zzG.zzb() - this.zzw >= 200;
    }

    public final boolean zzj(long j10) {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        boolean z10 = this.zzn;
        boolean zzg = zzg(j10);
        this.zzn = zzg;
        if (z10 && !zzg && playState != 1) {
            this.zza.zze(this.zzd, zzeh.zzv(this.zzg));
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzv == -9223372036854775807L) {
            zzph zzphVar = this.zze;
            Objects.requireNonNull(zzphVar);
            zzphVar.zze();
            return true;
        }
        this.zzx = zzl();
        return false;
    }
}
