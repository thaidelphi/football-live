package com.google.android.gms.internal.common;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzae extends zzz {
    private final zzag zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(zzag zzagVar, int i10) {
        super(zzagVar.size(), i10);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
