package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgul;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzguk<MessageType extends zzgul<MessageType, BuilderType>, BuilderType extends zzguk<MessageType, BuilderType>> implements zzgxu {
    private String zza(String str) {
        String name = getClass().getName();
        return "Reading " + name + " from a " + str + " threw an IOException (should never happen).";
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzgyg) {
                ((zzgyg) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Object obj = (Object) list2.get(i10);
                if (obj == 0) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                zzc(list, size2);
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgyz zzbb(zzgxv zzgxvVar) {
        return new zzgyz(zzgxvVar);
    }

    @Deprecated
    protected static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzgwx.zzb;
        Objects.requireNonNull(iterable);
        if (!(iterable instanceof zzgxh)) {
            if (iterable instanceof zzgye) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List zza = ((zzgxh) iterable).zza();
        zzgxh zzgxhVar = (zzgxh) list;
        int size = list.size();
        for (Object obj : zza) {
            if (obj == null) {
                String str = "Element at index " + (zzgxhVar.size() - size) + " is null.";
                int size2 = zzgxhVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    zzgxhVar.remove(size2);
                }
                throw new NullPointerException(str);
            } else if (obj instanceof zzgvc) {
                zzgvc zzgvcVar = (zzgvc) obj;
                zzgxhVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzgvc.zzv(bArr2, 0, bArr2.length);
                zzgxhVar.zzb();
            } else {
                zzgxhVar.add((String) obj);
            }
        }
    }

    private static void zzc(List<?> list, int i10) {
        String str = "Element at index " + (list.size() - i10) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size >= i10) {
                list.remove(size);
            } else {
                throw new NullPointerException(str);
            }
        }
    }

    @Override // 
    /* renamed from: zzaC */
    public abstract BuilderType zzaP();

    protected abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgvc zzgvcVar) throws zzgwz {
        try {
            zzgvi zzl = zzgvcVar.zzl();
            zzaR(zzl);
            zzl.zzy(0);
            return this;
        } catch (zzgwz e8) {
            throw e8;
        } catch (IOException e10) {
            throw new RuntimeException(zza("ByteString"), e10);
        }
    }

    /* renamed from: zzaF */
    public BuilderType zzaR(zzgvi zzgviVar) throws IOException {
        int i10 = zzgvu.zzb;
        int i11 = zzgyf.zza;
        return zzaW(zzgviVar, zzgvu.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzaG */
    public BuilderType zzaS(zzgxv zzgxvVar) {
        if (zzbt().getClass().isInstance(zzgxvVar)) {
            return (BuilderType) zzaD((zzgul) zzgxvVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzgvi zzG = zzgvi.zzG(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE);
        zzaR(zzG);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaI */
    public BuilderType zzaU(byte[] bArr) throws zzgwz {
        return zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        try {
            zzgvi zzl = zzgvcVar.zzl();
            zzaW(zzl, zzgvuVar);
            zzl.zzy(0);
            return this;
        } catch (zzgwz e8) {
            throw e8;
        } catch (IOException e10) {
            throw new RuntimeException(zza("ByteString"), e10);
        }
    }

    @Override // 
    /* renamed from: zzaK */
    public abstract BuilderType zzaW(zzgvi zzgviVar, zzgvu zzgvuVar) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzgvu zzgvuVar) throws IOException {
        zzgvi zzG = zzgvi.zzG(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE);
        zzaW(zzG, zzgvuVar);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaM */
    public BuilderType zzaY(byte[] bArr, zzgvu zzgvuVar) throws zzgwz {
        return zzba(bArr, 0, bArr.length, zzgvuVar);
    }

    @Override // 
    /* renamed from: zzaN */
    public BuilderType zzaZ(byte[] bArr, int i10, int i11) throws zzgwz {
        try {
            zzgvi zzH = zzgvi.zzH(bArr, i10, i11, false);
            zzaR(zzH);
            zzH.zzy(0);
            return this;
        } catch (zzgwz e8) {
            throw e8;
        } catch (IOException e10) {
            throw new RuntimeException(zza("byte array"), e10);
        }
    }

    @Override // 
    /* renamed from: zzaO */
    public BuilderType zzba(byte[] bArr, int i10, int i11, zzgvu zzgvuVar) throws zzgwz {
        try {
            zzgvi zzH = zzgvi.zzH(bArr, i10, i11, false);
            zzaW(zzH, zzgvuVar);
            zzH.zzy(0);
            return this;
        } catch (zzgwz e8) {
            throw e8;
        } catch (IOException e10) {
            throw new RuntimeException(zza("byte array"), e10);
        }
    }

    public /* bridge */ /* synthetic */ zzgxu zzaQ(zzgvc zzgvcVar) throws zzgwz {
        zzaE(zzgvcVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgxu zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgxu zzaV(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        zzaJ(zzgvcVar, zzgvuVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgxu zzaX(InputStream inputStream, zzgvu zzgvuVar) throws IOException {
        zzaL(inputStream, zzgvuVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        int i10 = zzgvu.zzb;
        int i11 = zzgyf.zza;
        return zzbf(inputStream, zzgvu.zza);
    }

    public boolean zzbf(InputStream inputStream, zzgvu zzgvuVar) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaL(new zzguj(inputStream, zzgvi.zzE(read, inputStream)), zzgvuVar);
        return true;
    }
}
