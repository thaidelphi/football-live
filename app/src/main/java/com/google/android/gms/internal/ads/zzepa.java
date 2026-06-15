package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzepa implements zzerw {
    private final Context zza;
    private final zzgba zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepa(zzgba zzgbaVar, Context context) {
        this.zzb = zzgbaVar;
        this.zza = context;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Unknown Source)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static /* synthetic */ com.google.android.gms.internal.ads.zzepb zzc(com.google.android.gms.internal.ads.zzepa r1) {
        /*
            com.google.android.gms.internal.ads.zzepb r0 = new com.google.android.gms.internal.ads.zzepb
            com.google.android.gms.ads.internal.zzv.zzq()
            android.content.Context r1 = r1.zza
            java.lang.Integer r1 = com.google.android.gms.ads.internal.util.zzs.zzt(r1)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepa.zzc(com.google.android.gms.internal.ads.zzepa):com.google.android.gms.internal.ads.zzepb");
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoz
            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.internal.ads.zzepa.zzc(com.google.android.gms.internal.ads.zzepa):com.google.android.gms.internal.ads.zzepb
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Unknown Source)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                /*
                    r1 = this;
                    com.google.android.gms.internal.ads.zzepa r0 = com.google.android.gms.internal.ads.zzepa.this
                    com.google.android.gms.internal.ads.zzepb r0 = com.google.android.gms.internal.ads.zzepa.zzc(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeoz.call():java.lang.Object");
            }
        });
    }
}
