package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaiz implements zzaje {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzaje
    public final int zza(zzz zzzVar) {
        char c10;
        String str = zzzVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                case 5:
                case 6:
                case 7:
                    return 2;
                case '\b':
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzaje
    public final zzajg zzb(zzz zzzVar) {
        char c10;
        String str = zzzVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    return new zzajw(zzzVar.zzr);
                case 1:
                    return new zzakz();
                case 2:
                    return new zzako();
                case 3:
                    return new zzaka();
                case 4:
                    return new zzakl(zzzVar.zzr);
                case 5:
                    return new zzaju();
                case 6:
                    return new zzakn(zzzVar.zzr);
                case 7:
                    return new zzajs(zzzVar.zzr);
                case '\b':
                    return new zzakg();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final boolean zzc(zzz zzzVar) {
        String str = zzzVar.zzo;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }
}
