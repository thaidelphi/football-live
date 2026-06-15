package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzgwe;
import com.google.android.gms.internal.ads.zzgwk;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzgwk<MessageType extends zzgwk<MessageType, BuilderType>, BuilderType extends zzgwe<MessageType, BuilderType>> extends zzgul<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzgwk<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzgzb zzt = zzgzb.zzc();

    protected static zzgwm zzbA() {
        return zzgus.zzd();
    }

    protected static zzgwm zzbB(zzgwm zzgwmVar) {
        int size = zzgwmVar.size();
        return zzgwmVar.zze(size + size);
    }

    protected static zzgwn zzbC() {
        return zzgvr.zze();
    }

    protected static zzgwn zzbD(zzgwn zzgwnVar) {
        int size = zzgwnVar.size();
        return zzgwnVar.zzg(size + size);
    }

    protected static zzgwr zzbE() {
        return zzgwb.zze();
    }

    protected static zzgwr zzbF(zzgwr zzgwrVar) {
        int size = zzgwrVar.size();
        return zzgwrVar.zzg(size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgws zzbG() {
        return zzgwl.zzg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgws zzbH(zzgws zzgwsVar) {
        int size = zzgwsVar.size();
        return zzgwsVar.zzh(size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgwv zzbI() {
        return zzgxk.zzh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgwv zzbJ(zzgwv zzgwvVar) {
        int size = zzgwvVar.size();
        return zzgwvVar.zze(size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzgww<E> zzbK() {
        return zzgyg.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzgww<E> zzbL(zzgww<E> zzgwwVar) {
        int size = zzgwwVar.size();
        return zzgwwVar.zzf(size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzbP(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zzbQ(zzgxv zzgxvVar, String str, Object[] objArr) {
        return new zzgyh(zzgxvVar, str, objArr);
    }

    static Method zzbR(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e8) {
            String name = cls.getName();
            throw new RuntimeException("Generated message class \"" + name + "\" missing method \"" + str + "\".", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk> void zzbZ(Class<T> cls, T t10) {
        t10.zzbV();
        zzc.put(cls, t10);
    }

    public static <ContainingType extends zzgxv, Type> zzgwi<ContainingType, Type> zzbe(ContainingType containingtype, zzgxv zzgxvVar, zzgwp zzgwpVar, int i10, zzgzn zzgznVar, boolean z10, Class cls) {
        return new zzgwi<>(containingtype, zzgyg.zzd(), zzgxvVar, new zzgwh(zzgwpVar, i10, zzgznVar, true, z10), cls);
    }

    public static <ContainingType extends zzgxv, Type> zzgwi<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzgxv zzgxvVar, zzgwp zzgwpVar, int i10, zzgzn zzgznVar, Class cls) {
        return new zzgwi<>(containingtype, type, zzgxvVar, new zzgwh(zzgwpVar, i10, zzgznVar, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzgwk> T zzbh(Class<T> cls) {
        zzgwk<?, ?> zzgwkVar = zzc.get(cls);
        if (zzgwkVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgwkVar = zzc.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (zzgwkVar == null) {
            zzgwkVar = ((zzgwk) zzgzh.zzg(cls)).zzbt();
            if (zzgwkVar != null) {
                zzc.put(cls, zzgwkVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgwkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbk(T t10, InputStream inputStream) throws zzgwz {
        int i10 = zzgvu.zzb;
        int i11 = zzgyf.zza;
        T t11 = (T) zzg(t10, inputStream, zzgvu.zza);
        zzf(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbl(T t10, InputStream inputStream, zzgvu zzgvuVar) throws zzgwz {
        T t11 = (T) zzg(t10, inputStream, zzgvuVar);
        zzf(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbm(T t10, zzgvc zzgvcVar) throws zzgwz {
        int i10 = zzgvu.zzb;
        int i11 = zzgyf.zza;
        T t11 = (T) zzbr(t10, zzgvcVar, zzgvu.zza);
        zzf(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbn(T t10, zzgvi zzgviVar) throws zzgwz {
        int i10 = zzgvu.zzb;
        int i11 = zzgyf.zza;
        return (T) zzbs(t10, zzgviVar, zzgvu.zza);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbo(T t10, InputStream inputStream) throws zzgwz {
        zzgvi zzG = zzgvi.zzG(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE);
        int i10 = zzgvu.zzb;
        int i11 = zzgyf.zza;
        T t11 = (T) zzbz(t10, zzG, zzgvu.zza);
        zzf(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbp(T t10, ByteBuffer byteBuffer) throws zzgwz {
        int i10 = zzgvu.zzb;
        int i11 = zzgyf.zza;
        return (T) zzbv(t10, byteBuffer, zzgvu.zza);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbq(T t10, byte[] bArr) throws zzgwz {
        int length = bArr.length;
        int i10 = zzgvu.zzb;
        int i11 = zzgyf.zza;
        T t11 = (T) zzi(t10, bArr, 0, length, zzgvu.zza);
        zzf(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbr(T t10, zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        T t11 = (T) zzh(t10, zzgvcVar, zzgvuVar);
        zzf(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbs(T t10, zzgvi zzgviVar, zzgvu zzgvuVar) throws zzgwz {
        T t11 = (T) zzbz(t10, zzgviVar, zzgvuVar);
        zzf(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbu(T t10, InputStream inputStream, zzgvu zzgvuVar) throws zzgwz {
        T t11 = (T) zzbz(t10, zzgvi.zzG(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE), zzgvuVar);
        zzf(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbv(T t10, ByteBuffer byteBuffer, zzgvu zzgvuVar) throws zzgwz {
        zzgvi zzH;
        int i10 = zzgvi.zze;
        if (byteBuffer.hasArray()) {
            zzH = zzgvi.zzH(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            if (byteBuffer.isDirect()) {
                int i11 = zzgvg.zza;
                if (zzgzh.zzB()) {
                    zzH = new zzgvg(byteBuffer, false, null);
                }
            }
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzH = zzgvi.zzH(bArr, 0, remaining, true);
        }
        T t11 = (T) zzbs(t10, zzH, zzgvuVar);
        zzf(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgwk<T, ?>> T zzbx(T t10, byte[] bArr, zzgvu zzgvuVar) throws zzgwz {
        T t11 = (T) zzi(t10, bArr, 0, bArr.length, zzgvuVar);
        zzf(t11);
        return t11;
    }

    protected static <T extends zzgwk<T, ?>> T zzby(T t10, zzgvi zzgviVar) throws zzgwz {
        int i10 = zzgvu.zzb;
        int i11 = zzgyf.zza;
        return (T) zzbz(t10, zzgviVar, zzgvu.zza);
    }

    static <T extends zzgwk<T, ?>> T zzbz(T t10, zzgvi zzgviVar, zzgvu zzgvuVar) throws zzgwz {
        T t11 = (T) t10.zzbj();
        try {
            zzgyo zzb2 = zzgyf.zza().zzb(t11.getClass());
            zzb2.zzh(t11, zzgvj.zzq(zzgviVar), zzgvuVar);
            zzb2.zzf(t11);
            return t11;
        } catch (zzgwz e8) {
            if (e8.zzb()) {
                throw new zzgwz(e8);
            }
            throw e8;
        } catch (zzgyz e10) {
            throw e10.zza();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzgwz) {
                throw ((zzgwz) e11.getCause());
            }
            throw new zzgwz(e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzgwz) {
                throw ((zzgwz) e12.getCause());
            }
            throw e12;
        }
    }

    private int zzc(zzgyo<?> zzgyoVar) {
        if (zzgyoVar == null) {
            return zzgyf.zza().zzb(getClass()).zza(this);
        }
        return zzgyoVar.zza(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzgwg<MessageType, BuilderType>, BuilderType, T> zzgwi<MessageType, T> zzd(zzgvs<MessageType, T> zzgvsVar) {
        return (zzgwi) zzgvsVar;
    }

    private static <T extends zzgwk<T, ?>> T zzf(T t10) throws zzgwz {
        if (t10 == null || t10.zzbw()) {
            return t10;
        }
        throw t10.zzaP().zza();
    }

    private static <T extends zzgwk<T, ?>> T zzg(T t10, InputStream inputStream, zzgvu zzgvuVar) throws zzgwz {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzgvi zzG = zzgvi.zzG(new zzguj(inputStream, zzgvi.zzE(read, inputStream)), CodedOutputStream.DEFAULT_BUFFER_SIZE);
            T t11 = (T) zzbz(t10, zzG, zzgvuVar);
            try {
                zzG.zzy(0);
                return t11;
            } catch (zzgwz e8) {
                throw e8;
            }
        } catch (zzgwz e10) {
            if (e10.zzb()) {
                throw new zzgwz(e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new zzgwz(e11);
        }
    }

    private static <T extends zzgwk<T, ?>> T zzh(T t10, zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        zzgvi zzl = zzgvcVar.zzl();
        T t11 = (T) zzbz(t10, zzl, zzgvuVar);
        try {
            zzl.zzy(0);
            return t11;
        } catch (zzgwz e8) {
            throw e8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzgwk<T, ?>> T zzi(T t10, byte[] bArr, int i10, int i11, zzgvu zzgvuVar) throws zzgwz {
        if (i11 == 0) {
            return t10;
        }
        T t11 = (T) t10.zzbj();
        try {
            zzgyo zzb2 = zzgyf.zza().zzb(t11.getClass());
            zzb2.zzi(t11, bArr, i10, i10 + i11, new zzguq(zzgvuVar));
            zzb2.zzf(t11);
            return t11;
        } catch (zzgwz e8) {
            if (e8.zzb()) {
                throw new zzgwz(e8);
            }
            throw e8;
        } catch (zzgyz e10) {
            throw e10.zza();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzgwz) {
                throw ((zzgwz) e11.getCause());
            }
            throw new zzgwz(e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzj() {
        if (this.zzt == zzgzb.zzc()) {
            this.zzt = zzgzb.zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzgwk<T, ?>> boolean zzk(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.zzdc(zzgwj.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzgyf.zza().zzb(t10.getClass()).zzl(t10);
        if (z10) {
            t10.zzdc(zzgwj.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : t10, null);
        }
        return zzl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgyf.zza().zzb(getClass()).zzk(this, (zzgwk) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzcd()) {
            return zzaW();
        }
        if (zzcc()) {
            zzca(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzgxx.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgul
    public int zzaL() {
        return this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgul
    public int zzaM(zzgyo zzgyoVar) {
        if (!zzcd()) {
            if (zzaL() != Integer.MAX_VALUE) {
                return zzaL();
            }
            int zzc2 = zzc(zzgyoVar);
            zzaS(zzc2);
            return zzc2;
        }
        int zzc3 = zzc(zzgyoVar);
        if (zzc3 >= 0) {
            return zzc3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zzc3);
    }

    @Override // com.google.android.gms.internal.ads.zzgul
    public zzgya zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgul
    public void zzaS(int i10) {
        if (i10 >= 0) {
            this.zzd = i10 | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    int zzaW() {
        return zzgyf.zza().zzb(getClass()).zzb(this);
    }

    int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public int zzaY() {
        return zzaM(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzgwk<MessageType, BuilderType>, BuilderType extends zzgwe<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzdc(zzgwj.NEW_BUILDER, null, null);
    }

    public final zzgyd<MessageType> zzbN() {
        return (zzgyd) zzdc(zzgwj.GET_PARSER, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object zzbO() throws Exception {
        return zzdc(zzgwj.BUILD_MESSAGE_INFO, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzbS() {
        this.zzq = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzbT() {
        zzaS(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzbU() {
        zzgyf.zza().zzb(getClass()).zzf(this);
        zzbV();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzbV() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    protected void zzbW(int i10, zzgvc zzgvcVar) {
        zzj();
        zzgzb zzgzbVar = this.zzt;
        zzgzbVar.zzg();
        if (i10 != 0) {
            zzgzbVar.zzj((i10 << 3) | 2, zzgvcVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    protected final void zzbX(zzgzb zzgzbVar) {
        this.zzt = zzgzb.zze(this.zzt, zzgzbVar);
    }

    protected void zzbY(int i10, int i11) {
        zzj();
        zzgzb zzgzbVar = this.zzt;
        zzgzbVar.zzg();
        if (i10 != 0) {
            zzgzbVar.zzj(i10 << 3, Long.valueOf(i11));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzgwk<MessageType, BuilderType>, BuilderType extends zzgwe<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType zzaZ = zzaZ();
        zzaZ.zzbj(messagetype);
        return zzaZ;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zzbb */
    public final BuilderType zzcX() {
        return (BuilderType) zzdc(zzgwj.NEW_BUILDER, null, null);
    }

    /* renamed from: zzbc */
    public final BuilderType zzbM() {
        BuilderType buildertype = (BuilderType) zzdc(zzgwj.NEW_BUILDER, null, null);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    /* renamed from: zzbi */
    public final MessageType zzbt() {
        return (MessageType) zzdc(zzgwj.GET_DEFAULT_INSTANCE, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageType zzbj() {
        return (MessageType) zzdc(zzgwj.NEW_MUTABLE_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    public final boolean zzbw() {
        return zzk(this, true);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public void zzcY(zzgvp zzgvpVar) throws IOException {
        zzgyf.zza().zzb(getClass()).zzj(this, zzgvq.zza(zzgvpVar));
    }

    void zzca(int i10) {
        this.zzq = i10;
    }

    boolean zzcc() {
        return zzaX() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean zzcd() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected boolean zzce(int i10, zzgvi zzgviVar) throws IOException {
        if ((i10 & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i10, zzgviVar);
    }

    protected abstract Object zzdc(zzgwj zzgwjVar, Object obj, Object obj2);
}
