package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwe;
import com.google.android.gms.internal.ads.zzgwk;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzgwe<MessageType extends zzgwk<MessageType, BuilderType>, BuilderType extends zzgwe<MessageType, BuilderType>> extends zzguk<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgwe(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzcd()) {
            this.zza = zza();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzgyf.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzguk
    protected /* bridge */ /* synthetic */ zzguk zzaD(zzgul zzgulVar) {
        zzbi((zzgwk) zzgulVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    public /* bridge */ /* synthetic */ zzguk zzaK(zzgvi zzgviVar, zzgvu zzgvuVar) throws IOException {
        zzbk(zzgviVar, zzgvuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    public /* bridge */ /* synthetic */ zzguk zzaN(byte[] bArr, int i10, int i11) throws zzgwz {
        zzbl(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    public /* bridge */ /* synthetic */ zzguk zzaO(byte[] bArr, int i10, int i11, zzgvu zzgvuVar) throws zzgwz {
        zzbm(bArr, i10, i11, zzgvuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    public /* bridge */ /* synthetic */ zzgxu zzaW(zzgvi zzgviVar, zzgvu zzgvuVar) throws IOException {
        zzbk(zzgviVar, zzgvuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    public /* bridge */ /* synthetic */ zzgxu zzaZ(byte[] bArr, int i10, int i11) throws zzgwz {
        zzbl(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    public /* bridge */ /* synthetic */ zzgxu zzba(byte[] bArr, int i10, int i11, zzgvu zzgvuVar) throws zzgwz {
        zzbm(bArr, i10, i11, zzgvuVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (!this.zzb.zzcd()) {
            this.zza = zza();
            return this;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    /* renamed from: zzbh */
    public BuilderType zzaP() {
        BuilderType buildertype = (BuilderType) zzbt().zzcX();
        buildertype.zza = zzbs();
        return buildertype;
    }

    protected BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(zzgvi zzgviVar, zzgvu zzgvuVar) throws IOException {
        zzbu();
        try {
            zzgyf.zza().zzb(this.zza.getClass()).zzh(this.zza, zzgvj.zzq(zzgviVar), zzgvuVar);
            return this;
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof IOException) {
                throw ((IOException) e8.getCause());
            }
            throw e8;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i10, int i11) throws zzgwz {
        int i12 = zzgvu.zzb;
        int i13 = zzgyf.zza;
        zzbm(bArr, i10, i11, zzgvu.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i10, int i11, zzgvu zzgvuVar) throws zzgwz {
        zzbu();
        try {
            zzgyf.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i10, i10 + i11, new zzguq(zzgvuVar));
            return this;
        } catch (zzgwz e8) {
            throw e8;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* renamed from: zzbn */
    public final MessageType zzbr() {
        MessageType zzbs = zzbs();
        if (zzbs.zzbw()) {
            return zzbs;
        }
        throw zzguk.zzbb(zzbs);
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    /* renamed from: zzbo */
    public MessageType zzbs() {
        if (this.zza.zzcd()) {
            this.zza.zzbU();
            return this.zza;
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    /* renamed from: zzbp */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzgxu zzbq() {
        zzbg();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzbu() {
        if (this.zza.zzcd()) {
            return;
        }
        zzbv();
    }

    protected void zzbv() {
        MessageType zza = zza();
        zzb(zza, this.zza);
        this.zza = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    public final boolean zzbw() {
        boolean zzk;
        zzk = zzgwk.zzk(this.zza, false);
        return zzk;
    }
}
