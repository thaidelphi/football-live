package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzapl implements zzanz {
    private final zzapk zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzapl(zzapk zzapkVar, int i10) {
        this.zzc = zzapkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(zzapj zzapjVar) throws IOException {
        return new String(zzm(zzapjVar, zzf(zzapjVar)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzapj zzapjVar, long j10) throws IOException {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        long zza = zzapjVar.zza();
        if (i10 >= 0 && j10 <= zza) {
            int i11 = (int) j10;
            if (i11 == j10) {
                byte[] bArr = new byte[i11];
                new DataInputStream(zzapjVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + zza);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzapi zzapiVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzapiVar.zza - ((zzapi) this.zza.get(str)).zza;
        } else {
            this.zzb += zzapiVar.zza;
        }
        this.zza.put(str, zzapiVar);
    }

    private final void zzp(String str) {
        zzapi zzapiVar = (zzapi) this.zza.remove(str);
        if (zzapiVar != null) {
            this.zzb -= zzapiVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final synchronized zzany zza(String str) {
        zzapi zzapiVar = (zzapi) this.zza.get(str);
        if (zzapiVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzapj zzapjVar = new zzapj(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzapi zza = zzapi.zza(zzapjVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzapb.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzapjVar, zzapjVar.zza());
                zzany zzanyVar = new zzany();
                zzanyVar.zza = zzm;
                zzanyVar.zzb = zzapiVar.zzc;
                zzanyVar.zzc = zzapiVar.zzd;
                zzanyVar.zzd = zzapiVar.zze;
                zzanyVar.zze = zzapiVar.zzf;
                zzanyVar.zzf = zzapiVar.zzg;
                List<zzaoh> list = zzapiVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaoh zzaohVar : list) {
                    treeMap.put(zzaohVar.zza(), zzaohVar.zzb());
                }
                zzanyVar.zzg = treeMap;
                zzanyVar.zzh = Collections.unmodifiableList(zzapiVar.zzh);
                return zzanyVar;
            } finally {
                zzapjVar.close();
            }
        } catch (IOException e8) {
            zzapb.zza("%s: %s", zzg.getAbsolutePath(), e8.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final synchronized void zzb() {
        File zza = this.zzc.zza();
        if (!zza.exists()) {
            if (!zza.mkdirs()) {
                zzapb.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
            }
        } else {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        zzapj zzapjVar = new zzapj(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzapi zza2 = zzapi.zza(zzapjVar);
                            zza2.zza = length;
                            zzo(zza2.zzb, zza2);
                            zzapjVar.close();
                        } catch (Throwable th) {
                            zzapjVar.close();
                            throw th;
                            break;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final synchronized void zzc(String str, boolean z10) {
        zzany zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final synchronized void zzd(String str, zzany zzanyVar) {
        long j10 = this.zzb;
        int length = zzanyVar.zza.length;
        long j11 = j10 + length;
        int i10 = this.zzd;
        if (j11 <= i10 || length <= i10 * 0.9f) {
            File zzg = zzg(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                zzapi zzapiVar = new zzapi(str, zzanyVar);
                try {
                    zzj(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzapiVar.zzb);
                    String str2 = zzapiVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzk(bufferedOutputStream, zzapiVar.zzd);
                    zzk(bufferedOutputStream, zzapiVar.zze);
                    zzk(bufferedOutputStream, zzapiVar.zzf);
                    zzk(bufferedOutputStream, zzapiVar.zzg);
                    List<zzaoh> list = zzapiVar.zzh;
                    if (list != null) {
                        zzj(bufferedOutputStream, list.size());
                        for (zzaoh zzaohVar : list) {
                            zzl(bufferedOutputStream, zzaohVar.zza());
                            zzl(bufferedOutputStream, zzaohVar.zzb());
                        }
                    } else {
                        zzj(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzanyVar.zza);
                    bufferedOutputStream.close();
                    zzapiVar.zza = zzg.length();
                    zzo(str, zzapiVar);
                    if (this.zzb >= this.zzd) {
                        if (zzapb.zzb) {
                            zzapb.zzd("Pruning old cache entries.", new Object[0]);
                        }
                        long j12 = this.zzb;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.zza.entrySet().iterator();
                        int i11 = 0;
                        while (it.hasNext()) {
                            zzapi zzapiVar2 = (zzapi) ((Map.Entry) it.next()).getValue();
                            if (zzg(zzapiVar2.zzb).delete()) {
                                this.zzb -= zzapiVar2.zza;
                            } else {
                                String str3 = zzapiVar2.zzb;
                                zzapb.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i11++;
                            if (((float) this.zzb) < this.zzd * 0.9f) {
                                break;
                            }
                        }
                        if (zzapb.zzb) {
                            zzapb.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.zzb - j12), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                    }
                } catch (IOException e8) {
                    zzapb.zza("%s", e8.toString());
                    bufferedOutputStream.close();
                    zzapb.zza("Failed to write header for %s", zzg.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!zzg.delete()) {
                    zzapb.zza("Could not clean up file %s", zzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzapb.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                }
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (delete) {
            return;
        }
        zzapb.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzapl(File file, int i10) {
        this.zzc = new zzaph(this, file);
    }
}
