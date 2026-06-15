package com.google.android.gms.internal.ads;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgxb {
    public static final zzgxb zza;
    public static final zzgxb zzb;
    public static final zzgxb zzc;
    public static final zzgxb zzd;
    public static final zzgxb zze;
    public static final zzgxb zzf;
    public static final zzgxb zzg;
    public static final zzgxb zzh;
    public static final zzgxb zzi;
    public static final zzgxb zzj;
    private static final /* synthetic */ zzgxb[] zzk;
    private final Class zzl;

    static {
        zzgxb zzgxbVar = new zzgxb("VOID", 0, Void.class, Void.class, null);
        zza = zzgxbVar;
        Class cls = Integer.TYPE;
        zzgxb zzgxbVar2 = new zzgxb("INT", 1, cls, Integer.class, 0);
        zzb = zzgxbVar2;
        zzgxb zzgxbVar3 = new zzgxb("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgxbVar3;
        zzgxb zzgxbVar4 = new zzgxb("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgxbVar4;
        zzgxb zzgxbVar5 = new zzgxb("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgxbVar5;
        zzgxb zzgxbVar6 = new zzgxb("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgxbVar6;
        zzgxb zzgxbVar7 = new zzgxb("STRING", 6, String.class, String.class, "");
        zzg = zzgxbVar7;
        zzgxb zzgxbVar8 = new zzgxb("BYTE_STRING", 7, zzgvc.class, zzgvc.class, zzgvc.zzb);
        zzh = zzgxbVar8;
        zzgxb zzgxbVar9 = new zzgxb("ENUM", 8, cls, Integer.class, null);
        zzi = zzgxbVar9;
        zzgxb zzgxbVar10 = new zzgxb("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgxbVar10;
        zzk = new zzgxb[]{zzgxbVar, zzgxbVar2, zzgxbVar3, zzgxbVar4, zzgxbVar5, zzgxbVar6, zzgxbVar7, zzgxbVar8, zzgxbVar9, zzgxbVar10};
    }

    private zzgxb(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzgxb[] values() {
        return (zzgxb[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
