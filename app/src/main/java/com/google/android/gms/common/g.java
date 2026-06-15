package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class g extends zzz {

    /* renamed from: a  reason: collision with root package name */
    private final int f12441a;

    /* JADX INFO: Access modifiers changed from: protected */
    public g(byte[] bArr) {
        Preconditions.a(bArr.length == 25);
        this.f12441a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] t0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }

    public final boolean equals(Object obj) {
        IObjectWrapper zzd;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzaa)) {
            try {
                com.google.android.gms.common.internal.zzaa zzaaVar = (com.google.android.gms.common.internal.zzaa) obj;
                if (zzaaVar.zzc() == this.f12441a && (zzd = zzaaVar.zzd()) != null) {
                    return Arrays.equals(u0(), (byte[]) ObjectWrapper.t0(zzd));
                }
                return false;
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12441a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] u0();

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        return this.f12441a;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper zzd() {
        return ObjectWrapper.u0(u0());
    }
}
