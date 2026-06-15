package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import com.ironsource.cc;
import java.io.UnsupportedEncodingException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzapu extends zzaop {
    private final Object zza;
    private final zzaou zzb;

    public zzapu(int i10, String str, zzaou zzaouVar, zzaot zzaotVar) {
        super(i10, str, zzaotVar);
        this.zza = new Object();
        this.zzb = zzaouVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaop
    public final zzaov zzh(zzaol zzaolVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaolVar.zzb;
            Map map = zzaolVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i10].trim().split(b9.i.f16692b, 0);
                    if (split2.length == 2 && split2[0].equals(cc.M)) {
                        str3 = split2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaolVar.zzb);
        }
        return zzaov.zzb(str, zzapm.zzb(zzaolVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaop
    /* renamed from: zzz */
    public void zzo(String str) {
        zzaou zzaouVar;
        synchronized (this.zza) {
            zzaouVar = this.zzb;
        }
        zzaouVar.zza(str);
    }
}
